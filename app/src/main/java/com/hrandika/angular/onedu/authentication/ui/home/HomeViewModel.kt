package com.hrandika.angular.onedu.authentication.ui.home

import android.view.View
import androidx.lifecycle.ViewModel
import com.hrandika.angular.onedu.authentication.data.repositories.UserRepository
import net.authentication.utils.startLoginActivity

class HomeViewModel(
    private val repository: UserRepository
) : ViewModel() {

    val user by lazy {
        repository.currentUser()
    }
    
    fun logout(view: View){
        repository.logout()
        view.context.startLoginActivity()
    }
}
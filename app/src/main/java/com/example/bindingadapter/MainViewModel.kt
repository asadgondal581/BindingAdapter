package com.example.bindingadapter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val user = MutableLiveData<UserInfo>()
    init {

        user.value = UserInfo("Asad Nazee Gondal","https://bit.ly/2zpY4w4")


    }
}
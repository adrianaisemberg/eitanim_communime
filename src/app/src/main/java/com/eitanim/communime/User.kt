package com.eitanim.communime

import android.content.IntentFilter.create

var _userId: String = ""
var _userName: String = ""
var _userPassword: String = ""


class User(userId: String, userName: String, userPassword: String) {
//    val currentUser = User.create("yp", "yp", "yp")

    var _userId: String = userId
    var _userName: String = userName
    var _userPassword: String = userPassword

    fun getId(): String{
        return _userId
    }

    fun userName(): String{
        return _userName
    }

    fun getPassword(): String{
        return _userPassword
    }

    public fun changeUserId(new_userId: String){
        _userId = new_userId
    }

    public fun changeUserName(new_userName: String){
        _userName = new_userName
    }

    public fun changePassword(new_userPassword: String){
        _userPassword = new_userPassword
    }
}
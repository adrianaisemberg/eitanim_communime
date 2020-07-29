package com.eitanim.communime

object CurrentUser {
    private val userPassword: String = ""
    private var userName: String = ""
    private val userEmail: String = ""
    private val userId: String = ""

    var _userId: String = userId
    var _userName: String = userName
    var _userPassword: String = userPassword
    var _userEmail: String = userEmail

    fun getId(): String{
        return _userId
    }

    fun getEmail(): String{
        return _userEmail
    }

    fun getName(): String{
        return _userName
    }

    fun getPassword(): String{
        return _userPassword
    }

    public fun changeId(new_userId: String){
        _userId = new_userId
    }

    public fun changeEmail(new_userId: String){
        _userId = new_userId
    }

    public fun changeName(new_userName: String){
        _userName = new_userName
    }

    public fun changePassword(new_userPassword: String){
        _userPassword = new_userPassword
    }
}
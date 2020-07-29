package com.eitanim.communime

import android.content.Context

class MyPreference (context: Context){

    val PREFERENCE_NAME = "SharedPreferenceExample"
    val PREFERENCE_USER_ID = "USerID"

    val preference = context.getSharedPreferences(PREFERENCE_NAME,Context.MODE_PRIVATE)

    fun getUserId() : String{
        return preference.getString(PREFERENCE_USER_ID, "")!!
    }

    fun setUserId(userId:String){
        val editor = preference.edit()
        editor.putString(PREFERENCE_USER_ID, userId)
        editor.apply()
    }
}

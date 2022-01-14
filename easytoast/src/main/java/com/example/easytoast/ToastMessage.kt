package com.example.easytoast

import android.content.Context
import android.widget.Toast

class ToastMessage {
    companion object{
        fun toastShort(context:Context,message:String){
            Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
        }

        fun toastLong(context: Context,message: String){
            Toast.makeText(context,message,Toast.LENGTH_LONG).show()


        }

    }
}
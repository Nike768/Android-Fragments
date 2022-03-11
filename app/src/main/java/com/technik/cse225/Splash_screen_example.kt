package com.technik.cse225

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Splash_screen_example : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen_example)

        Handler(Looper.getMainLooper()).postDelayed(

            {
                val i = Intent(this,Splash_screen_main::class.java)
                startActivity(i)
                finish()
            }, 5000)
    }
}
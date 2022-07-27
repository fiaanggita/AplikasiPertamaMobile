package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val intent = Intent (this@MainActivity,DetailActivity::class.java)
//        startActivity(intent)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, LinearActivity2::class.java))
            finishAffinity()
        }, 2000)
    }

}
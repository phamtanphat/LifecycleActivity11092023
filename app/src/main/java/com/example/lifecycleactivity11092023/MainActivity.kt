package com.example.lifecycleactivity11092023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnNavigateMain2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("pphat", "Main: onCreate")

        btnNavigateMain2 = findViewById(R.id.button_navigate_main2)

        btnNavigateMain2.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("pphat", "Main: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("pphat", "Main: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("pphat", "Main: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("pphat", "Main: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("pphat", "Main: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("pphat", "Main: onDestroy")
    }
}
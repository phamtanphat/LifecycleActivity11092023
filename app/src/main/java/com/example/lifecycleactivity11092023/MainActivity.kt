package com.example.lifecycleactivity11092023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("pphat", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("pphat", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("pphat", "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("pphat", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("pphat", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("pphat", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("pphat", "onDestroy")
    }
}
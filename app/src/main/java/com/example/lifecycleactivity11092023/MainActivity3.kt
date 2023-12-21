package com.example.lifecycleactivity11092023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        Log.d("pphat", "Main3: onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("pphat", "Main3: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("pphat", "Main3: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("pphat", "Main3: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("pphat", "Main3: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("pphat", "Main3: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("pphat", "Main3: onDestroy")
    }
}
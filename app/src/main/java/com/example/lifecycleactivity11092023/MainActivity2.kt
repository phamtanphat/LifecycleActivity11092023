package com.example.lifecycleactivity11092023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    private lateinit var btnNavigateMain3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d("pphat", "Main2: onCreate")
        btnNavigateMain3 = findViewById(R.id.button_navigate_main3)

        btnNavigateMain3.setOnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity3::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("pphat", "Main2: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("pphat", "Main2: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("pphat", "Main2: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("pphat", "Main2: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("pphat", "Main2: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("pphat", "Main2: onDestroy")
    }
}
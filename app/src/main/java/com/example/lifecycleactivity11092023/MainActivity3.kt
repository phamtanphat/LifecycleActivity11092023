package com.example.lifecycleactivity11092023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {

    private lateinit var btnNavigateMain3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        btnNavigateMain3 = findViewById(R.id.button_navigate_main3)
        btnNavigateMain3.setOnClickListener {
          val intent = Intent(this@MainActivity3, MainActivity::class.java)
          intent.putExtra("text", "hello")
          startActivity(intent)
        }

        Log.d("pphat", "Main3: onCreate")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, intent?.getStringExtra("text"), Toast.LENGTH_SHORT).show()
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
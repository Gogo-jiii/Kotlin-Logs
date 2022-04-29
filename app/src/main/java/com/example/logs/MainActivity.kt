package com.example.logs

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "IT Wala...")
        Log.e(TAG, "IT Wala...")
        Log.i(TAG, "IT Wala...")
        Log.v(TAG, "IT Wala...")
        Log.w(TAG, "IT Wala...")
    }

    companion object {
        private val TAG = MainActivity::class.java.name + " : "
    }
}
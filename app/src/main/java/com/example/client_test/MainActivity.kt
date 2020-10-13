package com.example.client_test

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



public class MainActivity : AppCompatActivity() {

    val connectBtn = findViewById<Button>(R.id.connect)
    val disconnectBtn = findViewById<Button>(R.id.disconnect)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        connectBtn.setOnClickListener{

        }
        disconnectBtn.setOnClickListener{
        }
    }


}
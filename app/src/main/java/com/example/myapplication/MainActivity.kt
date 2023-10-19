package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.nio.channels.InterruptedByTimeoutException

class MainActivity : AppCompatActivity() {

    lateinit var etName: EditText
    lateinit var btHi: Button
    lateinit var tvR: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.etName)
        btHi = findViewById(R.id.btHi)
        tvR = findViewById(R.id.tvR)

        btHi.setOnClickListener {
            tvR.text = "你好" + etName.text
        }
    }
}
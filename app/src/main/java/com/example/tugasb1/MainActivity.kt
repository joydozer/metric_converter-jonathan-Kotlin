package com.example.tugasb1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    private lateinit var spOriginal: Spinner
    private lateinit var spConvert: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spOriginal = findViewById(R.id.spOriginal)
        spOriginal.isEnabled = false

        spConvert = findViewById(R.id.spConvert)
        spConvert.isEnabled = false
    }
}
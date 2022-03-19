package com.example.hwweek4_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showStorageLocation(view: View) {

        var txtResult : TextView = findViewById<TextView>(R.id.textResult)
        val result = Environment.getExternalStorageDirectory()

        view.setOnClickListener {
            txtResult.setText("External files are stored at  ${result.absolutePath}")
        }

    }
}
package com.example.responsi1759

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_Start: Button = findViewById(R.id.btn_Start)
        btn_Start.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_Start -> {
                val intentBtnstart = Intent(this@MainActivity, HomeActivity::class.java)
                startActivity(intentBtnstart)
            }

        }

    }
}
package com.example.my_helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnCalculateBmi:Button
    lateinit var btnSendMoney:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalculateBmi = findViewById(R.id.btnCalculateBmi)
        btnCalculateBmi.setOnClickListener {
            val intent=Intent(this,btmCalculate::class.java)
            startActivity(intent)
        }
        btnSendMoney = findViewById(R.id.btnSendMoney)
        btnSendMoney.setOnClickListener {
            var intent = Intent(this,SendMoney::class.java)
            startActivity(intent)
        }
    }
}
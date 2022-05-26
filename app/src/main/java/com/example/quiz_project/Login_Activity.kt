package com.example.quiz_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Login_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn_login: Button = findViewById(R.id.btn_login)
        val tv_acc: TextView = findViewById(R.id.tv_acc)

        btn_login.setOnClickListener{
            val intent = Intent(this, Stand_Activity::class.java)
            startActivity(intent)
            finish()

        }

        tv_acc.setOnClickListener{
            val intent = Intent(this, Reg_Activity::class.java)
            startActivity(intent)
            finish()

        }
    }
}
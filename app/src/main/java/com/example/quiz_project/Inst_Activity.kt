package com.example.quiz_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Inst_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inst)

        val btn_back3: Button = findViewById(R.id.btn_back3)
        val btn_next3: Button = findViewById(R.id.btn_next3)

        btn_back3.setOnClickListener {
            val intent = Intent(this, SelectSub_Activity::class.java)
            startActivity(intent)
            finish()
        }
        btn_next3.setOnClickListener {
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
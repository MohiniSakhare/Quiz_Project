package com.example.quiz_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Reg_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)

        val btn_back2: ImageButton = findViewById(R.id.btn_back2)
        val btn_reg: Button = findViewById(R.id.btn_reg)



        btn_back2.setOnClickListener {
            val intent = Intent(this, Login_Activity::class.java)
            startActivity(intent)
            finish()

        }

            btn_reg.setOnClickListener {

                Toast.makeText(this, "Your Account is Successfully Created",Toast.LENGTH_LONG).show();

                val intent1 = Intent(this, Login_Activity::class.java)
                startActivity(intent1)
                finish()

            }

    }
}
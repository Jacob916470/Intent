package com.jacob.intent

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity
import com.google.android.material.button.MaterialButton

class DashBoard : AppCompatActivity() {

    companion object{
        fun launch(context : Context){
            val intent = Intent(context,DashBoard::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)
        val button = findViewById<MaterialButton>(R.id.sendHomeButton)
        button.setOnClickListener{
            HomeActivity.launch(this,"Jacob,DashBoard")
        }
    }
}
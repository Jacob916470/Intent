package com.jacob.intent


import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    companion object{
        fun launch(context : Context){
            val intent = Intent(context,MainActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<MaterialButton>(R.id.sendButton)
        val dashButton = findViewById<MaterialButton>(R.id.dashButton)
        val sendTwoButton = findViewById<MaterialButton>(R.id.sendTwoButton)
        button.setOnClickListener {
            HomeActivity.launch(this,"Jacob")
        }
        dashButton.setOnClickListener {
            DashBoard.launch(this)
        }
        /**Intent implicito, acción que no viene de la aplicación*/
        sendTwoButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT,"Hello world")
            startActivity(intent)
        }
    }
}
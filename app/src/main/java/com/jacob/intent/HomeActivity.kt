package com.jacob.intent

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class HomeActivity : AppCompatActivity(), View.OnClickListener {

    var userNameIntent : String? = ""

    companion object{
        const val NAME_U = "name"
        fun launch(context: Context,userName : String){
            val intent = Intent(context,HomeActivity::class.java)
            intent.putExtra(NAME_U,userName)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        userNameIntent = intent.getStringExtra(NAME_U)
        Toast.makeText(this, "Bienvenido: $userNameIntent", Toast.LENGTH_LONG).show()
        /**Conectamos vista y codigó con nuestro archivo .kt*/
        val button = findViewById<MaterialButton>(R.id.backButton)
        val dashButton = findViewById<MaterialButton>(R.id.dashBoardButton)
        /**Escuchamos la acción de la vista*/
        button.setOnClickListener(this)
        dashButton.setOnClickListener(this)
        /**Lambda*/
       /* dashButton.setOnClickListener{
            DashBoard.launch(this)
        }*/

    }

    /**Validamos vista*/
    override fun onClick(view: View?) {
        when(view?.id){
            /**Heredamos el evento a la clase completa*/
            R.id.backButton->{
                MainActivity.launch(this)
            }
            R.id.dashBoardButton->{
                DashBoard.launch(this)
            }
        }
    }

}
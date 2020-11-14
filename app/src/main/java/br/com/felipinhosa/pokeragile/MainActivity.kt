package br.com.felipinhosa.pokeragile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val splashName = findViewById<ImageView>(R.id.splash_name)
        splashName.postDelayed({
            val homeActivity = Intent(this, HomeActivity::class.java)
            startActivity(homeActivity)
            finish()
        }, 3000)
    }




}
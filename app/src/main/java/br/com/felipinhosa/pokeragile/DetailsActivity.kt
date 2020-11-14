package br.com.felipinhosa.pokeragile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)


        val textvalue = intent.getStringExtra("valuekey")
        val drawableIndentifier = intent.getIntExtra("imgonekey", 0)

        if(textvalue != null){
            textMostrar.text = textvalue
            imgMostrar.visibility = View.GONE
            textMostrar.visibility = View.VISIBLE
        } else if(drawableIndentifier != 0){
            imgMostrar.setImageResource(drawableIndentifier)

            textMostrar.visibility = View.GONE
            imgMostrar.visibility = View.VISIBLE
        }

    }
}
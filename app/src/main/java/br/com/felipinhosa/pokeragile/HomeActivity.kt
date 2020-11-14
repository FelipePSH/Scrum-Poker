package br.com.felipinhosa.pokeragile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        textZero.setOnClickListener {
            getValueAndOpenDetailScreen(it)
        }
        textMeio.setOnClickListener {
            getValueAndOpenDetailScreen(it)
        }
        textUm.setOnClickListener {
            getValueAndOpenDetailScreen(it)
        }
        textDois.setOnClickListener {
            getValueAndOpenDetailScreen(it)
        }
        textTres.setOnClickListener {
            getValueAndOpenDetailScreen(it)
        }
        textCinco.setOnClickListener {
            getValueAndOpenDetailScreen(it)
        }
        textOito.setOnClickListener {
            getValueAndOpenDetailScreen(it)
        }
        textTreze.setOnClickListener {
            getValueAndOpenDetailScreen(it)
        }
        textVinte.setOnClickListener {
            getValueAndOpenDetailScreen(it)
        }
        textQuarenta.setOnClickListener {
            getValueAndOpenDetailScreen(it)
        }
        textCem.setOnClickListener {
            getValueAndOpenDetailScreen(it)
        }
        textInfinito.setOnClickListener {
            getValueAndOpenDetailScreen(it)
        }
        textInterrogacao.setOnClickListener {
            getValueAndOpenDetailScreen(it)
        }
        textCoffe.setOnClickListener {
            getValueAndOpenDetailScreen(it)
        }
    }

    fun getValueAndOpenDetailScreen(view: View) {
        val intent = Intent(this, DetailsActivity::class.java)

        if (view is TextView) {
            val textView = view as TextView
            val value = textView.text

            intent.putExtra("valuekey", value)
        } else if (view is ImageView) {

            if (view.id == R.id.textCoffe) {
                intent.putExtra(
                        "imgonekey",
                        resources.getIdentifier("ic_coffe_cup", "drawable", this.packageName)
                )
            } else if (view.id == R.id.textInfinito) {
                intent.putExtra(
                        "imgonekey",
                        resources.getIdentifier("ic_infinity", "drawable", this.packageName)
                )
            }
        }
        startActivity(intent)
    }
}

package com.azael.ia1

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setBackgroundColor(Color.rgb(15, 18, 35))
        layout.setPadding(30, 30, 30, 30)

        val titulo = TextView(this)
        titulo.text = "AZAEL.IA1"
        titulo.textSize = 36f
        titulo.setTextColor(Color.WHITE)
        titulo.gravity = Gravity.CENTER

        val descricao = TextView(this)
        descricao.text = "Sua inteligência artificial pessoal"
        descricao.textSize = 18f
        descricao.setTextColor(Color.LTGRAY)
        descricao.gravity = Gravity.CENTER

        layout.addView(titulo)
        layout.addView(descricao)

        setContentView(layout)
    }
}

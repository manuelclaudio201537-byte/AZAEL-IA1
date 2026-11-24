
package com.azael.ia1

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Button
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(30, 40, 30, 40)
        layout.setBackgroundColor(Color.rgb(15, 18, 35))

        val title = TextView(this)
        title.text = "AZAEL.IA1"
        title.textSize = 36f
        title.gravity = Gravity.CENTER
        title.setTextColor(Color.WHITE)
        layout.addView(title)

        val subtitle = TextView(this)
        subtitle.text = "Sua inteligência artificial criativa"
        subtitle.textSize = 16f
        subtitle.gravity = Gravity.CENTER
        subtitle.setTextColor(Color.LTGRAY)
        layout.addView(subtitle)

        val features = listOf(
            "Criar imagens com IA",
            "Gerar vídeos com IA",
            "Animar fotografias"
        )

        features.forEach { feature ->
            val button = Button(this)
            button.text = feature
            button.setOnClickListener {
                Toast.makeText(
                    this,
                    "Recurso em desenvolvimento",
                    Toast.LENGTH_SHORT
                ).show()
            }
            layout.addView(button)
        }

        setContentView(layout)
    }
}

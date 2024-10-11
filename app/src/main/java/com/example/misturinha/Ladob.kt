package com.example.misturinha

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class Ladob : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ladob)

        val resultText: TextView = findViewById(R.id.resultadoText)
        val misturaImage: ImageView = findViewById(R.id.resultadoImage)
        val novaMisturaButton: Button = findViewById(R.id.button) // Referência ao botão

        val result = intent.getStringExtra("result")
        val imageResId = intent.getIntExtra("imageResId", 0)

        resultText.text = result

        if (result != null && result.contains("perigosa", ignoreCase = true)) {
            Glide.with(this)
                .asGif()
                .load(R.raw.caixao)
                .into(misturaImage)
            misturaImage.visibility = ImageView.VISIBLE
        } else if (imageResId != 0) {
            misturaImage.setImageResource(imageResId)
            misturaImage.visibility = ImageView.VISIBLE
        } else {
            misturaImage.visibility = ImageView.GONE
        }

        novaMisturaButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}

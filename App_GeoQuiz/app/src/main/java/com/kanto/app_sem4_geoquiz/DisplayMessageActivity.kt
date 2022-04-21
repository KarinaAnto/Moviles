package com.kanto.app_sem4_geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val message = intent.getStringExtra(EXTRA_MESS)
        val textView = findViewById<TextView>(R.id.tvScore).apply {
            if (message==(20).toString())
                text="20 PUNTOS ¡PERFECTO!"
            else
                text="Conseguiste "+message+" puntos"
        }
    }
}
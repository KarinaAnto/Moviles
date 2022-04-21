package com.kanto.app_sem4_geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var questions: ArrayList<Question>
    var position = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadQuestions()

        setupViews()
    }
    fun loadQuestions(){
        questions = ArrayList()
        // var question = Question("¿Es Arica la capital de Bolivia?",false)
        questions.add( Question("¿Es Arica la capital de Bolivia?",false))
        questions.add( Question("¿Es Lima la capital de Perú?",true))
        questions.add( Question("¿Es Santiago la capital de Lima?",false))
        questions.add( Question("¿Es Santiago la capital de Chile?",true))
        questions.add( Question("¿Es La Paz la capital de Brasil?",false))
    }
    fun setupViews(){
        val btYes = findViewById<Button>(R.id.btYes)
        val btNo = findViewById<Button>(R.id.btNo)
        val btNext = findViewById<Button>(R.id.btNext)
        val tvQuestion = findViewById<TextView>(R.id.tvQuestion)

        showSentence(tvQuestion)

        btYes.setOnClickListener {
            if (questions[position].answer) {
                Toast.makeText(this, "Correcto", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Incorrecto", Toast.LENGTH_LONG).show()
            }
        }
        btNo.setOnClickListener {
            if (!questions[position].answer) {
                Toast.makeText(this, "Correcto", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Incorrecto", Toast.LENGTH_LONG).show()
            }
        }
        btNext.setOnClickListener {
            position++
            showSentence(tvQuestion)
        }
    }

    private fun showSentence(tvQuestion: TextView) {
        tvQuestion.text = questions[position].sentence
    }
}
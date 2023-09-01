package com.example.singeloperationcalculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var resultTextView: TextView
    lateinit var firstNumberButton: Button
    lateinit var secondNumberButton: Button
    lateinit var equalButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultTextView=findViewById(R.id.result)
        firstNumberButton=findViewById(R.id.firstNumber)
        secondNumberButton=findViewById(R.id.secondNumber)
        equalButton=findViewById(R.id.equal)
    }

    fun click(view: View) {
        val button = view as Button
        val currentText = resultTextView.text.toString()
        resultTextView.text = currentText + button.text.toString()
    }

    fun equal(view: View) {

        val text = resultTextView.text
        val numbers = text.split("+")
        val firstNumber=numbers[0].toInt()
        val secondNumber=numbers[1].toInt()
        val sum = firstNumber+secondNumber
        resultTextView.text = sum.toString()



    }
    }
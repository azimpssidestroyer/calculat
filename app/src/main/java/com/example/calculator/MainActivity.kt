
package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var firstNumber: EditText
    lateinit var symbol: EditText
    lateinit var secondNumber: EditText

    lateinit var button: Button

    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        firstNumber = findViewById(R.id.firstNumber)
        symbol = findViewById(R.id.symbol)
        secondNumber = findViewById(R.id.secondNumber)

        button = findViewById(R.id.resultBtn)

        result = findViewById(R.id.result)

        button.setOnClickListener {
            result.text = getResult()
        }
    }


    fun getResult(): String {
        val fNumber = firstNumber.text.toString().toInt()
        val sNumber = secondNumber.text.toString().toInt()
        val symb = symbol.text.toString()

        if(symb == "?"){
            if(fNumber > sNumber){
                return("The first Number is greater than second number").toString()
            }
            if (fNumber <sNumber) {
                return ("Second number is greater than first number").toString()
            }
            if (fNumber == sNumber) {
                return ("The first number is equal to the second number").toString()
            }
        }
        if (symb == "+") {
            return (fNumber + sNumber).toString()
        }
        if (symb == "-") {
            return (fNumber - sNumber).toString()
        }
        if (symb == "*") {
            return (fNumber * sNumber).toString()
        }
        if (symb == "/") {
            return (fNumber / sNumber).toString()
        }


        return "Do not have result"
    }
}

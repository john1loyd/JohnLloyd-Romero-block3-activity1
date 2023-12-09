package com.romero.johnlloyd.block3.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var etFirstNumber: EditText
    private lateinit var etSecondNumber: EditText
    private lateinit var tvShowArithmetic: TextView
    private lateinit var tvAnswer: TextView
    private lateinit var btPlus: Button
    private lateinit var btMinus: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etFirstNumber = findViewById(R.id.et_firstNumber)
        etSecondNumber = findViewById(R.id.et_secondNumber)
        tvShowArithmetic = findViewById(R.id.tv_showArithmetic)
        tvAnswer = findViewById(R.id.tv_answer)
        btPlus = findViewById(R.id.bt_plus)
        btMinus = findViewById(R.id.bt_minus)

        val btEqual: Button = findViewById(R.id.bt_equal)

        btPlus.setOnClickListener {

            tvShowArithmetic.text = "+"
        }


        btMinus.setOnClickListener {
            tvShowArithmetic.text = "-"
        }

        btEqual.setOnClickListener {

            val num1Str = etFirstNumber.text.toString()
            val num2Str = etSecondNumber.text.toString()


            if (num1Str.isNotEmpty() && num2Str.isNotEmpty()) {
                val num1 = num1Str.toInt()
                val num2 = num2Str.toInt()

                if (tvShowArithmetic.text == "+") {
                    val sum = num1 + num2
                    tvAnswer.text = sum.toString()
                } else if (tvShowArithmetic.text == "-") {
                    val difference = num1 - num2
                    tvAnswer.text = difference.toString()
                }
            }
        }
    }

}
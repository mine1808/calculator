package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity()

    lateinit var solutionTv : TextView
    lateinit var resultTv : TextView
    lateinit var button_c : Button
    lateinit var button_open_bracket : Button
    lateinit var button_close_bracket : Button
    lateinit var button_divide : Button
    lateinit var button_7 : Button
    lateinit var button_8 : Button
    lateinit var button_9 : Button
    lateinit var button_multiply : Button
    lateinit var button_4 : Button
    lateinit var button_5 : Button
    lateinit var button_6 : Button
    lateinit var button_plus : Button
    lateinit var button_1 : Button
    lateinit var button_2 : Button
    lateinit var button_3 : Button
    lateinit var button_minus : Button
    lateinit var button_ac : Button
    lateinit var button_0 : Button
    lateinit var button_dot : Button
    lateinit var button_equals : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


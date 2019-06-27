package com.example.tic_tac_toe

import android.app.AlertDialog
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.reflect.Array

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var OP = 0
        var PL = 0
        var score1 = 0
        var score2 = 0
        //var count = 0

        var buttons = arrayOf(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
        //var array1 = arrayOf(0,0,0,0,0,0,0,0,0)
        for (i in 0..8){
            buttons[i].text = ""
        }

        for(j in 0..8){

            buttons[j].setOnClickListener {

                if(buttons[j].text != "") {
                    return@setOnClickListener
                }

                if(PL == 0){
                    buttons[j].text = "⭕"
                    PL = 1
                }
                else {
                    buttons[j].text = "❌"
                    PL = 0
                }

                if((btn1.text == "⭕" && btn2.text == "⭕" && btn3.text == "⭕") || (btn4.text == "⭕" && btn5.text == "⭕" && btn6.text == "⭕") ||
                    (btn7.text == "⭕" && btn8.text == "⭕" && btn9.text == "⭕") || (btn1.text == "⭕" && btn5.text == "⭕" && btn9.text == "⭕") ||
                    (btn3.text == "⭕" && btn5.text == "⭕" && btn7.text == "⭕") || (btn1.text == "⭕" && btn4.text == "⭕" && btn7.text == "⭕") ||
                    (btn2.text == "⭕" && btn5.text == "⭕" && btn8.text == "⭕") || (btn3.text == "⭕" && btn6.text == "⭕" && btn9.text == "⭕") ){

                    Toast.makeText(this,"⭕  player won",Toast.LENGTH_SHORT).show()
                    score1++
                    scp1.text = score1.toString()
                    return@setOnClickListener

                }
                else  if((btn1.text == "❌" && btn2.text == "❌" && btn3.text == "❌") || (btn4.text == "❌" && btn5.text == "❌" && btn6.text == "❌") ||
                    (btn7.text == "❌" && btn8.text == "❌" && btn9.text == "❌") || (btn1.text == "❌" && btn5.text == "❌" && btn9.text == "❌") ||
                    (btn3.text == "❌" && btn5.text == "❌" && btn7.text == "❌") || (btn1.text == "❌" && btn4.text == "❌" && btn7.text == "❌") ||
                    (btn2.text == "❌" && btn5.text == "❌" && btn8.text == "❌") || (btn3.text == "❌" && btn6.text == "❌" && btn9.text == "❌") ){

                    Toast.makeText(this,"❌  player won", Toast.LENGTH_SHORT).show()
                    score2++
                    scp2.text = score2.toString()
                    return@setOnClickListener

                }

                else if (btn1.text != "" && btn2.text != "" && btn3.text != "" && btn4.text != "" &&
                         btn5.text != "" && btn6.text != "" && btn7.text != "" && btn8.text != "" && btn9.text != ""){
                    val text = "Match Draw"
                    val duration = Toast.LENGTH_SHORT

                    val toast = Toast.makeText(applicationContext,text,duration)
                    toast.show()
                }
            }

        }

        btnReset.setOnClickListener {
            for (i in 0..8){
                buttons[i].text = ""
            }
        }

    }
}

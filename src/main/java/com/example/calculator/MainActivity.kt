package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var isNewOp = true;
    var old = "";
    var op = "+";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun numberevent(view: View) {
        if (isNewOp)
            editText.setText("")
        isNewOp = false
        var buclick = editText.text.toString()
        var buselect = view as Button
        when (buselect.id) {
            bu1.id -> {

                buclick += "1"
            }
            bu2.id -> {
                buclick += "2"
            }
            bu3.id -> {
                buclick += "3"
            }
            bu4.id -> {
                buclick += "4"
            }
            bu5.id -> {
                buclick += "5"
            }
            bu6.id -> {
                buclick += "6"
            }
            bu7.id -> {
                buclick += "7"
            }
            bu8.id -> {
                buclick += "8"
            }
            bu9.id -> {
                buclick += "9"
            }
            bu0.id -> {
                buclick += "0"
            }
            budot.id -> {
                buclick += "."
            }
            buplusminus.id -> {
                buclick = "-$buclick"
            }

        }
        editText.setText(buclick)

    }

    fun operevent(view: View) {
        isNewOp = true
        old = editText.text.toString()
        var buselect = view as Button
        when (buselect.id) {
            bupl.id -> {
                op = "+"
            }
            bumul.id -> {
                op = "*"
            }
            budiv.id -> {
                op = "/"
            }
            bumi.id -> {
                op = "-"
            }

        }
    }

    fun equalevent(view: View) {
        var new =editText.text.toString()
        var result =0.0;
        when(op){
           "+" ->{ result=old.toDouble()+new.toDouble()}
            "-" ->{ result=old.toDouble()-new.toDouble()}
            "/" ->{ result=old.toDouble()/new.toDouble()}
            "*" ->{ result=old.toDouble()*new.toDouble()}

        }
     editText.setText(result.toString())
    }

    fun percentevent(view: View) {
        var no =editText.text.toString().toDouble()/100;
        editText.setText(no.toString())
        isNewOp=true;
    }

    fun ACevent(view: View) {
        editText.setText("0")
        isNewOp=true;
    }
}

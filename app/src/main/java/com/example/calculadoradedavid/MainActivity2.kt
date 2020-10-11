package com.example.calculadoradedavid

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity() {
    var theOperation = true
    var typeNumber = ""
    var simOperation = "+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val theObjectIntent: Intent = intent
        var user = theObjectIntent.getStringExtra("user")
        setTitle("Welcome " + user);
    }

    fun numberEvent(view: View) {

        if (theOperation)
            editText.setText("")

        theOperation = false

        var buttonCall = editText.text.toString()
        var buttonInsert = view as Button

        when (buttonInsert.id) {
            button1.id -> {
                buttonCall += "1"
            }
            button2.id -> {
                buttonCall += "2"
            }
            button3.id -> {
                buttonCall += "3"
            }
            button4.id -> {
                buttonCall += "4"
            }
            button5.id -> {
                buttonCall += "5"
            }
            button6.id -> {
                buttonCall += "6"
            }
            button7.id -> {
                buttonCall += "7"
            }
            button8.id -> {
                buttonCall += "8"
            }
            button9.id -> {
                buttonCall += "9"
            }
            button0.id -> {
                buttonCall += "0"
            }
            buttonSumAndMin.id -> {
                buttonCall = "-$buttonCall"
            }

        }

        editText.setText(buttonCall)

    }

    fun operationEvent(view: View) {

        theOperation = true
        typeNumber = editText.text.toString()
        var buttonInsert = view as Button

        when (buttonInsert.id) {
            buttonMult.id -> {
                simOperation = "*"
            }

            buttonSum.id -> {
                simOperation = "+"
            }

            buttonMin.id -> {
                simOperation = "-"
            }

            buttonDiv.id -> {
                simOperation = "/"
            }

        }
    }

    fun equivalentEqualsEvent(view: View) {

        var finishNumber = editText.text.toString()
        var finishResult= 0

        when (simOperation) {

            "+" -> {finishResult = typeNumber.toInt() + finishNumber.toInt()}
            "*" -> {finishResult = typeNumber.toInt() * finishNumber.toInt()}
            "/" -> {finishResult = typeNumber.toInt() / finishNumber.toInt()}
            "-" -> {finishResult = typeNumber.toInt() - finishNumber.toInt()}

        }

        editText.setText(finishResult.toString())
    }

    fun deleteEvent(view: View) {
        editText.setText("0")

        theOperation = true
    }
}
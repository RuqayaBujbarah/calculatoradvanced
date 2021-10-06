package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener{
        lateinit var rtv: TextView
        var ft = 0
        var res = 0.0f
        var equ = ""
        var op = 0
        var count = 0
        var num1 = ""
        var num2 = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var seven = findViewById<Button>(R.id.seven)
        var eight = findViewById<Button>(R.id.eight)
        var nine = findViewById<Button>(R.id.nine)
        var devid = findViewById<Button>(R.id.devid)
        var four = findViewById<Button>(R.id.four)
        var five = findViewById<Button>(R.id.five)
        var six = findViewById<Button>(R.id.six)
        var multiply = findViewById<Button>(R.id.multiply)
        var one = findViewById<Button>(R.id.one)
        var tow = findViewById<Button>(R.id.tow)
        var three = findViewById<Button>(R.id.three)
        var minus = findViewById<Button>(R.id.minus)
        var btn = findViewById<Button>(R.id.btn)
        var zero = findViewById<Button>(R.id.zero)
        var dot = findViewById<Button>(R.id.dot)
        var add = findViewById<Button>(R.id.add)
        var del = findViewById<Button>(R.id.del)
        var cut = findViewById<Button>(R.id.cut)
        var equal = findViewById<Button>(R.id.equal)

        rtv = findViewById(R.id.rtv)

        seven.setOnClickListener(this)
        eight.setOnClickListener(this)
        nine.setOnClickListener(this)
        devid.setOnClickListener(this)
        four.setOnClickListener(this)
        five.setOnClickListener(this)
        six.setOnClickListener(this)
        multiply.setOnClickListener(this)
        one.setOnClickListener(this)
        tow.setOnClickListener(this)
        three.setOnClickListener(this)
        minus.setOnClickListener(this)
        btn.setOnClickListener(this)
        zero.setOnClickListener(this)
        dot.setOnClickListener(this)
        add.setOnClickListener(this)
        del.setOnClickListener(this)
        cut.setOnClickListener(this)
        equal.setOnClickListener(this)



    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.seven -> {
                rtv.text = "${rtv.text}7"
                if (count == 0) {
                    num1 += "7"}
                else {
                    num2 += "7"}
            }
            R.id.eight -> {
                rtv.text = "${rtv.text}8"
                if (count == 0) {
                    num1 += "8"}
                else {
                    num2 += "8"}
            }
            R.id.nine -> {
                rtv.text = "${rtv.text}9"
                if (count == 0) {
                    num1 += "9"}
                else {
                    num2 += "9"}
            }
            R.id.four -> {
                rtv.text = "${rtv.text}4"
                if (count == 0) {
                    num1 += "4"}
                else {
                    num2 += "4"}
            }
            R.id.five -> {
                rtv.text = "${rtv.text}5"
                if (count == 0) {
                    num1 += "5"}
                else {
                    num2 += "5"}
            }
            R.id.six -> {
                rtv.text = "${rtv.text}6"
                if (count == 0) {
                    num1 += "6"}
                else {
                    num2 += "6"}
            }
            R.id.one -> {
                rtv.text = "${rtv.text}1"
                if (count == 0) {
                    num1 += "1"}
                else {
                    num2 += "1"}
            }
            R.id.tow -> {
                rtv.text = "${rtv.text}2"
                if (count == 0) {
                    num1 += "2"}
                else {
                    num2 += "2"}
            }
            R.id.three -> {
                rtv.text = "${rtv.text}3"
                if (count == 0) {
                    num1 += "3"}
                else {
                    num2 += "3"}
            }
            R.id.zero -> {
                rtv.text = "${rtv.text}0"
                if (count == 0) {
                    num1 += "0"}
                else {
                    num2 += "0"}
            }
            R.id.add -> {
                if (count == 0) {
                    op = 1
                    rtv.text = "${rtv.text} + "
                    count++}
                else {
                    Toast.makeText(this, "YOU CAN'T ADD TOW OPERANDS:(", Toast.LENGTH_LONG).show()}
            }
            R.id.minus -> {
                if (count == 0) {
                    op = 2
                    rtv.text = "${rtv.text} - "
                    count++}
                else {
                    Toast.makeText(this, "YOU CAN'T ADD TOW OPERANDS:(", Toast.LENGTH_LONG).show()}
            }
            R.id.multiply -> {
                if (count == 0) {
                    op = 3
                    rtv.text = "${rtv.text} * "
                    count++}
                else {
                    Toast.makeText(this, "YOU CAN'T ADD TOW OPERANDS:(", Toast.LENGTH_LONG).show()}
            }
            R.id.devid -> {
                if (count == 0) {
                    op = 4
                    rtv.text = "${rtv.text} / "
                    count++}
                else {
                    Toast.makeText(this, "YOU CAN'T ADD TOW OPERANDS:(", Toast.LENGTH_LONG).show()}
            }
            R.id.btn -> {
                if (count == 1) {
                    op = 5
                    rtv.text = "${rtv.text}- "
                    }
                else {
                    Toast.makeText(this, "YOU CAN'T ADD THIS OPERAND BEFORE THE BASIC ONE :(", Toast.LENGTH_LONG).show()}
            }
            R.id.dot -> {
                if (count == 0&&ft==0) {
                    rtv.text = "${rtv.text}."
                    num1 += "."
                    ft=1}
                else if (count!=0&&ft!=2){
                    rtv.text = "${rtv.text}."
                    num2 += "."
                    ft=2}
            }
            R.id.cut -> {
                rtv.text = ""
                count = 0
                num1 = ""
                num2 = ""
                ft = 0}
            R.id.equal -> {
                when(op){
                    1 -> rtv.text = "${add(num1.toFloat(),num2.toFloat())}"
                    2 -> rtv.text = "${minus(num1.toFloat(),num2.toFloat())}"
                    3 -> rtv.text = "${multiply(num1.toFloat(),num2.toFloat())}"
                    4 -> rtv.text = "${devid(num1.toFloat(),num2.toFloat())}"
                    5 -> rtv.text = "${add(num1.toFloat(),(num2.toFloat()*-1))}"}
                    count = 0}


        }
    }

    fun add(num1: Float, num2: Float): Float{
        return num1+num2
    }

    fun minus(num1: Float, num2: Float): Float{
        return num1-num2
    }

    fun multiply(num1: Float, num2: Float): Float{
        return num1*num2
    }

    fun devid(num11: Float, num22: Float): Float{
        if(num22==0.0f){
            Toast.makeText(this, "YOU CANNOT DIVIDE BY ZERO :(", Toast.LENGTH_LONG).show()
            rtv.text = ""
            count = 0
            num1 = ""
            num2 = ""
            ft = 0
            return 0.0f}
        else{
        return num11/num22}
    }
}
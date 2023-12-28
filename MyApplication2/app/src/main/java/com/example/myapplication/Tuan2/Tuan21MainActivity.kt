package com.example.myapplication.Tuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.R

class Tuan21MainActivity : AppCompatActivity() {
    var txt1:EditText? = null
    var txt2:EditText? = null
    var txt3:EditText? = null
    var bt1:Button? = null
    var tv1:TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan21_main)
        txt1=findViewById(R.id.demotxt1)
        txt2=findViewById(R.id.demotxt2)
        txt3=findViewById(R.id.demotxt3)
        bt1=findViewById(R.id.bt1)
        tv1=findViewById(R.id.tx1)
        bt1!!.setOnClickListener(View.OnClickListener {
            ptbac2()
        })
    }
    private fun ptbac2() {
        val str1 = txt1!!.text.toString()
        val a = str1.toDouble()
        val str2 = txt2!!.text.toString()
        val b = str2.toDouble()
        val str3 = txt3!!.text.toString()
        val c = str3.toDouble()
        val delta = (b*b-4*a*c).toDouble()
        if (delta < 0){
            tv1!!.text = "Phương trình vô nghiệm"
        }
        else if (delta == 0.0){
            tv1!!.text = "Phương trình có nghiệm duy nhất "+(-b)/(2*a)
        }
        else{
            val x1=(-b+Math.sqrt(delta))/(2*a)
            val x2=(-b-Math.sqrt(delta))/(2*a)
            tv1!!.text="Phương trình có hai nghiệm phân biệt $x1 và $x2"
        }
    }
}
package com.example.myapplication.Tuan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.R

class Tuan1MainActivity : AppCompatActivity() {
    var txt11: EditText? = null
    var txt12: EditText? = null
    var bt11: Button? = null
    var tv11: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan1_main)
        txt11=findViewById(R.id.txt11)
        txt12=findViewById(R.id.txt12)
        bt11=findViewById(R.id.bt11)
        tv11=findViewById(R.id.tv11)
        bt11!!.setOnClickListener(View.OnClickListener {
            tong()
        })
    }

    private fun tong() {
        var txt1 = txt11!!.text.toString()
        var so1 = txt1.toFloat()
        var txt2 = txt12!!.text.toString()
        var so2 = txt2.toFloat()
        tv11!!.text=(so1 +so2).toString()
    }
}
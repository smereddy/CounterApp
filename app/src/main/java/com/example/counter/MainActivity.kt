package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var totalCount = 0
    var currentCount = 0



    fun reset(view: View){
        totalCount = 0
        currentCount = 0
        totalCountView.setText(totalCount.toString())
        currentCountView.setText(totalCount.toString())
    }

    fun add(view: View){
        totalCount += 1
        currentCount += 1
        totalCountView.setText(totalCount.toString())
        currentCountView.setText(totalCount.toString())
    }

    fun minus(view: View){
        currentCount -= 1
        currentCountView.setText(totalCount.toString())
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var totalCountView = findViewById<TextView>(R.id.totalCount)
        var currentCountView = findViewById<TextView>(R.id.currentCount)
        totalCountView.setText("0")
        currentCountView.setText("0")

    }


}
package com.example.colormyview

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun setListeners(){
        val clickableViews : List<View> = listOf((findViewById(R.id.box_one)), (findViewById(R.id.box_two)),
            (findViewById(R.id.box_three)), (findViewById(R.id.box_three)),(findViewById(R.id.box_four)),
            (findViewById(R.id.box_5)), findViewById(R.id.constraint_layout))
        for (item in clickableViews){
            item.setOnClickListener{ makecolored(it)}
        }
    }
    private fun makecolored(view: View){
        when(view.id){
            R.id.box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three -> view.setBackgroundColor(getColor(android.R.color.holo_green_light))
            R.id.box_four -> view.setBackgroundColor(getColor(android.R.color.holo_red_dark))
            R.id.box_5 -> view.setBackgroundColor(getColor(android.R.color.holo_purple))
            else -> view.setBackgroundColor(Color.LTGRAY)


        }
    }
}
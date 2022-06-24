package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.colormyviews.R.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        setListeners()
    }


    private fun setListeners()
    {
        val clickableViews : List<View> =
        listOf(box_one_text,box_two_text,box_three_text,box_four_text,box_five_text,Constraint_Layout,Red,Green,Yellow)

        for(item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View){
        when(view.id) {
            id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            id.box_two_text -> view.setBackgroundColor(Color.RED)
            id.box_three_text -> view.setBackgroundColor(Color.GREEN)
            id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            id.box_five_text -> view.setBackgroundColor(Color.YELLOW)

            id.Red -> box_two_text.resources.getColor(color.my_red,null)
            id.Green -> box_three_text.resources.getColor(color.my_green,null)
            id.Yellow -> box_five_text.resources.getColor(color.my_yellow,null)

            else-> view.setBackgroundColor(Color.LTGRAY)
        }
    }


}
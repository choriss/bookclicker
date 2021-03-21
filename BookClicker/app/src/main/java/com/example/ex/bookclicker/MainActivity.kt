package com.example.ex.bookclicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var picture_id = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        left_button.setOnClickListener{
            if (picture_id == 1){
                picture_id = 2
            }
        }

        right_button.setOnClickListener{
            if (picture_id == 1){
                picture_id = 2
            }
        }

    }
}
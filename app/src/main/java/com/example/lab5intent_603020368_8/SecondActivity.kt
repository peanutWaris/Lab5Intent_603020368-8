package com.example.lab5intent_603020368_8

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data= intent.extras
        var newStudent = data?.getParcelable<Student>("stdData")
        idText.text = "Student ID : ${newStudent?.id}"
        nameText.text = "Student Name : ${newStudent?.name}"
        ageText.text = "Student Age : ${newStudent?.age}"
    }
    fun onClickClose(view:View){
        finish()
    }
}

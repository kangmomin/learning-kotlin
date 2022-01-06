package com.example.textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //앱 실행시 실행
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //xml 화면 뷰 연결

        tv_title.setText("Hello World!") //text value setter
    }
}
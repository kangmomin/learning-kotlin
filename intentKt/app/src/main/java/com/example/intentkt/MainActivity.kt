package com.example.intentkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.intentkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.nav.setOnClickListener {
            val intent = Intent(this, subActivity::class.java)
            intent.putExtra("msg", binding.sendMsg.text.toString()) //data include
            startActivity(intent)

            finish() //desctroy activity
        }
    }
}
package com.example.intentkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.intentkt.databinding.ActivityMainBinding
import com.example.intentkt.databinding.ActivitySubBinding

class subActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sub)

        if(intent.hasExtra("msg")) {
            binding.textView2.text = intent.getStringExtra("msg")
        }
    }
}
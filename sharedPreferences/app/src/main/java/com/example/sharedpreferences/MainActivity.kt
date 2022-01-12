package com.example.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.sharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //load saved data
        loadData()
    }

    override fun onDestroy() { //save data when app is shutdown
        super.onDestroy()
        saveData()
    }

    private fun loadData() {
        val pref = getSharedPreferences("pref", 0)
        binding.hello.setText(pref.getString("key", "")) //key, default value
    }

    private fun saveData() {
        val pref = getSharedPreferences("pref", 0) //get saved data
        val edit = pref.edit() //수정보드
        edit.putString("key", binding.hello.text.toString()) //key, value
        edit.apply() //save
    }
}


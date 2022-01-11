package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var userList = arrayListOf<User>(
        User(R.drawable.android, "hello World", "20", "hello World"),
        User(R.drawable.android, "helloaw", "23", "hello World"),
        User(R.drawable.android, "hellorld", "22", "hello World"),
        User(R.drawable.android, "lloWorld", "21", "hello World"),
        User(R.drawable.android, "herld", "25", "hello World"),
        User(R.drawable.android, "World", "28", "hello World"),
        User(R.drawable.android, "hello", "22", "hello World")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val adapter = UserAdapter(this, userList)
        binding.listView.adapter = adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id -> //아마 콜백 함수의 인자 정도로 해석하면 될 듯 함.
            val selectItem = parent.getItemAtPosition(position) as User
            Toast.makeText(this, selectItem.name, Toast.LENGTH_SHORT).show()
        }
//        val item = arrayOf("사과", "배", "딸기")
//        binding.listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)

    }
}
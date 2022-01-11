package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class UserAdapter(private val context: Context, private val UserList: ArrayList<User>) : BaseAdapter() {
    override fun getCount(): Int {
        return UserList.size //사이즈 length
    }

    override fun getItem(position: Int): Any {
        return UserList[position] //position이 index값
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.list_item_user, null) //view를 만드는 가장 기본적인 방법

        //activity에서 정보 가져오기 querySelector같은 느낌?
        val profile = view.findViewById<ImageView>(R.id.profile)
        val name = view.findViewById<TextView>(R.id.name)
        val greet = view.findViewById<TextView>(R.id.greet)
        val age = view.findViewById<TextView>(R.id.age)

        val user = UserList[position] //UserList의 position에 있는 값

        profile.setImageResource(user.profile)
        name.text = user.name
        age.text = user.age
        greet.text = user.greet

        return view
    }
}
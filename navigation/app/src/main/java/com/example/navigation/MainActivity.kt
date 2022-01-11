package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import com.example.navigation.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView
import java.util.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.navBtn.setOnClickListener{
            binding.layoutDrawer.openDrawer(GravityCompat.START) //start = left, end = right
        }

        binding.navView.setNavigationItemSelectedListener(this) //nav menu에 클릭속성 부여 (아직 잘 모름)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) { //switch문 대채재
            R.id.access -> Toast.makeText(applicationContext, "접근성", Toast.LENGTH_SHORT).show() //applicationContext (아직 잘 모름)
            R.id.email -> Toast.makeText(applicationContext, "이메일", Toast.LENGTH_SHORT).show()
            R.id.message -> Toast.makeText(applicationContext, "메세지", Toast.LENGTH_SHORT).show()
        }
        binding.layoutDrawer.closeDrawers() //nav close
        return false
    }


    override fun onBackPressed() {
        if (binding.layoutDrawer.isDrawerOpen(GravityCompat.START)) { //만약 drawer가 start상태이면 닫아라
            binding.layoutDrawer.closeDrawers()
            return
        }
        super.onBackPressed() //일반 백 버튼 실행
    }
}
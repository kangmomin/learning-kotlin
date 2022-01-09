package com.example.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.imageview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        var isWindowsLogo = imageSetter() //set closure

        binding.toastBtn.setOnClickListener {
            if (isWindowsLogo()) {
                binding.profile.setImageResource(R.drawable.windows) //R = res리소스 image setter
            } else {
                binding.profile.setImageResource(R.drawable.android) //R = res리소스 image setter
            }

            Toast.makeText(
                this@MainActivity,
                "버튼이 클릭 되었습니다.",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}

fun imageSetter() : () -> Boolean { //클로져 함 써볼라고 만듦
    var i = false
    return fun () : Boolean {
        if (i) { //if image is windows logo
            i = false
            return true
        }

        //if image is android logo
        i = true
        return false
    }
}
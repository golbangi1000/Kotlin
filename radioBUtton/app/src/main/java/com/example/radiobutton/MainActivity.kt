package com.example.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.radiobutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.radioGroup.setOnCheckedChangeListener{group, checkedId ->
            when(checkedId) {
                R.id.radioApple -> {Log.d("라디오버튼","사과선택")}
                R.id.radioBanana -> {Log.d("라디오버튼", "바나나선택")}
                //코드가 한줄이면 중괄호가 필요없음
                R.id.radioOrange-> Log.d("라디오버튼","오렌지선택")
            }
        }
    }
}
package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import android.widget.CompoundButton.OnCheckedChangeListener
import com.example.checkbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding){


            checkApple.setOnCheckedChangeListener(checkBoxListener)
            checkBanana.setOnCheckedChangeListener(checkBoxListener)
            checkOrange.setOnCheckedChangeListener(checkBoxListener)

        }


    }
    val checkBoxListener = CompoundButton.OnCheckedChangeListener{checkBox, isChecked ->

        when(checkBox.id){
            R.id.checkApple -> {
                if(isChecked) Log.d("체크박스","사과가 선택되었습니다")
                else Log.d("체크박스", "사과가 선택해제되었습니다")
            }
            R.id.checkBanana ->{
                if(isChecked) Log.d("체크박스","바나나가 선택되었습니다")
                else Log.d("체크박스", "바나나가 선택해제되었습니다")
            }
            R.id.checkOrange ->{
                if(isChecked) Log.d("체크박스","오렌지가 선택되었습니다")
                else Log.d("체크박스", "오렌지가 선택해제되었습니다")
            }
        }

    }
}
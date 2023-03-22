package com.e()xample.sharedpreference

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.sharedpreference.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    companion object {
        const val KEY_FIRST_OPEN = "key_first open"
    }

    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val shared = getSharedPreferences("파일명", Context.MODE_PRIVATE)

        val first_open = shared.getString(KEY_FIRST_OPEN, "처음")

        if(first_open != "처음"){
            binding.hello.visibility = View.GONE
        }


        val editor = shared.edit() //수정을 위한 에디터를 꺼낸다
        editor.putString( KEY_FIRST_OPEN, "두번째")
        editor.commit()


    }
}
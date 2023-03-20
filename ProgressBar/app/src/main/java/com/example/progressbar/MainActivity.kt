package com.example.progressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.progressbar.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        with(binding){
            /// <- 메인스레드
            
            thread(start = true){///- -> 서브스레드 
                Thread.sleep(3000)
                //화면에 영향을 미치는 코드는 메인스레드로 다시 보내야한다

                runOnUiThread {
                    progressLayout.visibility = View.GONE
                }
            }  /// <- 서브스레드
            
            /// <- 메인스레드

        }
    }
}
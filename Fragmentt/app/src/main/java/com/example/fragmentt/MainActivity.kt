package com.example.fragmentt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    val listFragment by lazy {ListFragment() }

    val detailFragment by lazy {DetailFragment()}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setFragment()

    }

    fun goDetail(){
//        val detailFragment = DetailFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frameLayout, detailFragment)
        transaction.addToBackStack("detailFragment")
        transaction.commit()


    }

    fun goBack(){
        onBackPressedDispatcher.onBackPressed()
    }

    fun setFragment(){


        val bundle = Bundle()
        bundle.putString("key1","List Fragment")
        bundle.putInt("key2", 20230303)

        listFragment.arguments = bundle


        //2. 트랜잭션 생성
        val transaction = supportFragmentManager.beginTransaction()
        //3. 트랜잭션을 통해 프래그먼트 삽입
        transaction.add(R.id.frameLayout, listFragment)
        transaction.commit()

    }
}
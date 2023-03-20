package com.example.mycustomlayout
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.mycustomlayout.databinding.ActivityMainBinding
import com.example.mycustomlayout.databinding.ActivityPart1Binding


class Part1Activity : LinearLayout {
    constructor(context: Context?) : super(context) {
        initView()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs){
        initView()
    }


    private val binding: ActivityPart1Binding by lazy {
        ActivityPart1Binding.bind(
            LayoutInflater.from(context).inflate(R.layout.activity_part1,this,true)

        )
    }
    

    fun initView(){
        addView(binding.root)
    }

    




}
package com.example.fragmentt

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentt.databinding.FragmentListBinding

var a = 0

class ListFragment : Fragment() {

    lateinit var binding:FragmentListBinding
    lateinit var mainActivity: MainActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        // Main activity 인지 검사
        if(context is MainActivity) mainActivity = context

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentListBinding.inflate(inflater, container, false)

        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.apply{
            Log.d("태그","${getInt("key2")} $a")
            binding.textTitle.text = getString("key1")
            binding.textValue.text = "${getInt("key2")}"
        }

//        Log.d("태그1","${arguments?.getString("key1")}")
//        binding.textTitle.text = arguments?.getString("key1")
//        binding.textValue.text = "${arguments?.getInt("key2")}"

        binding.btnNext.setOnClickListener {
            mainActivity.goDetail()
        }
    }
}
package com.example.sqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sqlite.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val DB_NAME = "sqlite.sql"
    val DB_VERSION = 1
    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val helper = SqliteHelper(this, DB_NAME, DB_VERSION)
        val adapter = RecyclerAdapter()

        val memos = helper.selectMemo()
        adapter.listData.addAll(memos)

        binding.recyclerMemo.adapter = adapter
        binding.recyclerMemo.layoutManager = LinearLayoutManager(this)
        binding.buttonSave.setOnClickListener{
            val content = binding.editMemo.text.toString()

            if(content.isNotEmpty()) {
                val memo = Memo(null, content, System.currentTimeMillis())
                helper.insertMemo(memo)
                Log.d("메모", "content is Not empty")
                binding.editMemo.setText("")
                //목록 갱신
                adapter.listData.clear()
                adapter.listData.addAll(helper.selectMemo())
                adapter.notifyDataSetChanged()

            }
        }




    }
}
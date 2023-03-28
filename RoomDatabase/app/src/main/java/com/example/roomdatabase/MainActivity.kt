package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.example.roomdatabase.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {


    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    lateinit var helper: RoomHelper
    lateinit var memoAdapter: RecyclerAdapter
    val memoList = mutableListOf<RoomMemo>()
    lateinit var memoDAO : RoomMemoDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        helper = Room.databaseBuilder(this, RoomHelper::class.java, "room_db")
            .build()
        memoDAO = helper.roomMemoDao()

        memoDAO = helper.roomMemoDao()


        refreshAdapter()

        memoAdapter = RecyclerAdapter(memoList)

        with(binding) {
            recyclerMemo.adapter = memoAdapter
            recyclerMemo.layoutManager = LinearLayoutManager(this@MainActivity)

            buttonSave.setOnClickListener{
                val content = editMemo.text.toString()
                if(content.isNotEmpty()){
                    val dateTime = System.currentTimeMillis()
                    val memo = RoomMemo(content, dateTime)
                    editMemo.setText("")
                    insertMemo(memo)



                }
            }
        }
    }

    fun insertMemo(memo: RoomMemo){
        CoroutineScope(Dispatchers.IO).launch {
            memoDAO.insert(memo)
            refreshAdapter()
        }
    }

    fun refreshAdapter(){
        CoroutineScope(Dispatchers.IO).launch {
            memoList.clear()
            memoList.addAll(helper.roomMemoDao().getAll())
            withContext(Dispatchers.Main){
                memoAdapter.notifyDataSetChanged()
            }
        }

    }
}
package com.example.inputoutput

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.inputoutput.databinding.ActivityMainBinding
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val directory_name = "memo"
        val filename = "memo01.txt"

        binding.btnSave.setOnClickListener{
            val content = binding.textWrite.text.toString()
            writeTextField(directory_name,filename,content)
        }

        val path = directory_name + "/" + filename
        val writtenContent = readTextFile(path)
        binding.textRead.text = writtenContent
    }

    fun readTextFile(path: String): String {
        val fullpath = File(filesDir.path + "/" + path)
        if(!fullpath.exists()) return ""

        val reader = FileReader(fullpath)
        val buffer = BufferedReader(reader)

        val result = StringBuilder() //StringBuffer()
        var temp:String? = ""
        while(true){
            temp = buffer.readLine()
            if(temp == null) break
            result.append(temp)
        }
        buffer.close()
        reader.close()
            return result.toString()
        }


    fun writeTextField(directory : String, filename : String, content : String){
        //앱 기본경로 / files / memo
        val dir = File(filesDir.path + "/" + directory)//
        if(!dir.exists()) dir.mkdirs()

        val fullpath = dir.path + "/" + filename
        val writer = FileWriter(fullpath)
        val buffer = BufferedWriter(writer)
        buffer.write(content)
        buffer.close()
        writer.close()
    }


}


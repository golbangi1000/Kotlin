package com.example.coroutineimage2

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.coroutineimage2.databinding.ActivityMainBinding
import kotlinx.coroutines.*
import java.net.URL

class MainActivity : AppCompatActivity() {

    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        with(binding){
            binding.buttonDownload.setOnClickListener{
                CoroutineScope(Dispatchers.Main).launch {
                    binding.progress.visibility = View.VISIBLE
                    val url = binding.editUrl.text.toString()

                    val bitmap = withContext(Dispatchers.IO){
                        loadImage(url)
                    }


                    binding.imagePreview.setImageBitmap(bitmap)
                    binding.progress.visibility = View.INVISIBLE


                }
            }
        }
    }
}


suspend fun loadImage(imageUrl: String) : Bitmap{
    val url = URL(imageUrl)
    val stream = url.openStream()

    return BitmapFactory.decodeStream(stream)
}
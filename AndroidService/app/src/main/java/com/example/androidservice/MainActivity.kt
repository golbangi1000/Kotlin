package com.example.androidservice

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.view.View
import com.example.androidservice.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var serviceIntent: Intent
    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        serviceIntent = Intent(this, MyService::class.java)

    }


    fun serviceStart(view: View){
        intent.action = MyService.ACTION_CREATE
        startService(intent)
    }


    fun serviceStop(view: View){
        stopService(intent)
    }


    var myService:MyService? = null
    var isService = false
    val connection = object : ServiceConnection{
        override fun onServiceConnected(name: ComponentName?, iBinder: IBinder?) {
            isService = true
            val binder = iBinder as MyService.MyBinder
            myService = binder.getService()
        }

        override fun onServiceDisconnected(name: ComponentName?) {
            isService = false
        }
    }


    fun serviceBind(view: View){
        bindService(intent, connection, Context.BIND_AUTO_CREATE)
    }

    fun serviceCommand(){
        myService.create()
        myService.delete()
    }


    fun serviceUnbind(view : View){

    }
}
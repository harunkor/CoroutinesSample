package com.harunkor.coroutinessample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Slayt 7
        /*CoroutineScope(Dispatchers.IO).launch {
            val answer = doNetworkCall()

            withContext(Dispatchers.Main){
                Log.v("PATIKA",answer)
            }

        }*/

        //Slayt 11
       /* runBlocking {
            val job = launch {
                repeat(1000) { i ->
                    Log.v("PATIKA", i.toString())
                    delay(500L)
                }
            }
            delay(2000L)

            job.cancel()
            Log.v("PATIKA", "IPTAL EDILDI")

            job.invokeOnCompletion {
                Log.v("PATIKA", "BITTI")
            }

        }*/


        // Slayt 13
        /*
        CoroutineScope(Dispatchers.IO).launch {
            Log.v("PATIKA","Dispatchers.IO")
        }

        CoroutineScope(Dispatchers.Default).launch {
            Log.v("PATIKA","Dispatchers.Default")
        }

        CoroutineScope(Dispatchers.Main).launch {
            Log.v("PATIKA","Dispatchers.Main")
        }*/

        //Slayt 14
        /*
        GlobalScope.launch {
            launch(Dispatchers.Main) {
                Log.v("PATIKA","Dispatchers.Main")
            }
            launch(Dispatchers.Default) {
                Log.v("PATIKA","Dispatchers.Default")
            }
            launch(Dispatchers.Unconfined) {
                Log.v("PATIKA","Dispatchers.Unconfined")
            }
            launch(Dispatchers.IO) {
                Log.v("PATIKA","Dispatchers.IO")
            }

        }*/


        //Slayt 16
        /*var name = ""
        var age = 0

        GlobalScope.launch {
            val downloadName = async { downloadName() }
            val downloadAge = async { downloadAge() }
            name = downloadName.await()
            age = downloadAge.await()
            println("$name $age")
        }*/


        //Slayt 18
        /*CoroutineScope(Dispatchers.Default).launch {
            launch(Dispatchers.IO){
                println("Dispatchers.Default")
                withContext(Dispatchers.Main){
                    println("Dispatchers.IO")
                }
            }
        }*/
        //





    }

    //Slayt 7
    /*suspend fun doNetworkCall():String {
        delay(2000L)
        return "Network Answer Called "
    }*/


    //Slayt 16
  /*  suspend fun  downloadName(): String{
        delay(2000)
        val name = "HARUN"
        //println("isim indirildi")
        return name
    }

    suspend fun downloadAge(): Int {
        delay(3000)
        //println("yaş indirildi")
        val age = 36
        return age
    }*/
    //Slayt 16 end

}
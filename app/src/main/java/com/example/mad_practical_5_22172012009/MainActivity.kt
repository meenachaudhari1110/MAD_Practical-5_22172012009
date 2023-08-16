package com.example.mad_practical_5_22172012009

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val brawseButton:Button=findViewById(R.id.button2)
        val editTextBrowser:EditText=findViewById(R.id.editTextText)
        brawseButton.setOnClickListener {
            weburl(editTextBrowser.text.toString())
        }
    }
    fun weburl(url:String)
    {
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also { startActivity(it) }
    }
    fun phone_No(phone:String)
    {
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:${phone_No(phone)}"))
    }
    fun calllong()
    {

    }
    fun gallery()
    {

    }
    fun camera()
    {

    }
    fun alarm()
    {

    }
}


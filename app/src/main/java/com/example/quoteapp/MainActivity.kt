package com.example.quoteapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button2.setOnClickListener {
            val gtext=textView2.text.toString()
            val i=Intent()
            i.action=Intent.ACTION_SEND
            i.type="text/plain"
            i.putExtra(Intent.EXTRA_TEXT,gtext)
            startActivity(i)
        }
    }
}
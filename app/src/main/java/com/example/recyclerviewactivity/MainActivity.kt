package com.example.recyclerviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val nameList = listOf(
                Name(
                username = getString(R.string.rm),
                email = getString(R.string.rmemail)
            ),
            Name(
                username = getString(R.string.jin),
                email = getString(R.string.jinemail)
            ),
            Name(
                username = getString(R.string.yg),
                email= getString(R.string.ygemail)
            ),
            Name(
                username = getString(R.string.jh),
                email= getString(R.string.jhemail)
            ),
            Name(
                username = getString(R.string.pjm),
                email= getString(R.string.pjmemail)
            ),
            Name(
                username = getString(R.string.kth),
                email= getString(R.string.kthemail)
            ),
            Name(
                username = getString(R.string.jjk),
                email= getString(R.string.jjkemail)
            ),

        )
        val recyclerView = findViewById<RecyclerView>(R.id.uiRecyclerView)
        recyclerView.adapter = MyAdapter(nameList)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
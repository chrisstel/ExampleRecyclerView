package com.example.examplerecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.examplerecyclerview.databinding.ActivityMainBinding
import com.example.examplerecyclerview.model.UserAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //horizontal orientation
//        val manager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val manager = LinearLayoutManager(this)
        val recyclerViewAdapter = UserAdapter()
        binding.RVUserList.layoutManager = manager
        binding.RVUserList.adapter = recyclerViewAdapter
    }
}
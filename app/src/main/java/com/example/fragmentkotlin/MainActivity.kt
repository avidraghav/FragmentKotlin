package com.example.fragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.fragmentkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val firstfragment = Fragment1()
        val secondfragment = Fragment2()

        binding.b1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment,firstfragment)
                addToBackStack(null)
                commit()
            }
        }
        binding.b2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment,secondfragment)
                addToBackStack(null)
                commit()
            }

        }

    }
}
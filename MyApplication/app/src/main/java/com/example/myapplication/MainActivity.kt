package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {


        val foodList = arrayListOf("Mak", "KFC", "Pizza", "Arif Kebab", "Tadin", "Diamond Kebab")


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //selectedFoodText.text = "Burger King"
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // binding.selectedFoodText.text = "Burger King"

        val decideButton = findViewById<Button>(R.id.decideButton)
        decideButton.setOnClickListener {
            val random = java.util.Random()
            val randomFood = random.nextInt(foodList.count())
            binding.selectedFoodText.text = foodList[randomFood]

        }
        val addFoodButton = findViewById<Button>(R.id.addFoodButton)
        addFoodButton.setOnClickListener{
            val newFood = binding.addFoodText.text.toString()
            foodList.add(newFood)
            binding.addFoodText.text.clear()
        }
    }
}
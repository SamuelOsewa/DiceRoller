package com.dyinlabz.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dyinlabz.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random


lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRoll.setOnClickListener { rollDice() }

    }

    fun rollDice() {
        val diceRoll = Random.nextInt(6) + 1
        val diceImage2 = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        binding.diceImage.setImageResource(diceImage2)
    }
}

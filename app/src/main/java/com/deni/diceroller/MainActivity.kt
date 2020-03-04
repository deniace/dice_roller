package com.deni.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

//    begini bisa
//    var diceImage : ImageView? = null
    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView
//    begini juga bisa
    lateinit var btnRoll : Button
    lateinit var btnClear : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnRoll = findViewById(R.id.btn_roll)
        btnRoll.setOnClickListener { rollDice() }
        diceImage = findViewById(R.id.iv_dice_image)
        diceImage2 = findViewById(R.id.iv_dice_image2)
        btnClear = findViewById(R.id.btn_clear)
        btnClear.setOnClickListener { clear() }
    }

    private fun rollDice(){
        val randomInt = (1..6).random()
//        val diceImage:ImageView = findViewById(R.id.iv_dice_image)
        val drawableResource = when(getRandomDiceImage()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
    }

    private fun getRandomDiceImage():Int{
        val randomInt = (1..6).random()
        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableResource
    }

    private fun clear(){
        diceImage.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)
    }
}

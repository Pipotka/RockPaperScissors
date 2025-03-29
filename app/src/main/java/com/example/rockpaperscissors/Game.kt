package com.example.rockpaperscissors

import kotlin.random.Random

public class Game {

    companion object {
        public fun GetItemForComputer() : GameItems {
            return GetItemByNumber(Random.nextInt(0, 5))
        }


        private fun GetItemByNumber(Number : Int) : GameItems{
            return when(Number){
                0 -> GameItems.ROCK
                1 -> GameItems.PAPER
                2 -> GameItems.SCISSORS
                3 -> GameItems.LIZARD
                4 -> GameItems.SPOCK
                else -> GameItems.NONE
            }
        }
    }
}
package com.example.sandbox

class Player(
    var str: Int = 0, var dex: Int = 0, var XP: Int = 0,
    var lvl: Int = 1, var nextLvlXp: Int = 10,
) {
    fun recieveXP(xp: Int) {
        XP += xp
        if (XP >= nextLvlXp) {
            levelUp()}

        println("str=${str} dex=${dex} lvl=${lvl}")
    }

    private fun levelUp() {
        lvl += 1
        str += if (lvl % 2 == 0) 1 else 0
        dex += if (lvl % 2 == 1) 1 else 0
        nextLvlXp += 100
        println("Congradulations lvl Up to $lvl")

    }

}
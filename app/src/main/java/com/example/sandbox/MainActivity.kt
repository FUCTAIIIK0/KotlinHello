package com.example.sandbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var s: String = "5"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        player()
        //cycles()
        //println("result even ${calculateBugMentions("KLPQYM BUG KHQR KLPQYM JVOJTD JVOJTD BUG BUG KHQR BUG KLPQYM JVOJTD KLPQYM JVOJTD QLSPA KHQR JVOJTD KLPQYM JVOJTD KLPQYM KLPQYM JVOJTD JVOJTD BUG KLPQYM KHQR JVOJTD KHQR KLPQYM KLPQYM JVOJTD KLPQYM BUG BUG BUG")}")
        //println("result even ${even("660308340")}")
        //println("\n\nresult sumOf4 ${sumOf4("660308340")}")

    }


    private fun player(){
        var p:Player = Player(str = 2)
        p.recieveXP(5)
        p.recieveXP(3)
        p.recieveXP(3)
        p.recieveXP(3)
        p.recieveXP(3)
        p.recieveXP(3)
        p.recieveXP(10)
        p.recieveXP(10)
        p.recieveXP(10)
        p.recieveXP(10)
        p.recieveXP(10)
        p.recieveXP(10)
        p.recieveXP(10)
        p.recieveXP(10)
        p.recieveXP(10)
        p.recieveXP(10)
        p.recieveXP(10)
        p.recieveXP(10)
        p.recieveXP(10)
        p.recieveXP(10)
        p.recieveXP(10)
        p.recieveXP(10)
        p.recieveXP(10)
    }

    private fun calculateBugMentions(str: String): Int {
        var result = 0
        var arrayList: List<String> = ArrayList()
        arrayList = str.split(" ")

        for (a in arrayList){
            if (a.contains("BUG")){
                result++
            }
        }
        return result
    }

    private fun sumOf4(str: String): Int {
        var result = 0

        var counter = 4;
        for (a in str) {
            if (counter > 0) {
                result += a.toString().toInt()
                counter--
            }

        }
        return result
    }

    private fun even(str: String): Int {
        var result = 0
        var tempShort: Short

        for (a in str) {
            tempShort = a.toString().toShort()
            if (tempShort % 2 == 0) {
                result += tempShort
            }
        }
        return result
    }

    private fun cycles() {
        var array: ArrayList<String> = ArrayList()
        array.add("qqq")
        array.add("www")
        array.add("rrr")

        for (a in array) {
        }

        var step = 0
        for (i in 0..5 step 2) {
            println("step ${step++}")
        }
        for (i in 5 downTo 0) {
        }
        for (i in 0 until 5) {
        }

    }

    private fun whenTest(value: Int) {
        var result = ""
        when (value) {
            in 1901..2000 -> {
                result = "five"
            }
            2021 -> {
                result = "equals"
            }
            in 2001..2100 -> {
                result = "from eight to ten"
            }
        }
        println(result)
    }

    private fun whenTestIf(value: Int) {
        var result = ""
        when {
            value < 1901 -> {
                result = "before"
            }
            value in 1901..2000 -> {
                result = "after (XX century)"
            }
            value in 2001..2100 -> {
                result = "after (XXI century)"
            }
            value > 2021 -> {
                result = "equals"
            }
            value < 1901 -> {
                result = "distant future"
            }
        }


        when (value) {
            in 1901..2000 -> {
                result = "five"
            }
            2021 -> {
                result = "equals"
            }
            in 2001..2100 -> {
                result = "from eight to ten"
            }
        }
        println(result)
    }

    private fun sum(a: Int = 0, b: Int = 0): Int {
        return a + b
    }

    private fun hello() {
        println("Hello World")
    }

    private fun write(s: String) {
        println("Write $s")
    }

    private fun read() {
        val firstName: String? = readLine()
        println("Oh mighty ruler of Bug Kingdom, the earthling called $firstName seeks for your wisdom!")
    }

}
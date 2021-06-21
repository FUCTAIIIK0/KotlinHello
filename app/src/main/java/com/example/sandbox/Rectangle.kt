package com.example.sandbox


//or
//автоматически создаются свойства(поля) и гененрируется первичный констуктор
//public class Rectangle( var h: Int, var w: Int)
open class Rectangle(h: Int, w: Int) {

    constructor(x1: Int, y1: Int, x2: Int, y2: Int) : this(y2 - y1, x2 - x1) {
        println("something")
    }


    //or
    var h: Int = h
    var w: Int = w

    //or
    init {
        this.h = h
        this.w = w
    }


    //custom getter and setter
    var v: Int = 0
        set(value) {
            //this.v = value
            field = value
        }
        get() {
            return this.v
        }


    open fun sq(): Int {
        return h * w
    }
}

class MagicRectangle(h: Int, w: Int) : Rectangle(h, w), Magic {
    final override fun sq(): Int {
        return super<Magic>.magic() * super<Rectangle>.sq()
    }
}

interface Magic {
    fun magic() = 42
}
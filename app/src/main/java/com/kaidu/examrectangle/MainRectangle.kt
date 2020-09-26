package com.kaidu.examrectangle


// Sorry, but the program is not finished and actually would need to be rewritten
// I mainly self studied Kotlin and never learned how to draw shapes with the println
// You can disregard my code, as it is rubbish. Just wanted to upload something to show that I did try

fun main() {

    var horizontal = 8
    var vertical = 3

    val myArray = arrayOf("┌", "┐", "└", "┘", "─", "│")

    //draw top
    print(myArray[0])
    var x = horizontal
    while(x > 1) {
        print(myArray[4])
        x--
    }
    print(myArray[1])
    println()

    //draw sides
    var y = horizontal
    print(myArray[5])
    while (y > 1) {
        print(" ")
        y--
    }
    print(myArray[5])
    println()
}
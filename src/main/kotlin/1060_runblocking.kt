package coroutines.examples

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun getValue():Int {
    log("entering getValue()")
    delay(1000)
    log("leaving getValue()")
    return (1..6).random()
}

fun main() = runBlocking {
    val num1 = getValue()
    val num2 = getValue()
    println("$num1 + $num2 = ${num1 + num2}")
}
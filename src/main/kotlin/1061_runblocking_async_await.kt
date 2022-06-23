package coroutines.examples

import kotlinx.coroutines.*

suspend fun getValue2():Int {
    log("entering getValue()")
    delay(1000)
    log("leaving getValue()")
    return (1..6).random()
}

fun main() = runBlocking {
    val num1 = async { getValue2() }
    val num2 = async { getValue2() }
    val result1 = num1.await()
    val result2 = num2.await()
    println("$result1 + $result2 = " + (result1 + result2))
}

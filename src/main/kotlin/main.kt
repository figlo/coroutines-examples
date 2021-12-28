package coroutines.examples

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        delay(1000)
        log("World!")
    }
    log("Hello")
}
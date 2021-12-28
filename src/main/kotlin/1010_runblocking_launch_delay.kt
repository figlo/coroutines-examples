package coroutines.examples

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        log("launch")
    }
    delay(1)
    log("main")
}


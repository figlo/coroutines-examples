package coroutines.examples

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        log("launch")
    }
    delay(0)
    log("main")
}

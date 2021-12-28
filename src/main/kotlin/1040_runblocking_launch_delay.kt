package coroutines.examples

import kotlinx.coroutines.*

fun main() = runBlocking {
    for (i in 1..10) {
        launch {
            log("launch $i")
        }
        delay(1)
        log("main $i")
    }
}


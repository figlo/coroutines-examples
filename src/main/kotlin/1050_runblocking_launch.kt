package coroutines.examples

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()  = runBlocking {
    launch {
        launch {
            log("launch 1")
        }

        launch {
            log("launch 2")
        }
    }

    log("main")
}
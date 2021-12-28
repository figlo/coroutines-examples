package coroutines.examples

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    for (i in 1..10) {
        launch {
            log("launch $i")
        }
        log("main $i")
    }
}
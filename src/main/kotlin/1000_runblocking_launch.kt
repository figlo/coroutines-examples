package coroutines.examples

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        log("launch")
    }
    log("main")
}
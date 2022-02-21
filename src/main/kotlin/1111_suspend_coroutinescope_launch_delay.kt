package coroutines.examples

import kotlinx.coroutines.*

suspend fun main() {
    var num = 0
    coroutineScope {
        for (i in 1..1000) {
            launch {
                delay(1000)
                num += 1
            }
        }
    }
    log(num.toString())
}
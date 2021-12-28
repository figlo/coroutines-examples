package coroutines.examples

import kotlinx.coroutines.*

fun main() {
    val job1 = GlobalScope.launch(start = CoroutineStart.LAZY) {
        delay(500)
        log("pong")
        delay(500)
    }

    GlobalScope.launch {
        log("ping")
        job1.join()
        log("ping")
    }
    Thread.sleep(2000)
}
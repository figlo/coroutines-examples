package coroutines.examples

import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch(Dispatchers.Default) {
        val job = launch(Dispatchers.Unconfined) {
            delay(2000)
            log("This is executed after the delay.")
        }

        log("This is executed after calling launch.")

        job.join()

        log("This is executed after join().")
    }

    log("This is executed immediately.")

    Thread.sleep(3000)
}
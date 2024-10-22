package coroutines.examples

import kotlinx.coroutines.*
import java.util.*

suspend fun compute(): Int {
    delay(300)
    return Random().nextInt(3)
}

fun main() {
    runBlocking {
        val coroutineStart = CoroutineStart.UNDISPATCHED
        log("start")

        val a = async(start = coroutineStart) {
            log("start compute a")
            compute()
        }

        val b = async(start = coroutineStart) {
            log("start compute b")
            compute()
        }

        log("end")

        log("result: ${a.await()} ${b.await()}")
    }
}
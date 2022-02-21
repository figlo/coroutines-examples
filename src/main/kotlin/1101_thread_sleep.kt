package coroutines.examples

import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main() = runBlocking {
    var num = 0
    for (i in 1..1000) {
        thread {
            Thread.sleep(60)
            num += 1
        }
    }
    log(num.toString())
}
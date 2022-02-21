package coroutines.examples

import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main() = runBlocking {
    val lock = Any()
    var num = 0
    for (i in 1..1000) {
        thread {
            synchronized(lock) {
                num += 1
            }
        }
    }
    Thread.sleep(1000)
    log(num.toString())
}
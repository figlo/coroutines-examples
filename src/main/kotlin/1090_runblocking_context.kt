package coroutines.examples

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    log("$coroutineContext")
    log("${coroutineContext + CoroutineName("Name 1")}")
    log("${coroutineContext + CoroutineName("Name 2")}")
}
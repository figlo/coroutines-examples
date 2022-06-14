package coroutines.examples

import kotlinx.coroutines.*

fun main() = runBlocking {
    log("My context: $coroutineContext")
    log("My context: ${coroutineContext + CoroutineName("Name 1")}")
    log("My context: ${coroutineContext + CoroutineName("Name 2")}")

    log("My job: ${coroutineContext[Job]}")
}
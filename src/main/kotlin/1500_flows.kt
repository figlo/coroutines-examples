package coroutines.examples

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    log("Start")
    runBlocking {
        val coldFlow = coldFlow()
        val hotFlow = coldFlow.shareIn(this, SharingStarted.Eagerly)
        delay(3000)
        val job = launch {
            hotFlow.collect {
                log("$it")
            }
        }
    }
    log("End")
}

fun coldFlow() = flow {
    repeat(20) {
        delay(400)
        log("Emitting: $it")
        emit(Random.nextInt(50..70))
    }
}
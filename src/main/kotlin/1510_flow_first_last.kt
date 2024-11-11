package coroutines.examples

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() {
    log("Start")
    runBlocking {

        val coldFlow = coldFlow2()
        launch {
            println("coldFlow: " + coldFlow.first())
            println("coldFlow: " + coldFlow.last())
        }

        val hotFlow = coldFlow.shareIn(this, SharingStarted.Eagerly)
        delay(3000)
        launch {
            println("hotFlow: " + hotFlow.first())
            println("hotFlow: " + hotFlow.last())
        }

    }
    log("End")
}

fun coldFlow2() = flow {
    repeat(20) {
        delay(400)
        log("Emitting: $it")
        emit(it)
    }
}
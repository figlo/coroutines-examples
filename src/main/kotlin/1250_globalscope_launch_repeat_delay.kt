package coroutines.examples

import kotlinx.coroutines.*

fun main() {
    var isDoorOpen = false

    log("Unlocking the door... please wait.")
    GlobalScope.launch {
        delay(3000)

        isDoorOpen = true
    }

    GlobalScope.launch {
        repeat(4) {
            log("Trying to open the door...")
            delay(800)

            if (isDoorOpen) {
                log("Opened the door!")
            } else {
                log("The door is still locked")
            }
        }
    }

    Thread.sleep(5000)
}
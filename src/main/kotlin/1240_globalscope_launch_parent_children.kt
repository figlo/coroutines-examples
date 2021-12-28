package coroutines.examples

import kotlinx.coroutines.*

fun main() {
    with(GlobalScope) {
        val parentJob = launch {
            delay(200)
            log("I’m the parent")
            delay(200)
        }
        launch(context = parentJob) {
            delay(200)
            log("I’m a child")
            delay(200)
        }
        if (parentJob.children.iterator().hasNext()) {
            log("The Job has children ${parentJob.children}")
        } else {
            log("The Job has NO children")
        }
        Thread.sleep(1000)
    }
}
package coroutines.examples

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

suspend fun main() {
    var num = 0
    coroutineScope {
        for (i in 1..1000) {
            launch {
                num += 1
            }
        }
    }
    log(num.toString())
}
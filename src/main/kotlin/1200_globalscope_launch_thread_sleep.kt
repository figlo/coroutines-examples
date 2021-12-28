package coroutines.examples

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main() {
    (1..10000).forEach {
        GlobalScope.launch {
            log("globalscope launch $it")
        }
    }
    Thread.sleep(1000)
}
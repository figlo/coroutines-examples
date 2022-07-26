package coroutines.examples

val fibonacci:Sequence<Long> = sequence {
    var first = 0L
    var second = 1L
    while(true) {
        yield(second)
        val temp = second
        second += first
        first = temp
    }
}

fun main() {
    fibonacci.take(10).forEach {
        println(it)
    }
}
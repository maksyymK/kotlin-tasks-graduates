package task2

//Change the 'sum' function so that it was declared as
// an extension to List<Int>

fun List<Int>.sum(): Int {


    return 0
}

fun main(args: Array<String>) {
    val sum = listOf(1, 2, 3).sum()
    println(sum)    // 6
}
class HelloWorld {
}

fun main(args: Array<String>) {
    println("Hello World!")
    println(sum(1, 1))
    println(stringTemp())
}

fun sum(a: Int, b: Int): Int {
    val c = 2
    val d: Int = 3
    println(c + d)
    return a + b
}

fun parseInt2(str: String): String? {
    val numberList = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")

    return if (numberList.contains(str)) {
        str
    } else {
        null
    }
}

fun sum2(a: Int, b: Int) = a + b
fun shorterFunc(a: Int, b: Int) = if (a > b) a else b

fun stringTemp(): String {
    var a = 1
    val s = "Hello World! $a"

    return "Hello World! ${s.replace("World", "kotlin")}"
}
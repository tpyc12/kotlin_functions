package kot

var list: MutableList<Int>? = null

fun main() {
//    name?.let {
//        if (it.length > 5){
//            println("asdassd")
//        }
//    }

//    val list = mutableListOf<Int>()
//    for (i in 0 until 1000){
//        list.add((Math.random()* 100).toInt())
//    }
//    println(list.sum())
//    println(list.average())
//    println(list.max())
//    println(list.min())
//    println(list.first())
//    println(list.last())

//    val list = mutableListOf<Int>()
//    with(list){
//        for (i in 0 until 1000){
//            add((Math.random()* 100).toInt())
//        }
//        println(sum())
//        println(average())
//        println(maxOrNull())
//        println(minOrNull())
//        println(first())
//        println(last())
//    }

//    list?.let {
//        with(it) {
//            for (i in 0 until 1000) {
//                add((Math.random() * 1000).toInt())
//            }
//            val result = filter { item -> item % 2 == 0 }.take(100)
//            for (i in result){
//                println(i)
//            }
//        }
//    }

//    val result = modifyString("Hello world!") {it.toLowerCase()}
//    println(result)

    val list = listOf(1, 2, 3, 4, 5)
    val result = sumList(list) { it.sum() }
    println(result)

}

inline fun modifyString(string: String, modify: (String) -> String): String {
    return modify(string)
}

inline fun sumList(list: List<Int>, operator: (List<Int>) -> Unit) {
    operator(list)
}
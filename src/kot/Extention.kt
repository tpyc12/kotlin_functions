package kot

fun main() {
//    val age = 12
//    println(age.isPositive())
//
//    if (age.isAgeValid()){
//        println("Hello")
//    }
//
//    if (age.isAgeValid()){
//        println("Hello")
//    }
//
//    if (age.isAgeValid()){
//        println("Hello")
//    }

//    val name = ""
//    if (name.isNotEmpty()){
//        println("занято")
//    }

//    val number = 37
//    println(number.simpleNumber())

//    val list = listOf<Int>()
//    with(list){
//        sum()
//        average()
//    }

//    myWith(list) {
//        sum()
//        average()
//    }

    val string = "12435"
    myWith(string) {
        println(toUpperCase())
    }

}
//fun isAgeValid(age: Int) = age in 6..100

fun Int.isAgeValid() = this in 6..100

fun Int.isPositive() = this >= 0

fun Int.simpleNumber() = isPrime(this)

fun isPrime(n: Int): Boolean {
    if (n < 2) return false // Необходимо, так как 1 -- не простое число
    for (m in 2 until n) {
        if (n % m == 0) return false
    }
    return true
}

//fun myWith(list: List<Int>, operation: List<Int>.() -> Unit){
//    list.operation()
//}
//
//fun myWith(string: String, operation: String.() -> Unit){
//    string.operation()
//}

inline fun <T> myWith(obj: T, operation: T.() -> Unit) {
    obj.operation()
}

inline fun <T, R> myWith(obj: T, operation: T.() -> R) : R {
    return obj.operation()
}




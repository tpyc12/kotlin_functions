package kot

fun main() {
// 1. When
//    val time = 23
//    val isGoodWeather = true
//    val result = when {
//        time in 6..23 && isGoodWeather -> "The weather is good, go walk"
//        time in 23..24 || time in 0..9 -> "Go to sleep, its too late"
//        else -> "Stay home, the weather is bad"
//    }
//    println(result)

//  2. Array
//    val array = arrayOfNulls<Int?>(101)
//    for (i in array.indices){
//        array[i]= i
//    }
//    for (i in array){
//        println(i)
//    }
//
//    val array = arrayOfNulls<Int?>(301)
//    for ((index, i) in (300..600).withIndex()) {
//        array[index] = i
//    }
//    for (i in array.size - 1 downTo 0 step 5) {
//        println(array[i])
//    }

//  3. Functions
//    println(fiveElementsOfString("str"))
//    println(sum(5, 4, 1))
//    val numbers = mutableListOf(1,2,3,4,5,1,2,3,4)
//    val result = sort(1,2,3,4,5,3,2,1,23,8)
//    for (i in result){
//        println(i)
//    }

//    4. lambda
//    val square: (Int, Int) -> Int = { a, b -> a * b }
//    println(square(10, 20))
//
//    val p: (Int, Int) -> Int = { a, b -> (a + b) * 2 }
//    println(p(2,2))
//
//    val hello: (String) -> Unit = { name -> println("Hello, my name is $name!") }
//    println(hello("Mikkey"))
//
//    val sortt: (Array<Int>) -> Array<Int> = { array ->
//        for (i in 1 until array.size) {
//            for (j in array.size - 1 downTo i) {
//                if (array[j] > array[j - 1]) {
//                    var temp = array[j]
//                    array[j] = array[j - 1]
//                    array[j-1] = temp
//                }
//            }
//        }
//        array
//    }
//    val array = arrayOf(2,3,45,6,3,2)
//    val sortArray = sortt(array)
//    for (i in sortArray){
//        println(i)
//    }

//    5. filter, map
//    val listOfNames = listOf("Mike", "Alex", "Pavel", "Amy")
//    val listOfANames = listOfNames.filter { name -> name.startsWith("A") }
//    for (i in listOfANames) {
//        println(i)
//    }
//
//    val numbers = (0..100).toList()
//    val names = numbers.map { "Ken$it" }
//    for (employees in names) {
//        println(employees)
//    }

//    val randomList = mutableListOf<Int>()
//    for (i in 0..1000) {
//        randomList.add((Math.random()*1000).toInt())
//    }
//    val newRandomList = randomList
//        .filter { number -> number % 3 == 0 || number % 5 == 0 }
//        .map { number -> number * number }
//        .sortedDescending()
//        .map { number -> "$number" }
//    for (i in newRandomList){
//        println(i)
//    }
//
//    6 take, drop
//    val array = generateSequence ("Сотрудник №1"){
//        val index = it.substring(11).toInt()
//        "Сотрудник №${index + 1}"
//    }
//    val newArr = array.take(100)
//    for (i in newArr){
//        println(i)
//    }

//    7 Zip

//    val listNames = mutableListOf<String>()
//    val listPhones = mutableListOf<Long>()
//    for (i in 0..1000){
//        listNames.add("Anton$i")
//        listPhones.add(8900000000 + i)
//    }
//    val users = listNames.zip(listPhones)
//    for (user in users){
//        println("${user.first} ${user.second}")
//    }

//    val array = arrayOf("Ivanov Ivan", "Sergeev Sergey", "Dmitriev Dmitriy")
//    val firstName = array.map {it.substringBefore(" ") }
//    val secondName = array.map { it.substringAfter(" ") }
//    val newArr = secondName.zip(firstName)
//    for (fullName in newArr){
//        println(fullName)
//    }

//    8 FlatMap

//    val revenueByWeek = listOf(
//        listOf(7, 8, 9, 3, 1),
//        listOf(3, 8, 4, 3, 1),
//        listOf(1, 8, 9, 3, 7),
//        listOf(1, 2, 3, 3, 1)
//    )

//    val total = mutableListOf<Int>()
//    revenueByWeek.map {
//        for (i in it){
//            total.add(i)
//        }
//    }

//    val total = revenueByWeek.flatMap { it }
//    val total = revenueByWeek.flatten()
//    val average = total.average()
//    println(average)

//    val data = mapOf(
//        "File1" to listOf(18, 20, 30, 40, 23),
//        "File2" to listOf(18, 19, -30, 20, 23),
//        "File3" to listOf(18, 20, 21, 28, 46)
//    )

//    val average = data.flatMap { it.value }.average()
//    val average = data.filter { it.value.all { age -> age >= 0 } }.flatMap { it.value }.average()
//    val average = data.filterNot { it.value.any { age -> age < 0 } }.flatMap { it.value }.average()
//    println(average)

    val data = mapOf(
        "Январь" to listOf(100, 200, 300, 400, 230),
        "Февраль" to listOf(200, 200, 300, 400, 230),
        "Март" to listOf(800, 200, -200, 200, 230),
        "Апрель" to listOf(100, 700, 300, 200, 830),
        "Май" to listOf(200, 100, 200, 100, 230),
        "Июнь" to listOf(-100, 200, 300, 400, 230)
    )

    printInfo(data)
}

fun fiveElementsOfString(a: String) = a.substring(0, 5.coerceAtMost(a.length))

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (i in numbers) {
        result += i
    }
    return result
}

fun sort(numbers: MutableList<Int>): List<Int> {
    for (i in 1 until numbers.size) {
        for (j in numbers.size - 1 downTo i) {
            if (numbers[j] < numbers[j - 1]) {
                var temp = numbers[j]
                numbers[j] = numbers[j - 1]
                numbers[j - 1] = temp
            }
        }
    }
    return numbers
}

fun sort(numbers: Array<Int>) = sort(numbers.toMutableList())
fun sort(vararg numbers: Int) = sort(numbers.toMutableList())

fun printInfo(data: Map<String, List<Int>>) {
    val goodWeeksValue = data.filter { it.value.all { average -> average >= 0 } }.map { it.value }
    val goodWeeksNames = data.filter { it.value.all { average -> average >= 0 } }.map { it.key }
    val brokenMonths = data.filter { it.value.any { average -> average < 0 } }.map { it.key }
    val averageWeek = goodWeeksValue.flatten().average()
    val averageMonthSum = mutableListOf<Int>()

    for (i in goodWeeksValue.indices) {
        averageMonthSum.add(goodWeeksValue[i].map { it }.sum())
    }
    val averageMonth = averageMonthSum.map { it }.average()
    val averageMax = averageMonthSum.maxOf { it }
    val averageMin = averageMonthSum.minOf { it }
    val nameOfMonthMax = goodWeeksNames.zip(averageMonthSum).filter { averageMax == it.second }.map { it.first }
    val nameOfMonthMin = goodWeeksNames.zip(averageMonthSum).filter { averageMin == it.second }.map { it.first }

    println("Средняя выручка в неделю: $averageWeek")
    println("Средняя выручка в месяц: $averageMonth")
    println("Максимальная выручка в месяц: $averageMax")
    println("Была в следующих месяцах: $nameOfMonthMax")
    println("Минимальная выручка в месяц: $averageMin")
    println("Была в следующих месяцах: $nameOfMonthMin")
    println("Ошибки были допущены в следующих месяцах $brokenMonths")
}

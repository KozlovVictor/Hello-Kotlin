fun main(args: Array<String>) {
    var someString = "Victor"
    someString += " Kozlov"


    val greetings = "Hello, $someString!"

    val f1 = 15
    val f2 = 123.5
    val result = "f1 * f2 = ${f1 * f2}"

    val bigString = """
        This id line 1
        This is line 2
        This is line 3
        This is line 4
"""

//    pairsAndTriples()
//    ageMethod()
//    choiceString()
//    factorial()
//    fizzBuzz()
//    ranges()
//    diffFor()
//    whenExpression()
//    print(exampleFun(3, 5))

    val multiFunction = ::multi
    displayResult(multiFunction, 4, 5, "Multiplication")
}

private fun multi(a: Int, b: Int): Int {
    return a * b
}

private fun displayResult(multiFunction: (Int, Int) -> Int, a: Int, b: Int, name: String) {
    val result = multiFunction(a, b)
    print("$name : $result")
}

private fun pairsAndTriples() {
    val coords = Pair(34.456, "example")
    val coords1 = 3 to 5
    val (x, y) = coords1
    println(x)
    println(y)
    println("Coords: ${coords.first} ${coords1.second}")

    val coords3d = Triple(1, 2, 3)
    val (x1, y1, _) = coords3d
    println(x1)
    println(y1)
}

private fun ageMethod() {
    val age = 65
    if (age < 18) {
        println("you ate less then 18")
    } else if (age >= 65) {
        println("you are greater then 65")
    } else {
        println("you are greater 18")
    }
}

private fun factorial() {
    var factorial = 1
    var input = 5
    while (input > 0) {
        factorial *= input
        input--
    }
    println(factorial)
}

private fun choiceString() {
    var choice = ""
    while (choice != "q") {
        println("Enter you choice or press q")
        choice = readLine().orEmpty()
        println(choice)
    }
    print("You select q is your choice")
}

private fun fizzBuzz() {
    var number = 45
//    if (number % 3 == 0) {
//        if (number % 5 == 0) {
//            print("FizzBuzz")
//        } else print("Fizz")
//    } else if (number % 5 == 0) {
//        print("Buzz")
//    } else print("Fail!")
// ----------------------------
//    var result = ""
//    if (number % 3 == 0) result += "Fizz"
//    if (number % 5 == 0) result += "Buzz"
//    if (number % 3 != 0 && number % 5 != 0) print("Not FizzBuzz")
// -----------------------------
    var result = when {
        number % 3 == 0 && number % 5 == 0 -> "FizzBuzz"
        number % 3 == 0 -> "Fizz"
        number % 5 == 0 -> "Buzz"
        else -> "Not FizzBuzz"
    }
    print(result)
}

private fun ranges() {
    val closeRange = 0..5
    for (index in closeRange) {
        print(index)
    }
    val halfOpenRange = 0 until 5
    val decreasingRange = 5..0
    val decreasingRange1 = 5 downTo 0
}

private fun diffFor() {
    for (index in 0..10 step 2) {
        print(index)
    }
}

private fun whenExpression() {
    val number = 11
    when (number) {
        10 -> print("10")
        else -> println("not 10")
    }

    val age = 5
    val ageGroup = when (age) {
        in 0..2 -> "Infant"
        in 3..12 -> "Child"
        in 13..17 -> "Teenager"
        in 18..100 -> "Adult"
        else -> "Unknown"
    }
    print("Age group: $ageGroup")
}

private fun exampleFun(a: Int, b: Int): Int {
    return a + b
}

//----------------------------------------------------
private fun nameAge(name: String, age: Int) {
    print("Hello, $name. Your age is $age")
}

private fun nameAge(name: String, age: String) {
    print("Hello, $name. Your age is $age")
}

private fun nameAge(age: Int, name: String) {
    print("Hello, $name. Your age is $age")
}
//-----------------------------------------------------
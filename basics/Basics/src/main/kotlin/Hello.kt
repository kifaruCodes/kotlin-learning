import java.util.Scanner

fun main(){

    /*
    *   Input and output statements
    * */

    // output statement
    println("Hello there")  //
    println(20_000_000)
    print("This is a Kotlin documentation. ")
    println("Kotlin is the supported Android programming language by Google")

    // input statement : String

    /*
    *   You can use the default Java scanner class as well with kotlin inputs
    * */
//    println("What is the name of your city: ")
//    var city  = readln()
//    println("Your city is $city")

    // input statement : Int
//    println("What is your age: ")
//    var age  = readLine()!!
//    println("Your age is ${age.toInt()}")

    // Input statement with a tyy catch block
    try {
        println("Please enter your age")
        var age2 = readLine()!!
        println("Your age is : ${age2.toInt()}")
    } catch (e : Exception){
        println("You have entered a wrong input type")
        println("The error is $e")
    }

    /*
    *   Variables:
    *       There are two types of variables ie mutable & immutable(read-only) variables
    *
    *       mutable variables are declared by "var"
    *       immutable variables are declared by "val"
    * */

    val name : String = "Kifaru"            // this variable can not be changed
    var another_name : String = "Iron man"  // this variable can be changed


    // In Kotlin, types are non-null by default ie we can not assign a null value to a variable
    // example below

    //val nonnull_string: String = null // this will give an error
    val nullable_string: String? = null // Putting a "?" after the type of the variable will allow it to pass null values


    // Type conversions
    //

    /*
    *   In operator
    * */
    val range = listOf(12,21,45,543,3,6,34)
    val search_no = 4
    if (search_no in range){
        println("found the number")
    } else {
        println("Number not found")
    }


    /*
    *   Conditionals
    *
    * */

    // If statements
    val number = 20
    if (number > 100){
        println("Number is bigger than 100")
    } else if (number < 100){
        println("Number is less than 100")
    } else {
        println("Number is 100")
    }

    // ternary operator

    // When statement
    // Example 1
    val when_var  = readLine()!!.toInt()
    when(when_var){
        10 -> {
            println("Number is 10")
        }
        20 -> {
            println("number is 20")
        }
        else -> {
            println("The number is not listed")
        }
    }

    // Example 3
    println("enter fitst number")
    val no1 = readLine()!!.toInt()

    println("enter second no")
    val no2 = readln()!!.toInt()

    println("enter operator")
    val op = readln()

    val result = when (op){
        "+" -> {
            "$no1 $op $no2 = ${no1 + no2}"
        }
        "-" -> {
            "$no1 $op $no2 = ${no1 - no2}"
        }
        "*" -> {
            "$no1 $op $no2 = ${no1 * no2}"
        }
        "/" -> {
            "$no1 $op $no2 = ${no1 / no2}"
        }
        "%" -> {
            "$no1 $op $no2 = ${no1 % no2}"
        }
        else -> {
            "The operator selected is not in the list"
        }
    }

    println(result)
}


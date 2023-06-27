import java.util.Scanner

fun main(){
    val variable = "qwer"

    when (variable){
        is Int -> {
            println("This is an integer")
        }
        is String -> {
            println("This is a string")
        }
        is List<*> -> {
            println("This is a list/array")
        }
    }
}
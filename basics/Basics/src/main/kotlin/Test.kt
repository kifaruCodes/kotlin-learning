import java.util.Scanner

fun main(){
    val no = readLine()!!.toInt()
    val result =  if (no > 0) "Positive" else "negative"
    println(result)
}
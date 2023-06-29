

fun main(){
    val batman = Person("Bruce", 30)
    println(batman.name)
    batman.name = "wayne"
    println(batman.name)
}

class Person (_name:String, _age:Int) {
    var name = _name
        get() {
            return "the name is " + field
        }
        set(value) {
            if (value.length < 5){
                println("The name is too short")
            } else {
                field = value + " and I am Batman "
            }
        }
    var age = _age
}



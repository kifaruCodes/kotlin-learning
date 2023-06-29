class PizzaKitchen(_pizzaInOven:Boolean, _pizzaType:String) {
    var pizzaInOven = _pizzaInOven
    var pizzaType = _pizzaType

    init {
        if (pizzaInOven){
            println("There is a $pizzaType pizza in the oven. Please wait till it is ready")
        } else {
            println("There is no pizza in the oven. You can put a new pizza in")
        }
    }
}
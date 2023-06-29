class Car (_brand : String){
    private var isTurnedOn = false
    var speed = 0
    var brand = _brand

    fun startEngine(){
        if (isTurnedOn == false) {
            print("Turning on the engine...")
            Thread.sleep(500)
            print("1 . ")
            Thread.sleep(500)
            print("2 . ")
            Thread.sleep(500)
            println("3 . ")
            Thread.sleep(1000) // give a delay of 1s
            println("The $brand is now on...")
            Thread.sleep(1000)
            isTurnedOn = true
            Thread.sleep(1000)
        } else {
            println("The $brand is already turned on")
            Thread.sleep(1000)
        }
    }

    fun drive(speed : Int){
        // the car has to be on to drive the car
        if (isTurnedOn) {
            println("Changing the speed to $speed km/h")
            Thread.sleep(1000)
            println("We are now moving at $speed km/h")
            Thread.sleep(1000)
        } else {
            println("The car has to be on to start")
            Thread.sleep(1000)
        }
    }

    fun turnOffEngine(){
        if (isTurnedOn == true){
            println("Turning off the engine")
            Thread.sleep(1000)
            println("The $brand is now turned off")
        } else {
            println("The car is already off")
        }
    }
}
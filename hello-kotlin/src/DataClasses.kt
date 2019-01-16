//This defines a simple data class with attributes. No need to create the getters/setters.
//They are exposed by default for data class.
data class Person(val name: String, val city:String)

// This defines a data class with a default value to an attribute if the value is not provided.
data class City(val name: String, val population :Long ?= 60000)

// Main entry function
fun main(args: Array<String>) {
    val person = Person("Gaurav", "Pune")
    println("Person name is ${person.name} and stays in ${person.city}")

    val city1 = City("Pune", 50000000)
    println("City is ${city1.name} and population is ${city1.population}")

    //city2 is declared with just name and since no population is passed, default value is taken
    val city2  = City("Dublin")
    println("City is ${city2.name} and population is ${city2.population}")
}
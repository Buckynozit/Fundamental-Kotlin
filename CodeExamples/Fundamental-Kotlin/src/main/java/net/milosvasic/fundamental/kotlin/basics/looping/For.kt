package net.milosvasic.fundamental.kotlin.basics.looping

fun main() {

    fun counter(to: Int) {

        for (x in 0..to) {

            println("x: $x ")
        }
    }

    fun cars(cars: List<String>) {

        for (index in cars.indices) {

            println("Car '${cars[index]}' index is: $index")
        }
    }

    fun cities(cities: List<String>) {

        for (city in cities) {

            println("City: ${city.capitalize()}")
        }
    }

    fun citiesKt(clubs: List<String>) {

        clubs.forEach { city ->

            println("City: ${city.capitalize()}")
        }
    }

    fun players(players: Collection<String>) {

        players.forEachIndexed { index, item ->
            println("[ $index ] ${item.capitalize()}")
        }
    }

    counter(5)

    val cities = listOf("Belgrade", "Rome", "Moscow", "New York")
    citiesKt(cities)
}

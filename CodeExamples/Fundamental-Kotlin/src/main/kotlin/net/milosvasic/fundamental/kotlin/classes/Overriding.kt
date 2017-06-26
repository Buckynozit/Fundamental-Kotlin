package net.milosvasic.fundamental.kotlin.classes

open class Engine {
    open fun turnOn() {
        println("Turn on")
    }
}

class SuperEngine : Engine() {
    override fun turnOn() {
        super.turnOn()
        println("Do a special thing!")
    }
}

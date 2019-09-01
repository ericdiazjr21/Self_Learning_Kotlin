package lesson31

fun main() {
    /**
     * use anonymous interface implementations
     */

    // To pass an anonymous class into a function parameter, use the object
    // declaration followed by a colon and then the type of the anonymous class.
    val stateFullClass = StateFullClass(object : ClickEvent.OnClickListener {
        override fun onClick(event: ClickEvent) {
            println("click at ${event.x} and ${event.y}")
        }

    })

    stateFullClass.onClick(4, 8)
}

class ClickEvent(val x: Int, val y: Int) {

    interface OnClickListener {
        fun onClick(event: ClickEvent)
    }
}

class StateFullClass(private val listener: ClickEvent.OnClickListener) {

    fun onClick(x: Int, y: Int) {
        listener.onClick(ClickEvent(x, y))
    }
}
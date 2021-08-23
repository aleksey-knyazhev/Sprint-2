class ProblemA {

    fun main() {
        val lines = readInt()

        for (i in 1..lines) {
            val array = readIntArray(3)
            var position: Long = 0
            for (counter in 0 until array[2]) if (counter % 2 == 0) {
                position += array[0]
            } else {
                position -= array[1]
            }
            println(position)
        }
    }
}
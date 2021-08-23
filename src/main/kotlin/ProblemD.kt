class ProblemD {

    fun main() {
        val countOfCashShifts = readInt()

        for (i in 1..countOfCashShifts) {
            var profit: Long
            var profitNew: Long
            val countOfCustomers = readInt()
            var array = readLongArray(countOfCustomers)
            array.sortDescending()
            profit = array[countOfCustomers - 1].toLong()
            for (i in 0 until countOfCustomers) {
                profitNew = array[i].toLong() * (i + 1)
                if (profitNew < profit)
                    break
                profit = profitNew
            }
            println(profit)
        }
    }

    private fun readLongArray(size:Int) = readStrings().run { LongArray(size) { get(it).toLong() } }

}
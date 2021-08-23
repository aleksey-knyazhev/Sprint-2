class ProblemC {

    fun main() {
        val countOfStudents = readInt()
        val students = readIntArray(countOfStudents)
        students.sort()
        var countOfTasks = 0

        for (i in 0 until countOfStudents step 2)
            countOfTasks += students[i + 1] - students[i]

        println(countOfTasks)
    }
}

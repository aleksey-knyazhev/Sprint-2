import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.PrintStream

class ProblemD {

    fun main() {

        val workDir = "problemD"

        lateinit var outputStream: ByteArrayOutputStream
        lateinit var inputStream: InputStream

        outputStream = ByteArrayOutputStream()
        val ps = PrintStream(outputStream)
        System.setOut(ps)
        inputStream = this::class.java.getResource("$workDir/input.txt")!!.openStream()
        System.setIn(inputStream)


        val lines = readInt()

        for (i in 1..lines) {
            val array = readIntArray(2)
            var string = ""


            println(string)

        }
    }

}
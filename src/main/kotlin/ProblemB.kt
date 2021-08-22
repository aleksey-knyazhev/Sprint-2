import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.PrintStream

class ProblemB {

    fun main() {
        var outputStream: ByteArrayOutputStream
        var inputStream: InputStream
        val workDir = "problemB"

        outputStream = ByteArrayOutputStream()
        val ps = PrintStream(outputStream)
        System.setOut(ps)
        inputStream = this::class.java.getResource("$workDir/input.txt")!!.openStream()
        System.setIn(inputStream)


        val lines = readInt()

        for (i in 1..lines) {
            val array = readIntArray(2)
            val stringSize = array[0]
            var string = ""
            val vocabularySize = array[1]
            val vocabulary = getVocabulary(vocabularySize)
            val countOfMaxFrequency = stringSize % vocabularySize
            val minAffordableFrequency = minAffordableFrequency(stringSize, vocabularySize, countOfMaxFrequency)

            for (item in vocabulary) {
                if (countOfMaxFrequency == 0) {

                }
            }






            println(string + "minAffordableFrequency: $minAffordableFrequency")
        }

    }

    private fun getVocabulary(vocabularySize: Int): Array<Char> {
        val firstPosition = 97 // ASCII символа 'a'
        var vocabulary: Array<Char> = Array(vocabularySize) {
            i -> (firstPosition + i).toChar()
        }
        return vocabulary
    }

    private fun minAffordableFrequency(stringSize: Int, vocabularySize: Int, countOfMaxFrequency:Int): Int {
        var frequency = 0
        frequency = stringSize / vocabularySize
        if (countOfMaxFrequency != 0) frequency++
        return frequency
    }


}
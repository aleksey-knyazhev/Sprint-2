class ProblemB {

    fun main() {

        val lines = readInt()

        for (i in 1..lines) {
            val array = readIntArray(2)
            val stringSize = array[0]
            val vocabularySize = array[1]
            val countOfMaxFrequencyLetters = stringSize % vocabularySize
            val vocabulary = getVocabulary(vocabularySize)
            var string = ""

            for (i in 1..stringSize / vocabularySize) {
                string += vocabulary
            }
            if (countOfMaxFrequencyLetters != 0) {
                for (i in 0 until countOfMaxFrequencyLetters) {
                    string += vocabulary[i].toString()
                }
            }
            println(string)
        }
    }

    private fun getVocabulary(vocabularySize: Int): String {
        val firstPosition = 97 // ASCII-код символа 'a'
        var vocabulary = ""
        for (i in firstPosition until firstPosition + vocabularySize)
            vocabulary += i.toChar().toString()
        return vocabulary
    }
}
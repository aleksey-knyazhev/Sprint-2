class ProblemB {

    fun main() {
        val lines = readInt()

        for (i in 1..lines) {
            val array = readIntArray(2)
            val stringSize = array[0]
            val vocabularySize = array[1]
            val countOfMaxFrequencyLetters = stringSize % vocabularySize
            val firstPosition = 97 // ASCII-код символа 'a'
            val vocabulary = Array(vocabularySize) { (it + firstPosition).toChar().toString() }.joinToString("")
            var string = ""

            // fullVocabularySetCounter - итератор случаев добавления полного словаря
            for (fullVocabularySetCounter in 1..stringSize / vocabularySize) string += vocabulary

            // singleLetterNonVocabularySetCounter - итератор символов неполной строки
            if (countOfMaxFrequencyLetters != 0)
                for (singleLetterNonVocabularySetCounter in 0 until countOfMaxFrequencyLetters)
                    string += vocabulary[singleLetterNonVocabularySetCounter].toString()

            println(string)
        }
    }
}
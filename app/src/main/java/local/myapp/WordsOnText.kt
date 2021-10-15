package local.myapp

class WordsOnText {
    var text: String = ""
    var allWords: List<String>
    constructor(text: String) {
        this.text = text
        allWords = text.split(' ')
    }
    fun getFiveLongestWords() : ArrayList<String> {
        var fiveLongestWords = ArrayList<String>()
        for(i in 0..4) {
            var maxLenght = allWords[0].length
            var index = 0;
            for(word in allWords) {
                if (word.length > maxLenght && !fiveLongestWords.contains(word)) {
                    maxLenght = word.length
                    index = allWords.indexOf(word)
                }
            }
            fiveLongestWords.add(allWords[index])
        }
        return fiveLongestWords
    }
}
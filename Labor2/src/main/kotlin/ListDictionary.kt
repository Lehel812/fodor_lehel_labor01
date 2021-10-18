import IDictionary.Companion.name
import java.io.File

object ListDictionary:IDictionary {
    override fun add(item: String): Boolean {
       return words.add(item)
    }

    override fun find(item: String): Boolean {
        return words.contains(item)
    }

    override fun size(): Int {
       return words.size
    }
    private val words = mutableListOf<String>()
    fun readingWords(filename:String){
        val file= File(filename)
        file.forEachLine { this.words.add(it) }
    }
    init{
        readingWords(name)
    }

}
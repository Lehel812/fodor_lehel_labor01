interface IDictionary {
    companion object{
        const val name:String = "English_Dictionary.txt"
    }
    fun add(item:String):Boolean
    fun find(item:String):Boolean
    fun size(): Int
}




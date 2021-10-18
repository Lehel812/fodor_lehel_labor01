object DictionaryProvider {
    fun createDictionary(type:DictionaryType):IDictionary {
        lateinit var dictionary:IDictionary
        if(type==DictionaryType.ARRAY_LIST)
        {
            dictionary=ListDictionary
        }
        if(type==DictionaryType.TREE_SET)
        {
            dictionary=TreeSetDictionary
        }
        if(type==DictionaryType.HASH_SET)
        {
            dictionary=HashSetDictionary
        }
        return dictionary
    }
}

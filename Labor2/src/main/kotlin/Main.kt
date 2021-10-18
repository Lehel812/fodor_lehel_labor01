fun main(args: Array<String>) {
    println("Problem2:")
    println()
    println("The longest string of a list:")
    val list = listOf("orange","class","house","strawberry")
    val name: String = "Balogh Albert"
    println(list.Longest())
    println("Joining by a separator:")
    println(list.joinWithSeparator("#"))
    println("Monogram")
    name.monogram()
    println()
    println("Problem1:")
    println()
    val dict: IDictionary = ListDictionary
    println("Number of words: ${dict.size()}")
    var word: String?
    while(true){
        print("What to find? ")
        word = readLine()
        if( word.equals("quit")){
            break
        }
        println("Result: ${word?.let { dict.find(it) }}")
    }
    println("Using TreeSetDictionary:")
    val dict1: IDictionary = TreeSetDictionary
    println("Number of words: ${dict1.size()}")
    while(true){
        print("What to find? ")
        word = readLine()
        if( word.equals("quit")){
            break
        }
        println("Result: ${word?.let { dict1.find(it) }}")
    }
    println()
    println("HashSetDictionary")
    val dict2: DictionaryProvider = DictionaryProvider
    val dict3: IDictionary = dict2.createDictionary(DictionaryType.HASH_SET)
    println("Number of words: ${dict3.size()}")
    while(true){
        print("What to find? ")
        word = readLine()
        if( word.equals("quit")){
            break
        }
        println("Result: ${word?.let { dict3.find(it) }}")
    }
    println()
    println("Problem3")
    println()
    val date =Date(1900,9,13)
    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")
}

fun List<String>.Longest() = (this.sortedByDescending { it.length }).first()
fun List<String>.joinWithSeparator(separator: String) = this.joinToString(separator="#")
fun String.monogram()
{
    val delimiter = " "
    val list = this.split(delimiter)
    val two_letters = ((list.map { it.first() }))
    println(two_letters)
}






import java.lang.StringBuilder
import java.util.*
import kotlin.math.sqrt


fun main(args: Array<String>) {

    println("Adding two values")
    val nmb1 = 2
    val nmb2 = 3
    addingNumbers(nmb1,nmb2)
    println("Immutable list:")
    printingDays();
    println()
    println("Prime numbers between 1 and 100")
    val numbers = listOf(1..100)
    for(i in 1..100) {
        if (isPrime(i)) {
            println(i)
        }
    }
    println()
    println("Even numbers:")
    val l = listOf(1,2,3,4,5,6,7,8,9,10)
    println(evenNumbers(l))
    println("Map")
    println("Double the elements:")
    doubleElements(l)
    println()
    println("First character of each day:")
    val daysOfWeek = listOf ("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    firstCharacter(daysOfWeek)
    println()
    println("Length of the days:")
    lengthOfTheDays(daysOfWeek)
    println()
    println("Average length of days:")
    println(average(daysOfWeek))
    println()
    mutableLists();
    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")
}

fun addingNumbers(a: Int, b:Int)
{
    println("$a+$b = ${a+b}")
}

fun printingDays()
{
    val daysOfWeek = listOf ("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    println("The days of the week:")
    for (i in daysOfWeek)
    {
        println(i)
    }
    println()
    println("Days starting with letter 'T':")
    val list = daysOfWeek.filter { it.startsWith("T")}
    println(list)
    println()
    println("Days containing the letter 'e':")
    val list1 = daysOfWeek.filter { it.contains("e") }
    println(list1)
    println()
    println("Days of length 6:")
    val list2 = daysOfWeek.filter{it -> it.length == 6}
    println(list2)
}

fun isPrime(n:Int):Boolean{
    if(n==0 || n==1)
        return false
    for(i in 2..n/2)
    {
        if(n%i==0)
        {
            return false
        }
    }
   return true
}

fun evenNumbers(list: List<Int>) = list.filter { it -> it%2 == 0 }

fun doubleElements(list: List<Int>) = println(list.map { it*2 })

fun firstCharacter(list: List<String>) = println(list.map { it.first()  })

fun lengthOfTheDays(list: List<String>) = println(list.map{it.length})

fun average(list: List<String>): Double{
    val avg:Double
    var sum = 0.0
    for(i in list)
    {
        sum = sum + i.length
    }
    avg=sum/list.size
    return avg
}

fun mutableLists()
{
    val daysOfWeek= mutableListOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    val list2 = daysOfWeek.filter{!(it.contains("n"))}
    println()
    println("Days not contained letter 'n':")
    println(list2)
    println()
    println("Indexes and elements:")
    for((index,value) in list2.withIndex())
    {
        println("Item at $index is $value")
    }
    println()
    println("Sorted result list:")
    println(list2.sorted())
    println()
}

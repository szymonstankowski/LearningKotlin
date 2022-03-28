import java.util.*

fun main() {
    strings()
    println("-".repeat(100))
    operators()
    array()
    loops()

    var intArray:Array<Int> = arrayOf(1,2,3,4,5)
    whenConditional(intArray)

    logicalOperators()
    whileLoops(10)
}


// PART 5
fun strings(){
        val exampleString = "\"Szymon Marek\""
        val exampleString2 = """Szymon  Marek"""
        val exampleNumber = 2_000_000
        val exampleLong: Long = exampleNumber.toLong()

        println(exampleString)
}


// PART 6


fun operators(){

    var a = 5
    val b = 3.0

    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    println("a % b = ${a % b}")
    println("-$".repeat(50))
    a += 2
    println("a += 2: $a")

    println("a++: ${a++}")
    println("++a: ${++a}")
    a -= 2
    println("a -= 2: $a")
    a *= 2
    println("a *= 2: $a")
    a /= 2
    println("a /= 2: $a")
    a %= 2
    println("a %= 2: $a")

    println(a.plus(2))
    println(a.minus(2))
}

//PART 7

fun array(){
    val names:Array<String> = arrayOf("Szymon", "Marek", "Monika", "Stefan", "Agata")

    println("Array last element: ${names[names.size-1]}")
    println("Array last index: ${names[names.lastIndex]}")
    println("Array last: ${names.last()}")
    println("-$".repeat(50))
    println("Wypisanie zawartosci tablicy wraz z indexem pod ktorym znajduje sie imie")
    for (index in names.indices){
        println("Index: $index Name: ${names[index]} ")
    }
    println("-$".repeat(50))
}

//PART 8
val array:Array<String> = arrayOf("Szymon", "Marek", "Monika")

fun loops(){

    for(name:String in array){
        println("Imie z listy wyswietlone za pomoca petli for: $name")
    }
    println("-$".repeat(50))
    for(i in 1..10) println("liczby wyswietlone za pomoca petli fori: $i")
    println("-$".repeat(50))
    for(i in 1 until 10) println("liczby wyswietlone za pomoca petli fori ze slowem kluczowym 'until': $i")
    println("-$".repeat(50))
    for(i in 10 downTo  1) println("liczby wyswietlone za pomoca petli fori ze slowem kluczowym 'down to': $i")
    println("-$".repeat(50))
    for(i in 1..10 step 2) println("liczby wyswietlone za pomoca petli fori z modyfikatorem 'step' wyswietlana jest co 2 cyfra: $i")
    println("-$".repeat(50))
    for (i in 'a' .. 'z' step 2) println("wyswietlanie co 2 litery alfabetu: $i")
    println("-$".repeat(50))
    for (i in 0..array.size-1){
        println("Imiona wyswietlone za pomoca petli fori: imie pod indexem $i to:  ${array[i]}  ")
    }
    println("-$".repeat(50))
    for (i in array.indices){
        println("Imiona wyswietlone za pomoca petli fori: imie pod indexem $i to:  ${array[i]}  ")
    }

}

//PART 9

fun whenConditional(array: Array<Int>){
    println("-$".repeat(50))
   for (element in array){
       when(element){
           0 -> {
               println("1 is present")
           }
           9 -> {
               println("2 is present")
           }
           8 -> {
               println("3 is present")
           }
           7 -> {
               println("4 is present")
           }
           6 -> {
               println("5 is present")
           }
           else -> {
               println("there is no such number")
           }

       }
   }
}


//PART 10

fun logicalOperators(){
    println("2 > 1 is ${2>1}")
    println("2 < 1 is ${2<1}")
    println("2 = 1 is ${2==1}")
    println("2 != 1 is ${2!=1}")
    println("!(2 > 1) is ${!(2>1)}")

    println("true && false = ${true && false}")
    println("true || false = ${true || false}")

    var condition = (2>1) || (3>2) && (2>3)
    println(condition)
}


//PART 11

fun whileLoops(number:Int){
    println("-$".repeat(50))
    var i = 1
    while (i <=number){
        println("Odliczanie: $i")
        i++
    }
    var scan = Scanner(System.`in`)
    while (scan.hasNext()){
        println(scan)
        break
    }
}
    






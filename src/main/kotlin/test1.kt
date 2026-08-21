data class Person4(var name:String,var age:Int)

fun main(){
    var p=Person4("Fernando",20)

    println("${p.name} is ${p.age} years old")
}
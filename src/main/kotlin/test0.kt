class Person1( name:String){
    private  var name=name

    fun sayHi(){
        println("Hi I'm $name")
    }
}

class Person2(private  var name:String){
    fun sayHi(){
        println("Hi I'm $name")
    }
}

class Person3( iname:String){
    var name=iname
    var age:Double=0.0
        get(){
            return field
        }
        set(value) {
            if(value>0)
                field = value
            else println("Edad inválida")
        }
    fun sayHi(){
        println("Hi I'm $name")
    }
}

fun main(){

    var person1 = Person1("Alex")
    person1.sayHi()

    var person2= Person2("Helena")
    person2.sayHi()

    var person3 = Person3("Viviana")

    person3.age=36.0
    println(person3.age)
    person3.age=-55.0
    println(person3.age)
}


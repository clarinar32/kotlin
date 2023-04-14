class Wanafunzi(val name:String,var age:Int,var gender:String, var stream:String){

}
fun main(args :Array<String>) {
    val obj = Wanafunzi("claris", 23, "female", "H")
    println("my name is: ${obj.name}")
    println("iam:${obj.age} years old")
    println("my gender is:${obj.gender}")
    println("My stream is:${obj.stream}")
    println("my name is :${obj.name}, iam from stream:${obj.stream},iam :${obj.age} years old")

}

class Hesabu{
    // data member
    private var number:Int=8
    //member function
    fun calculatesquare():Int{
        return number*number
    }
}
fun main(args:Array<String>){
    //create an object
    val myobject=Hesabu()
    println(myobject.calculatesquare())
}
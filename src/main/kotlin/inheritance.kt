open class MyparentClass{
  val dad="He likes playing a lot"
  val mum="she likes drawing"
}
class MyBoyClass:MyparentClass() {
    fun Myboy(){
        println(dad)
    }
}
class MyGirlClass :MyparentClass(){
    fun Mygirl(){
        println(mum)
    }

}
fun main(){
    val kijana=MyBoyClass()
    kijana.Myboy()
    val msichana=MyGirlClass()
    msichana.Mygirl()
}

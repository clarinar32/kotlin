fun main(args: Array<String>) {
    var myarray= arrayOf("claris","jane","pavan",55,true,'c')
    myarray[2]="clency"
    var myarray2= arrayOf(430,90,9,9,8,6,7)
    println("this is :" +myarray[2])
    println("the size of the array is :"+myarray2.size)

    println("sorted array2 is :"+myarray2.sorted())
}
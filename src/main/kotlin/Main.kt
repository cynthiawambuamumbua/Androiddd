fun main(){
    printName("Cynthia")
    var x = modulus(56, 36)
      var y=  addition(65,74,65,67)
    myself("I love reading novels")







}

fun printName(Name: String){
    println("Hello $Name")

}
fun modulus(num1: Int, num2: Int ): Int{
    var modulus = num1 % num2
    return modulus


}

fun addition(num1: Int, num2: Int, num3: Int, num4: Int): Int{
    var sum = num1 + num2 + num3 + num4
    return sum

}
fun myself(sentence: String){
    println("$sentence")
}



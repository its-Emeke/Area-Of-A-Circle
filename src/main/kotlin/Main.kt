fun main(args: Array<String>) {
    println("Welcome To Pie")
    println("Here We Calculate The Area Of A Circle")
    println("*******************")
    print("Enter The Value Of Your Radius : ")
    val radius = readln().toIntOrNull()
    if (radius == null){
        println("You Entered a Null Value , Enter Again")
        return
    }
    val area = Math.PI*radius*radius
    println("The Area of a circle of $radius is $area")
}
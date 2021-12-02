fun main() {
    println("What is your name?")
    val yourName = readLine()
    println("What is your birthdate?")
    val birthDate = Integer.valueOf(readLine())
    val birthYear = birthDate
    val yearToday = 2021
    println("$yourName is " + yearToday.minus(birthYear))


}

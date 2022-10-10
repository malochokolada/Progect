fun main(args: Array<String>) {
    //Задача 1
    val age1  = 42.0
    val age2  = 21.0

    //Задача 2 и 3
    val avg1 = ( age1 + age2 ) / 2
    /* Неверно то, что результат должен быть типа double, a не int
    При добавлении к значениям констант age1 и age2 ".0" мы получим нужный нам тип данных double*/
    //Задача 4
    val firstName = "Зулима"
    val lastName = "Чич"

     //Задача 5
     val fullName = firstName + " " + lastName

    //Задача 6
    val myDetails = "Привет, меня зовут $fullName"

    //Задача 7
    val date:Triple<Int,Int,Int> = Triple (12,10,1979)

    //Задача 8
    val (month, day, year) = date

    //Задача 9
    var (month1, _, year1) = date

    //Задача 10
    month1  = 6
    val creTriple = Pair( month1, year1)
    println(creTriple)


}
fun main(args: Array<String>) {
    //Задача 1
    val exercises : Int = 13
    var exercisesSolved : Int = 0
    exercisesSolved += 1

    //Задача 2
    val MyAge : Int = 18
    exercisesSolved += 1

    //Задача 3
    var k : Double = 18.0
    k = (k + 30) / 2 //19
    exercisesSolved += 1

    //Задача 4
    val testNumber : Int = 18
    val evenOdd : Int = testNumber % 2
    exercisesSolved += 1

    //Задача 5
    var answer : Int = 0
    answer += 1
    answer += 10
    answer *= 10
    answer shr 3
    exercisesSolved += 1

    //Задача 6
    var age : Int = 16
    print(age)
    age  = 30
    print(age)
    exercisesSolved += 1

    //Задача 7
    val a : Int = 46
    val b : Int = 10
    val answer1 : Int = (a * 100) + b
    val ansver2 : Int = (a * 100) + (b * 100)
    exercisesSolved += 1

    //Задача 8
    (5 * 3) - ( ( 4 / 2) * 2)
    exercisesSolved += 1

    //Задача 9
    val a : Double = 5.0
    val b : Double = 7.0
    val average : Double = ( a + b ) / 2
    exercisesSolved += 1

    //Задача 10
    val fahrenheit : Double = 114.0
    val celcius : Double = (fahrenheit - 32.0) / 1.8
    exercisesSolved += 1

    //Задача 11
    val position : Int = 36
    val row : Int = position / 8
    val colunm : Int = position % 8
    exercisesSolved += 1

    //Задача 12
    val degrees : Double = 360.0
    val radians : Double = (degrees / 180) * PI
    exercisesSolved += 1

    //Задача 13
    val x1 : Double = 2.0
    val y1 : Double = 3.0
    val x2 : Double = 1.0
    val y2 : Double = 2.0
    val disx : Double = (x2-x1)
    val disy : Double = (y2-y1)
        val distanse : Double = sqrt (disx * disx + disy * disy)
    exercisesSolved += 1

}
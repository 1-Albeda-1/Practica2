//Задание №2
//Создать приложение, которое подсчитывает количество различных символов во введенной строке.
//Символы в ответе расположить в алфавитном порядке. Например, дана строка AASADDSS.
//На выходе получаем:
//A - 3
//D - 2
//S - 3
fun main(args: Array<String>) {
    println("Задание №2")
    print("Введите строку:")
    var str:String = String()
    str = readln()
    var count:Int = 0
    val c = str.toCharArray()
    str = c.sorted().joinToString( "") + " "
    var res = str[0]

    for(x in str)
    {
        if(x == res)
        {
            count++
        }
        else
        {
            println(res+" - "+count.toString())
            res = x
            count = 1
        }
    }


}

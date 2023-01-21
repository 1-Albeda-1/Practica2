//Задание №1
//Создать приложение, которое подсчитывает количество подряд идущих одинаковых символов
//во введенной строке. На вход подается, например, строка AAADSSSRRTTHAAAA.
//На выходе получаем A3DS3R2T2HA4.
//То есть, если количество подряд идущих символов меньше двух, то мы не пишем единицу.
fun main(args: Array<String>)
{
    println("Задание №1")
    print("Введите строку:")
    var str:String = String()
    str = readln()
    var res = ""
    var c:Char = str[0]
    var count:Int = 0;
    str.forEach { Char
        if(c!=it)
        {
            res+=c+if(count.toString()!="1") count.toString() else ""
            count = 0
        }
        count++
        c = it
    }
    res+=c+if(count.toString()!="1") count.toString() else ""
    println("Преобразованная строка:$res")
}
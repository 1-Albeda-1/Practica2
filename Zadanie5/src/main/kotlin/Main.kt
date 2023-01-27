//Задание №5
//Создать приложение, с помощью которого пользователь,
//введя число n и основание степени x узнает,
//существует ли целочисленный показатель степени y для которого выполняется равенство xy = n.
//В случае, если показатель существует – вычислить его и вывести.
//В противном случае вывести текст – «Целочисленный показатель не существует».
import kotlin.math.log

fun main(args: Array<String>)
{
    println("Задание №5")
    println("Введите целое число: ")
    var n = readln()
    println("Введите целое осование")
    var f= readln();
    if(n.toIntOrNull()!=null && f.toIntOrNull()!=null)
    {
        if (log(n.toFloat(), f.toFloat()).toInt().toFloat() != log(n.toFloat(), f.toFloat())) {
            println("Целочисленный показатель не существует");
        }
        else
        {
            println(log(n.toFloat(), f.toFloat()))
        }
    }
    else
    {
        println("Введены не целые числа!")
    }
}
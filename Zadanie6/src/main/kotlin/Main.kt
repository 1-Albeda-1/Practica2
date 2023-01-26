//Задание № 6
//Создать приложение, в котором пользователь вводит две различных цифры. На выходе приложение выдает, если это возможно,
// из введенных цифр, нечетное число. Результат выводится в консоль. При невозможности создать нечетное число выводится
// сообщение – «Создать нечетное число невозможно»

fun main(args: Array<String>)
{
    println("Задание № 6")
    println("Введите первую цифру")
    val a: Int = readln()!!.toInt()
    println("Введите вторую цифру")
    val b: Int = readln()!!.toInt()
    var res=0
    var B = true
    if (b%2!==0 && a%2!==0)
    {
        println(a.toString()+b.toString()+" или "+b.toString()+a.toString())
    }
    else if (a % 2!==0)
    {
        println(b.toString()+a.toString())
    }
    else if (b % 2!==0)
    {
        println(a.toString() + b.toString())
    }
    else
    {
        println("Создать нечётное число невозможно")
        B= false
    }
}
//Задане №3
//Создать приложение,которое преобразует введенное пользователем натуральное число из 10-ичной системы в двоичную.
fun main(args: Array<String>) {
    println("Задание №3")
    print("Введите число:")
    var str:String = String()
    str = readln()
    print("Число в двоичной системе:")
    println(str.toInt().toString(2))
}
/*Задача 4.
Pадача 5.
Создать приложение, в котором пользователь вводит массив из различных слов. На выходе приложение должно показать слова сгруппированные по признаку "состоят из одинаковых букв".
 апример, на входе [eat,tea,tan,ate,nat,bat]. Получаем группы:
"ate", "eat", "tea"
"nat", "tan"
"bat" */
fun main() {
    println("Введите последовательность слов через запятую без пробелов.\nПример: eat,tea,tan,ate,nat,bat")
    try {
        val inputSrt = readln().split(',').toMutableList()
        var arr = mutableMapOf("" to 1)
        var usedId = mutableListOf(0)
        usedId.clear()
        for (i in 0 until inputSrt.size) {
            arr.clear()
            for (j in 0 until inputSrt.size)
                if (inputSrt[i].toSortedSet() == inputSrt[j].toSortedSet() && !arr.contains(inputSrt[j]) && !usedId.contains(j))
                    arr.put(inputSrt[j],j)
            for (t in arr.values)
                usedId.add(t)
            println(if(arr.keys.size != 0) arr.keys.toString() else continue)
        }
    }catch (e:Exception) {
        println("Ошибка")
        return
    }
}
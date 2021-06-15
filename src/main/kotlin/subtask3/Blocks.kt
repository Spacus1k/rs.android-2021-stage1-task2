package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {

        when (blockB) {
            String::class -> return stringConcatenation(blockA)
            Int::class -> return sumOfNumbers(blockA)
            LocalDate::class -> return getLateDate(blockA)
        }
        return Any()
    }

    private fun stringConcatenation(array: Array<*>): String {
        var outputString = ""
        array.forEach {
            if (it is String) {
                outputString += it
            }
        }
        return outputString
    }

    private fun sumOfNumbers(array: Array<*>): Int {
        var sum = 0
        array.forEach {
            if (it is Int) {
                sum += it
            }
        }
        return sum
    }

    private fun getLateDate(array: Array<*>): String {
        var lateDate = LocalDate.MIN

        array.forEach {
            if (it is LocalDate && it.isAfter(lateDate)) {
                lateDate = it
            }
        }
        return lateDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
    }
}

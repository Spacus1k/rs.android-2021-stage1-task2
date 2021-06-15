package subtask1

import java.text.SimpleDateFormat
import java.util.*

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        val calendar = Calendar.getInstance()
            calendar.isLenient = false
        val formatter = SimpleDateFormat("dd MMMM, EEEE", Locale("Ru"))
        return try {
            calendar.set(year.toInt(), month.toInt() - 1, day.toInt())
            formatter.format(calendar.time)
        } catch (exception: Exception) {
            "Такого дня не существует"
        }
    }
}

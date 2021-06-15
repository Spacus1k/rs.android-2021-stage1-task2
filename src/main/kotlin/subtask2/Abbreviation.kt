package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        var flag = false
        val filteredString = a.filter { b.contains(it, true) }
        if (filteredString.toUpperCase() == b) {
            flag = true
        }

        return if (flag) {
            "YES"
        } else {
            "NO"
        }
    }
}

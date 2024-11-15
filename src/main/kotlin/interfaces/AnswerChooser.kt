package interfaces

/**
 * Интерфейс для классов с выбором ответа на запрос
 */
interface AnswerChooser {
    fun getAnswer(question: String): String
    fun setThresholdValue(value: Double)
}


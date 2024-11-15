package interfaces

import utils.SortInput

/**
 * Интерфейс для класса, взаимодействующего с базой данных для статистического анализа
 */
interface StatisticDataRequest {
    fun setConnection(dao: DAOConnection)
    fun findAnalogue(sorter: SortInput, input: String): List<String>?
    fun setNewWord(input: List<String>): String?
}



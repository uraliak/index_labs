package dataTypes

/**
 * Класс для хранения пресетов запросов
 */
enum class QueryTypes(private val type: String) {
    /**
     * Select-запрос
     */
    SELECT("select [params] from"),

    /**
     * Insert-запрос
     */
    INSERT("insert into"),

    /**
     * Update-запрос
     */
    UPDATE("update"),

    /**
     * Delete-запрос
     */
    DELETE("delete from");

    override fun toString(): String {
        return type
    }
}

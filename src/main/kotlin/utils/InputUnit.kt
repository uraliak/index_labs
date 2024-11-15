package utils

import dataTypes.Methods

/**
 *  Класс для хранения данных, вводимых пользователем
 */
class InputUnit(input: String, method: Methods = Methods.STATISTIC) {
    private var unit: List<String>? = input.split(' ')
    fun getData() = unit
}


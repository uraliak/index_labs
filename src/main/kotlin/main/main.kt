package main

import implementations.database.DAO
import implementations.StatisticAnswerChooser
import dataTypes.QueryTypes

fun main() {
    val dao = DAO()
    dao.openConnection("wordsdb.db")

    val question = "как добежать в библиотеку"
    val cleanedQuestion = question.replace(Regex("[^а-яА-Я\\s]"), "").split(" ")

    val answerChooser = StatisticAnswerChooser(dao)

    val queryResult = dao.queryExecute("SELECT question FROM questions_and_answers", "question", QueryTypes.SELECT)

    println("Запрос пользователя (очищенный): $cleanedQuestion")
    println("Запросы из БД: $queryResult")

    val synonymsResult = dao.queryExecute("SELECT word FROM words", "word", QueryTypes.SELECT)
    println("Синонимы из БД (после добавления новых слов): $synonymsResult")

    val answer = answerChooser.getAnswer(question)
    println("Ответ: $answer")

    dao.closeConnection()
}

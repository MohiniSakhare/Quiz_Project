package com.example.quiz_project

object Constant {
fun getQuentions(): ArrayList<Question>{
    val questionsList = ArrayList<Question>()

    val que1 = Question(
    1,
    "what is your name?",
    "gunjan",
    "mohini",
    "sunny",
    "pinky",
    2)
    questionsList.add(que1)

    val que2 = Question(
        2,
        "what is your fav color ?",
        "pink",
        "blue",
        "green",
        "black",
        4)
    questionsList.add(que2)

    val que3 = Question(
        3,
        "what is your city name?",
        "bhandara",
        "nagpur",
        "wardha",
        "mumbai",
        2)
    questionsList.add(que3)
    return questionsList
}
}
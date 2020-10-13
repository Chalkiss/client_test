package com.example.client_test

fun main(args: Array<String>) {
    var answer = "Test. ,replace"
    val re = Regex("[^A-Za-z0-9 ]")
    answer = re.replace(answer, "")
    println(answer)
}
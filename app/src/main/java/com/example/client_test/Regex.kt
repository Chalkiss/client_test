package com.example.client_test

fun decodeText(inputString: String): String {
    var answer = inputString
    answer = answer.replace("\\xc4\\x85", "ą")
    answer = answer.replace("\\xc4\\x87", "ć")
    answer = answer.replace("\\xc5\\x84", "ń")
    answer = answer.replace("\\xc4\\x99", "ę")
    answer = answer.replace("\\xc5\\x82", "ł")
    answer = answer.replace("\\xc3\\xb3", "ó")
    answer = answer.replace("\\xc5\\x9b", "ś")
    answer = answer.replace("\\xc5\\xba", "ź")
    answer = answer.replace("\\xc5\\xbc", "ż")
    answer = answer.replace("\\xc4\\x84", "Ą")
    answer = answer.replace("\\xc4\\x86", "Ć")
    answer = answer.replace("\\xc4\\x98", "Ę")
    answer = answer.replace("\\xc5\\x81", "Ł")
    answer = answer.replace("\\xc5\\x83", "Ń")
    answer = answer.replace("\\xc3\\x93", "Ó")
    answer = answer.replace("\\xc5\\x9a", "Ś")
    answer = answer.replace("\\xc5\\xb9", "Ź")
    answer = answer.replace("\\xc5\\xbb", "Ż")
    answer = answer.replace("\\xe2\\x80\\x93", "–")
    answer = answer.replace("€€€", "\n")
    return(answer)
}
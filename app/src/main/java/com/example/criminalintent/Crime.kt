package com.example.criminalintent

import java.util.*

data class Crime(
    val id: UUID = UUID.randomUUID(),    //генерирование универсально-уникальных ID
    var title: String = "",
    var date: Date = Date(),             //по умолчанию задает текущую дату
    var isSolved: Boolean = false
)

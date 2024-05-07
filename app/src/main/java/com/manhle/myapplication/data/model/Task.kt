package com.breens.todochamp.data.model

import androidx.compose.ui.graphics.vector.ImageVector

data class Card(
    val cardId: String = "",
    val image: String = "",
    val title: String = "",
    val body: String = "",
    val price: Int = 0,
    val createdAt: String = "",

)

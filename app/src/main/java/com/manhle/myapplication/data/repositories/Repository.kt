package com.breens.todochamp.data.repositories

import com.breens.todochamp.common.Result
import com.breens.todochamp.data.model.Card

interface Repository {

    suspend fun getAllCards(): Result<List<Card>>

}



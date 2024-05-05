package com.breens.todochamp.data.repositories

import android.util.Log
import com.breens.todochamp.common.COLLECTION_PATH_NAME
import com.breens.todochamp.common.PLEASE_CHECK_INTERNET_CONNECTION
import com.breens.todochamp.common.Result
import com.breens.todochamp.common.convertDateFormat
import com.breens.todochamp.data.model.Card
import com.breens.todochamp.di.IoDispatcher
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val orderfoodDB: FirebaseFirestore,
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher,
) : Repository {

    override suspend fun getAllCards(): Result<List<Card>> {
        return try {
            withContext(ioDispatcher) {
                val fetchingCardsTimeout = withTimeoutOrNull(10000L) {
                    orderfoodDB.collection(COLLECTION_PATH_NAME)
                        .get()
                        .await()
                        .documents.map { document ->
                            Card(
                                cardId = document.id,
                                image = document.getString("image") ?: "",
                                title = document.getString("title") ?: "",
                                body = document.getString("body") ?: "",
                                price = document.get("price")?.let {
                                    when (it) {
                                        is Long -> it.toInt()
                                        is Double -> it.toInt()
                                        is String -> it.toIntOrNull() ?: 0
                                        else -> 0
                                    }
                                } ?: 0,
                                createdAt = convertDateFormat(
                                    document.getString("createdAt") ?: "",
                                ),
                            )
                        }
                }

                if (fetchingCardsTimeout == null) {
                    Log.d("ERROR: ", PLEASE_CHECK_INTERNET_CONNECTION)

                    Result.Failure(IllegalStateException(PLEASE_CHECK_INTERNET_CONNECTION))
                }

                Log.d("CARDS: ", "${fetchingCardsTimeout?.toList()}")

                Result.Success(fetchingCardsTimeout?.toList() ?: emptyList())
            }
        } catch (exception: Exception) {
            Log.d("ERROR: ", "$exception")

            Result.Failure(exception = exception)
        }
    }






}

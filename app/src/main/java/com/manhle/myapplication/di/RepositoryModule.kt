package com.breens.todochamp.di


import com.breens.todochamp.data.repositories.Repository
import com.breens.todochamp.data.repositories.RepositoryImpl

import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton



    fun provideNoteRepository(
        firebaseFirestore: FirebaseFirestore,
        @IoDispatcher ioDispatcher: CoroutineDispatcher,
    ): Repository {
        return RepositoryImpl(
            orderfoodDB = firebaseFirestore,
            ioDispatcher = ioDispatcher,
        )
    }


}


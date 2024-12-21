package com.utad.rvwithmvvc.di

import com.utad.rvwithmvvc.data.network.MovieApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    // Connexion de retrofit a la pagina web
    @Singleton
    @Provides
    fun provideRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl(Constantes.URL_API)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        }

    @Singleton
    @Provides
    fun provideQuoteApiClient(retrofit: Retrofit):MovieApiClient{
        return retrofit.create(MovieApiClient::class.java)
    }
}
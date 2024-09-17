package br.senai.sp.jandira.rickandmorty.service

import br.senai.sp.jandira.telainicio.service.MateriaService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {

    private val BASE_URL = "http://10.107.134.22:8080/v1/studyfy/"

    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getMateriaService(): MateriaService {
        return retrofitFactory.create(MateriaService::class.java)
    }
}
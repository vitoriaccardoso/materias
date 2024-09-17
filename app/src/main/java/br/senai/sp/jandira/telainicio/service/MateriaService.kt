package br.senai.sp.jandira.telainicio.service

import retrofit2.Call
import br.senai.sp.jandira.telainicio.model.ResultMateria
import retrofit2.http.GET

interface MateriaService {

    @GET("materia")
    fun getAllMaterias(): Call<ResultMateria>
}
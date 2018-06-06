package com.bzh.dytt.api

import android.arch.lifecycle.LiveData
import com.bzh.dytt.vo.MovieDetailResponse
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query


interface NetworkService {

    @POST("/adminapi/api/movieList.json")
    fun movieList(
            @Header("x-header-request-timestamp") headerTimestamp: String = "",
            @Header("x-header-request-key") headerKey: String = "",
            @Header("x-header-request-imei") headerImei: String = "",
            @Query("categoryId") categoryId: Int? = 9,
            @Query("page") page: Int? = 1,
            @Query("searchContent") searchContent: String? = ""): LiveData<ApiResponse<MovieDetailResponse>>

//    @GET("/adminapi/api/movieDetail.json")
//    fun a(@Query("categoryId") i: Int, @Query("movieDetailId") j: Long): d<MovieDetailDto>
}
package com.example.fragmentsandviewmodel.services;

import com.example.fragmentsandviewmodel.models.Reciepe;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("api/")
    public Call<Reciepe> getRecipe();
}

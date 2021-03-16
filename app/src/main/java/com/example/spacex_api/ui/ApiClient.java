package com.example.spacex_api.ui;

import com.example.spacex_api.Network.APIService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static APIService getService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APIService.URL_BASE).addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(APIService.class);
    }
}

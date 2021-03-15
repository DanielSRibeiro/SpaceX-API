package com.example.spacex_api.Network;

import com.example.spacex_api.Model.RocketModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {
    String URL_BASE = "https://api.spacexdata.com/v2/";

    @GET("launches")
    Call<ArrayList<RocketModel>> getRockets(@Query("order") String order);
}

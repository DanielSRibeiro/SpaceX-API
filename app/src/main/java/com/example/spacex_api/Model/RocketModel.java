package com.example.spacex_api.Model;

import com.google.gson.annotations.SerializedName;

public class RocketModel {

    @SerializedName("launch_year")
    String data;

    Rocket rocket;

    @SerializedName("launch_success")
    boolean sucesso;

    @SerializedName("mission_name")
    String rocketName;

    public String getRocketName() {
        return rocketName;
    }

    public void setRocketName(String rocketName) {
        this.rocketName = rocketName;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public Boolean getSucesso() {
        return sucesso;
    }

    public void setSucesso(Boolean sucesso) {
        this.sucesso = sucesso;
    }
}

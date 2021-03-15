package com.example.spacex_api.Model;

import com.google.gson.annotations.SerializedName;

public class Payloads {


    @SerializedName("payload_type")
    String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

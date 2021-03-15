package com.example.spacex_api.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class SecondStage {

    @SerializedName("payloads")
    ArrayList<Payloads> payloads;

    public ArrayList<Payloads> getPayloads() {
        return payloads;
    }

    public void setPayloads(ArrayList<Payloads> payloads) {
        this.payloads = payloads;
    }
}

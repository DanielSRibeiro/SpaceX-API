package com.example.spacex_api.Model;

import com.google.gson.annotations.SerializedName;

public class Rocket {

    @SerializedName("second_stage")
    SecondStage secondStage;

    public SecondStage getSecondStage() {
        return secondStage;
    }

    public void setSecondStage(SecondStage secondStage) {
        this.secondStage = secondStage;
    }
}

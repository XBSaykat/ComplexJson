package com.xbsaykat.complexjsonintrigrationwithretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelWind {
    @SerializedName("speed")
    @Expose
    private double speed;

    @SerializedName("deg")
    @Expose
    private double deg;
}

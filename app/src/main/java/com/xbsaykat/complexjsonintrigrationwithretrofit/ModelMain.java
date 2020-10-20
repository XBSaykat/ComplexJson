package com.xbsaykat.complexjsonintrigrationwithretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelMain {
    @SerializedName("temp")
    @Expose
    private double temp;

    @SerializedName("feels_like")
    @Expose
    private double feels_like;

    @SerializedName("temp_min")
    @Expose
    private double temp_min;

    @SerializedName("temp_max")
    @Expose
    private double temp_max;

    @SerializedName("pressure")
    @Expose
    int pressure;

    @SerializedName("humidity")
    @Expose
    int humidity;


}

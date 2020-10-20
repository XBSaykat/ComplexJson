package com.xbsaykat.complexjsonintrigrationwithretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelWeather {
    @SerializedName("id")
    @Expose
    public int id;

    @SerializedName("main")
    @Expose
    public String main;

    @SerializedName("description")
    @Expose
    public String description;

    @SerializedName("icon")
    @Expose
    public String icon;

    public int getId() {
        return id;
    }

    public String getMain() {
        return main;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }
}

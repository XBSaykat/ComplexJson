package com.xbsaykat.complexjsonintrigrationwithretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Model {
    @SerializedName("coord")
    @Expose
    public ModelCoord coord;

    @SerializedName("weather")
    @Expose
    public List<ModelWeather> weather;

    @SerializedName("base")
    @Expose
    public String base;

    @SerializedName("main")
    @Expose
    public ModelMain main;

    @SerializedName("visibility")
    @Expose
    public long visibility;

    @SerializedName("wind")
    @Expose
    public ModelWind wind;

    @SerializedName("clouds")
    @Expose
    public ModelClouds clouds;

    @SerializedName("dt")
    @Expose
    public long dt;

    @SerializedName("sys")
    @Expose
    public ModelSys sys;

    @SerializedName("timezone")
    @Expose
    public long timezone;

    @SerializedName("id")
    @Expose
    public long id;

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("cod")
    @Expose
    public int cod;

    public ModelCoord getCoord() {
        return coord;
    }

    public List<ModelWeather> getWeather() {
        return weather;
    }

    public String getBase() {
        return base;
    }

    public ModelMain getMain() {
        return main;
    }

    public long getVisibility() {
        return visibility;
    }

    public ModelWind getWind() {
        return wind;
    }

    public ModelClouds getClouds() {
        return clouds;
    }

    public long getDt() {
        return dt;
    }

    public ModelSys getSys() {
        return sys;
    }

    public long getTimezone() {
        return timezone;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCod() {
        return cod;
    }
}

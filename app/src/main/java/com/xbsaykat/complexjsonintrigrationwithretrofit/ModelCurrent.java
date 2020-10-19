package com.xbsaykat.complexjsonintrigrationwithretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelCurrent {
    @SerializedName("dt")
    @Expose
    long dt;

    @SerializedName("sunrise")
    @Expose
    long sunrise;

    @SerializedName("sunset")
    @Expose
    long sunset;

    @SerializedName("temp")
    @Expose
    double temp;

    @SerializedName("feels_like")
    @Expose
    double feels_like;

    @SerializedName("pressure")
    @Expose
    int pressure;

    @SerializedName("humidity")
    @Expose
    int humidity;

    @SerializedName("dew_point")
    @Expose
    double dew_point;

    @SerializedName("uvi")
    @Expose
    double uvi;

    @SerializedName("clouds")
    @Expose
    int clouds;

    @SerializedName("visibility")
    @Expose
    int visibility;

    @SerializedName("wind_speed")
    @Expose
    double wind_speed;

    @SerializedName("wind_deg")
    @Expose
    int wind_deg;

    @SerializedName("weather")
    @Expose
    private List<modelWether> weather;

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public long getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(double feels_like) {
        this.feels_like = feels_like;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getDew_point() {
        return dew_point;
    }

    public void setDew_point(double dew_point) {
        this.dew_point = dew_point;
    }

    public double getUvi() {
        return uvi;
    }

    public void setUvi(double uvi) {
        this.uvi = uvi;
    }

    public int getClouds() {
        return clouds;
    }

    public void setClouds(int clouds) {
        this.clouds = clouds;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public double getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(double wind_speed) {
        this.wind_speed = wind_speed;
    }

    public int getWind_deg() {
        return wind_deg;
    }

    public void setWind_deg(int wind_deg) {
        this.wind_deg = wind_deg;
    }

    public List<modelWether> getWeather() {
        return weather;
    }

    public void setWeather(List<modelWether> weather) {
        this.weather = weather;
    }
}

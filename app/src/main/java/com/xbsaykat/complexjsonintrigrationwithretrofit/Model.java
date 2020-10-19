package com.xbsaykat.complexjsonintrigrationwithretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Model {
    @SerializedName("coord")
    @Expose
    private List<modelCoord> coord;

    public List<modelCoord> getCoord() {
        return coord;
    }

    public void setCoord(List<modelCoord> coord) {
        this.coord = coord;
    }
}


package org.fossasia.susi.ai.rest.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;


public class Datum extends RealmObject{

    @SerializedName("0")
    @Expose
    String _0;
    @SerializedName("1")
    @Expose
    String _1;
    @SerializedName("answer")
    @Expose
    String answer;
    @SerializedName("query")
    @Expose
    String query;
    @SerializedName("lon")
    @Expose
    Double lon;
    @SerializedName("place")
    @Expose
    String place;
    @SerializedName("lat")
    @Expose
    Double lat;
    @SerializedName("population")
    @Expose
    Integer population;
    @SerializedName("percent")
    @Expose
    Float percent;
    @SerializedName("president")
    @Expose
    String president;

    public String get_0() {
        return _0;
    }

    public String get_1() {
        return _1;
    }

    public String getAnswer() {
        return answer;
    }

    public String getQuery() {
        return query;
    }

    public Double getLon() {
        return lon;
    }

    public String getPlace() {
        return place;
    }

    public Double getLat() {
        return lat;
    }

    public Integer getPopulation() {
        return population;
    }

    public Float getPercent(){ return percent; }

    public String getPresident(){ return president; }
}

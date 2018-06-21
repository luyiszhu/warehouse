package com.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author lepdou 2017-06-18
 */
@Entity
@Table(name = "usermove")
public class Usermove {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "mdn")
    private String mdn;

    @Column(name = "lon")
    private double lon;

    @Column(name = "lat")
    private double lat;

    @Column(name = "time")
    private int time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public String getMdn() {
        return mdn;
    }

    public void setMdn(String mdn) {
        this.mdn = mdn;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Usermove{" +
                "id=" + id +
                ", mdn=" + mdn +
                ", lon=" + lon +
                ", lat=" + lat +
                ", time=" + time +
                '}';
    }
}

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
@Table(name = "sale")
public class Sale {

  @Id
  @GeneratedValue
  @Column(name = "Id")
  private int id;

  @Column(name = "mdn")
  private String mdn;

  @Column(name = "lon")
  private double lon;

  @Column(name = "lat")
  private double lat;

  @Column(name = "time")
  private int time;

  @Column(name = "area")
  private String area;

  @Column(name = "street")
  private String street;


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

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  @Override
  public String toString() {
    return "Sale{" +
           "id=" + id +
            ", mdn=" + mdn +
           ", lon=" + lon +
           ", lat=" + lat +
            ", time=" + time +
            ", area=" +area +
            ", street=" + street +
           '}';
  }
}

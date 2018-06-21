package com.demo.Entity;

import javax.persistence.*;

/**
 * Created by Lenovo on 2018/6/6.
 */
@Entity
@Table(name = "indoor_measure")
public class Position {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "pointid")
    private int pointid;

    @Column(name = "cme")
    private String cme;

    @Column(name = "meid")
    private String meid;

    @Column(name = "imsi")
    private String imsi;

    @Column(name = "ip")
    private String ip;

    @Column(name = "cid")
    private String cid;

    @Column(name = "snr")
    private String snr;

    @Column(name = "pci")
    private String pci;


    @Column(name = "rsrq")
    private String rsrq;

    @Column(name = "signal_power")
    private String signal_power;

    @Column(name = "total_power")
    private String total_power;

    @Column(name = "ecl")
    private String ecl;

    @Column(name = "earfcn")
    private String earfcn;

    @Column(name = "tx_power")
    private String tx_power;

    @Column(name = "tx_time")
    private int tx_time;

    @Column(name = "rx_time")
    private int rx_time;

    @Column(name = "location")
    private String location;

    @Column(name = "remark")
    private String remark;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "geohash")
    private String geohash;

    @Column(name = "savetime")
    private String savetime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCme() {
        return cme;
    }

    public void setCme(String cme) {
        this.cme = cme;
    }

    public String getMeid() {
        return meid;
    }

    public void setMeid(String meid) {
        this.meid = meid;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getSnr() {
        return snr;
    }

    public void setSnr(String snr) {
        this.snr = snr;
    }

    public String getPci() {
        return pci;
    }

    public void setPci(String pci) {
        this.pci = pci;
    }

    public String getRsrq() {
        return rsrq;
    }

    public void setRsrq(String rsrq) {
        this.rsrq = rsrq;
    }



    public String getEcl() {
        return ecl;
    }

    public void setEcl(String ecl) {
        this.ecl = ecl;
    }

    public String getEarfcn() {
        return earfcn;
    }

    public void setEarfcn(String earfcn) {
        this.earfcn = earfcn;
    }

    public String getTx_power() {
        return tx_power;
    }

    public void setTx_power(String tx_power) {
        this.tx_power = tx_power;
    }

    public int getTx_time() {
        return tx_time;
    }

    public void setTx_time(int tx_time) {
        this.tx_time = tx_time;
    }

    public int getRx_time() {
        return rx_time;
    }

    public void setRx_time(int rx_time) {
        this.rx_time = rx_time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getGeohash() {
        return geohash;
    }

    public void setGeohash(String geohash) {
        this.geohash = geohash;
    }

    public String getSavetime() {
        return savetime;
    }

    public void setSavetime(String savetime) {
        this.savetime = savetime;
    }

    public int getPointid() {
        return pointid;
    }

    public void setPointid(int pointid) {
        this.pointid = pointid;
    }

    public String getSignal_power() {
        return signal_power;
    }

    public void setSignal_power(String signal_power) {
        this.signal_power = signal_power;
    }

    public String getTotal_power() {
        return total_power;
    }

    public void setTotal_power(String total_power) {
        this.total_power = total_power;
    }
}

package com.windylee.scene.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by windy on 17/4/19.
 */
@Entity
@Table(name = "mode")
public class Scene {

    @Id
    @GeneratedValue
    private int uuid;
    private int id;
    private String sceneName;
    private String sceneDesc;
    private int alarmVolume;
    private int mediaVolume;
    private int ringVolume;
    private int gprs;
    private int wifi;
    private String wifiname;
    private int ringmode;
    private int lightmode;
    private int lightness;
    private int bluetooth;
    private double latitude;
    private double longitude;
    private int hour;
    private int minute;
    private int autoRotate;
    private String ringUri;
    private int type;
    private int userId;

    public int getUuid() {
        return uuid;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public String getSceneDesc() {
        return sceneDesc;
    }

    public void setSceneDesc(String sceneDesc) {
        this.sceneDesc = sceneDesc;
    }

    public int getAlarmVolume() {
        return alarmVolume;
    }

    public void setAlarmVolume(int alarmVolume) {
        this.alarmVolume = alarmVolume;
    }

    public int getMediaVolume() {
        return mediaVolume;
    }

    public void setMediaVolume(int mediaVolume) {
        this.mediaVolume = mediaVolume;
    }

    public int getRingVolume() {
        return ringVolume;
    }

    public void setRingVolume(int ringVolume) {
        this.ringVolume = ringVolume;
    }

    public int getGprs() {
        return gprs;
    }

    public void setGprs(int gprs) {
        this.gprs = gprs;
    }

    public int getWifi() {
        return wifi;
    }

    public void setWifi(int wifi) {
        this.wifi = wifi;
    }

    public String getWifiname() {
        return wifiname;
    }

    public void setWifiname(String wifiname) {
        this.wifiname = wifiname;
    }

    public int getRingmode() {
        return ringmode;
    }

    public void setRingmode(int ringmode) {
        this.ringmode = ringmode;
    }

    public int getLightmode() {
        return lightmode;
    }

    public void setLightmode(int lightmode) {
        this.lightmode = lightmode;
    }

    public int getLightness() {
        return lightness;
    }

    public void setLightness(int lightness) {
        this.lightness = lightness;
    }

    public int getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(int bluetooth) {
        this.bluetooth = bluetooth;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getAutoRotate() {
        return autoRotate;
    }

    public void setAutoRotate(int autoRotate) {
        this.autoRotate = autoRotate;
    }

    public String getRingUri() {
        return ringUri;
    }

    public void setRingUri(String ringUri) {
        this.ringUri = ringUri;
    }
}

package com.yang.vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author: YangJiao
 * @email 1320259466@qq.com
 * @date: 2022/6/2
 * @time: 16:38
 * @fuction: about the role of class.
 */
public class PlayVO {
    private Long id;

    private String playId;

    private String filmId;

    private  String filmName;

    private Date playTime;
    private String playTimeStr;

    private String lanType;

    private String roomId;

    private String roomName;

    private BigDecimal price;

    public PlayVO() {
    }

    public PlayVO(Long id, String playId, String filmId, String filmName, Date playTime, String lanType, String roomId, String roomName, BigDecimal price) {
        this.id = id;
        this.playId = playId;
        this.filmId = filmId;
        this.filmName = filmName;
        this.playTime = playTime;
        this.lanType = lanType;
        this.roomId = roomId;
        this.roomName = roomName;
        this.price = price;
    }
    public String getPlayTimeStr() {
        return playTimeStr;
    }

    public void setPlayTimeStr(String playTimeStr) {
        this.playTimeStr = playTimeStr;
    }
    @Override
    public String toString() {
        return "PlayVO{" +
                "id=" + id +
                ", playId='" + playId + '\'' +
                ", filmId='" + filmId + '\'' +
                ", filmName='" + filmName + '\'' +
                ", playTime=" + playTime +
                ", lanType='" + lanType + '\'' +
                ", roomId='" + roomId + '\'' +
                ", roomName='" + roomName + '\'' +
                ", price=" + price +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayId() {
        return playId;
    }

    public void setPlayId(String playId) {
        this.playId = playId;
    }

    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public Date getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Date playTime) {
        this.playTime = playTime;
    }

    public String getLanType() {
        return lanType;
    }

    public void setLanType(String lanType) {
        this.lanType = lanType;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

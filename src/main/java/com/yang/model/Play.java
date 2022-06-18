package com.yang.model;

import java.math.BigDecimal;
import java.util.Date;

public class Play {

    private Long id;

    private String playId;

    private String filmId;

    private Date playTime;

    private String lanType;

    private String roomId;

    private String roomName;

    private BigDecimal price;

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

    @Override
    public String toString() {
        return "Play{" +
                "id=" + id +
                ", playId='" + playId + '\'' +
                ", filmId='" + filmId + '\'' +
                ", playTime=" + playTime +
                ", lanType='" + lanType + '\'' +
                ", roomId='" + roomId + '\'' +
                ", roomName='" + roomName + '\'' +
                ", price=" + price +
                '}';
    }
}
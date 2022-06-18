package com.yang.vo;

import java.sql.Date;

/**
 * @author: YangJiao
 * @email 1320259466@qq.com
 * @date: 2022/5/31
 * @time: 18:26
 * @fuction: about the role of class.
 */
public class FilmDetailVO {

    private String filmId;
    private String filmName;
    private String imgPath;

    private String director;
    private String player;
    private String type;
    private String synopsis;
    private String country;
    private int length;
    private Date playTime;

    public FilmDetailVO(String filmId, String filmName, String imgPath, String director, String player, String type, String synopsis, String country, int length, Date playTime) {
        this.filmId = filmId;
        this.filmName = filmName;
        this.imgPath = imgPath;
        this.director = director;
        this.player = player;
        this.type = type;
        this.synopsis = synopsis;
        this.country = country;
        this.length = length;
        this.playTime = playTime;
    }

    @Override
    public String toString() {
        return "FilmDetailVO{" +
                "filmTd='" + filmId + '\'' +
                ", filmName='" + filmName + '\'' +
                ", imgPath='" + imgPath + '\'' +
                ", director='" + director + '\'' +
                ", player='" + player + '\'' +
                ", type='" + type + '\'' +
                ", sysnopsis='" + synopsis + '\'' +
                ", country='" + country + '\'' +
                ", length=" + length +
                ", playTime=" + playTime +
                '}';
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public FilmDetailVO(){}

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

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Date getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Date playTime) {
        this.playTime = playTime;
    }
}

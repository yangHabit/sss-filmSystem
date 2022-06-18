package com.yang.vo;

/**
 * @author: YangJiao
 * @email 1320259466@qq.com
 * @date: 2022/5/30
 * @time: 19:01
 * @fuction: about the role of class.
 * @desc:view object=视图层对象
 */
public class FilmVO {

    private String filmId;
    private String name;
    private String imgPath;
    private String director;
    public FilmVO() {
    }

    public FilmVO(String filmId, String name, String imgPath, String director) {
        this.filmId = filmId;
        this.name = name;
        this.imgPath = imgPath;
        this.director = director;
    }

    @Override
    public String toString() {
        return "FilmVO{" +
                "filmId='" + filmId + '\'' +
                ", name='" + name + '\'' +
                ", imgPath='" + imgPath + '\'' +
                ", director='" + director + '\'' +
                '}';
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}

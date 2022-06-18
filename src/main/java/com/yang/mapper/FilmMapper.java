package com.yang.mapper;

import com.yang.model.Film;

import java.util.List;

/**
 * @author: YangJiao
 * @email 1320259466@qq.com
 * @date: 2022/5/30
 * @time: 18:57
 * @fuction: about the role of class.
 */
public interface FilmMapper {

    List<Film> getFilms();
    Film getFilmById(String filmId);
}

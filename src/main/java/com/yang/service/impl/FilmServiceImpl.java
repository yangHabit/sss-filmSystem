package com.yang.service.impl;

import com.yang.mapper.FilmMapper;
import com.yang.model.Film;
import com.yang.service.FilmServic;
import com.yang.vo.FilmDetailVO;
import com.yang.vo.FilmVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: YangJiao
 * @email 1320259466@qq.com
 * @date: 2022/5/30
 * @time: 19:15
 * @fuction: about the role of class.
 */
@Service
public class FilmServiceImpl implements FilmServic {
    @Autowired
    private FilmMapper filmMapper;

    public List<FilmVO> selectAll() {
        List<Film> filmList = filmMapper.getFilms();
//        System.out.println(filmList.toString());
        List<FilmVO> filmVOList = new ArrayList<FilmVO>(filmList.size());
        for(Film film : filmList){
            FilmVO vo = new FilmVO();
            vo.setFilmId(film.getFilm_id());
            vo.setName(film.getFilm_name());
            vo.setImgPath(film.getImg_path());
            vo.setDirector(film.getDirector());
            filmVOList.add(vo);
        }
        return filmVOList;
    }

    public FilmDetailVO selectById(String filmId) {
        Film film = filmMapper.getFilmById(filmId);
        FilmDetailVO detailVO = new FilmDetailVO();
        detailVO.setFilmId(film.getFilm_id());
        detailVO.setDirector(film.getDirector());
        detailVO.setPlayer(film.getPlayer());
        detailVO.setImgPath(film.getImg_path());
        detailVO.setType(film.getType());
        detailVO.setSynopsis(film.getSynopsis());
        detailVO.setCountry(film.getCountry());
        detailVO.setLength(film.getLength());

        return detailVO;
    }
}

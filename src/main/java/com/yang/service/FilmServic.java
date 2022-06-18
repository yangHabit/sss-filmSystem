package com.yang.service;

import com.yang.model.Film;
import com.yang.vo.FilmDetailVO;
import com.yang.vo.FilmVO;

import java.util.List;

/**
 * @author: YangJiao
 * @email 1320259466@qq.com
 * @date: 2022/5/30
 * @time: 19:00
 * @fuction: about the role of class.
 */
public interface FilmServic {
    List<FilmVO> selectAll();
    FilmDetailVO selectById(String filmId);

}

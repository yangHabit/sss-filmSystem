package com.yang.service;

import com.yang.vo.PlayDetailVO;
import com.yang.vo.PlayVO;

import java.util.List;

/**
 * @author: YangJiao
 * @email 1320259466@qq.com
 * @date: 2022/6/2
 * @time: 16:42
 * @fuction: about the role of class.
 */
public interface PlayService {

    List<PlayVO> getPlaysByFilmId(String filmId);

    PlayDetailVO getDetailById(String playId);

}

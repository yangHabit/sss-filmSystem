package com.yang.service.impl;

import com.yang.mapper.FilmMapper;
import com.yang.mapper.PlayMapper;
import com.yang.model.Film;
import com.yang.model.Play;
import com.yang.service.PlayService;
import com.yang.vo.PlayDetailVO;
import com.yang.vo.PlayVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.yang.mapper.FilmMapper;
import com.yang.mapper.PlayMapper;
import com.yang.mapper.RoomMapper;
import com.yang.model.Film;
import com.yang.model.Play;
import com.yang.model.Room;
import com.yang.service.PlayService;
import com.yang.vo.PlayDetailVO;
import com.yang.vo.PlayVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


@Service
public class PlayServiceImpl  implements PlayService {
    @Autowired
    private PlayMapper playMapper;
    @Autowired
    private FilmMapper filmMapper;
    @Autowired
    private RoomMapper roomMapper;

    public List<PlayVO> getPlaysByFilmId(String filmId) {
        List<Play> plays = playMapper.getPlaysByFilmId(filmId);
        //System.out.println(plays);
        List<PlayVO> playVOS = new ArrayList<PlayVO>();
        //通过主键查询 查询电影的名字
        Film film = filmMapper.getFilmById(filmId);

        for (Play play:plays){
            PlayVO vo = new PlayVO();
            // film  中的 电影名
            vo.setFilmName(film.getFilm_name());

//            vo.setFilmId(play.getFilmId());
//            vo.setPlayId(play.getPlayId());
//            vo.setLanType(play.getLanType());
//            vo.setRoomId(play.getRoomId());
//            vo.setRoomName(play.getRoomName());
//            vo.setPrice(play.getPrice());
//            System.out.println(vo.toString());
            //对象处理的工具类 提供拷贝属性的方法
            //BeanUtils对象处理的工具类  第一个参数是源对象 第二个参数是目标对象 即为把A的 同名 属性 赋值给B 拷贝属性的方法 play源 vo目标
            BeanUtils.copyProperties(play,vo);
           SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            vo.setPlayTimeStr(format.format(play.getPlayTime()));
            playVOS.add(vo);

        }
       // System.out.println("ji集合长度"+playVOS.size());
        return playVOS;
    }

    public PlayDetailVO getDetailById(String playId) {
        Play play = playMapper.selectByPlayId(playId);
        PlayDetailVO detailVO = new PlayDetailVO();

        //将play的属性值赋值到detailVO同名的属性值中
        BeanUtils.copyProperties(play,detailVO);

        //在选座购票 旁边展示电影海报信息
        Film film = filmMapper.getFilmById(play.getFilmId());
        detailVO.setFilmName(film.getFilm_name());
        detailVO.setImgPath(film.getImg_path());

        //展示放映厅座位相关的信息
        Room room = roomMapper.selectById(play.getRoomId());

        detailVO.setSeatInfo(room.getRoomInfo());


        return detailVO;
    }
}

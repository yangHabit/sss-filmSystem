package com.yang.controller;

import com.yang.service.FilmServic;
import com.yang.vo.FilmDetailVO;
import com.yang.vo.FilmVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: YangJiao
 * @email 1320259466@qq.com
 * @date: 2022/5/30
 * @time: 18:58
 * @fuction: about the role of class.
 */
@Controller
public class FilmController {
    @Autowired
    private FilmServic filmServic;
    @RequestMapping("/queryFilms")
    public String queryFilms(Model model){
        List<FilmVO> filmVOList = filmServic.selectAll();
        model.addAttribute("filmVOList",filmVOList);
        return "list";
    }


    //如果是post请求 参数放到请求体中
    //如果是get请求，分为两种 @RequestParam、@PathVariable
    //localhost:8080/film/filmInfo?filmId=1111
    //localhost:8080/film/filmInfo/fimlId/1111
    @RequestMapping("/filmInfo")
    public String info(@RequestParam String filmId,Model model){
        FilmDetailVO vo = filmServic.selectById(filmId);
        model.addAttribute("vo",vo);
        return "detail";
    }



//    @RequestMapping("/queryFilms")
//    @ResponseBody
//    public List<FilmVO> queryFilms(Model model){
//        return filmServic.selectAll();
//    }

}

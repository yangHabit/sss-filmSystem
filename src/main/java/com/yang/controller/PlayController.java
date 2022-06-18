package com.yang.controller;

import com.yang.service.PlayService;
import com.yang.vo.PlayDetailVO;
import com.yang.vo.PlayVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: YangJiao
 * @email 1320259466@qq.com
 * @date: 2022/6/2
 * @time: 16:35
 * @fuction: about the role of class.
 */
@Controller
public class PlayController {

@Autowired
private PlayService playService;
    @RequestMapping("/play")
    public String getPlays(@RequestParam String filmId , Model model){
        List<PlayVO> playVOS = playService.getPlaysByFilmId(filmId);
        //System.out.println(playVOS.get(0).getPlayTimeStr()+"时间，价格"+playVOS.get(1).getPrice());
        model.addAttribute("playVOS",playVOS);
        return "play";
    }

    @RequestMapping("/seat")
    public String getSeats(@RequestParam String playId ,Model model){
        System.out.println("方法进入控制层");
        PlayDetailVO detailVO = playService.getDetailById(playId);
        model.addAttribute("detailVO",detailVO);
        return "seat";
    }




}

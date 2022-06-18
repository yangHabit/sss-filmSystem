package com.yang.controller;


import com.yang.model.Teacher;
import com.yang.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: YangJiao
 * @email 1320259466@qq.com
 * @date: 2022/5/30
 * @time: 15:19
 * @fuction: about the role of class.
 */
@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;
    @RequestMapping("/queryTeachers")
    @ResponseBody
    public List<Teacher> queryTeachers(){
        return teacherService.getAll();
    }


}

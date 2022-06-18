package com.yang.service.impl;

import com.yang.mapper.TeacherMapper;
import com.yang.model.Teacher;
import com.yang.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: YangJiao
 * @email 1320259466@qq.com
 * @date: 2022/5/30
 * @time: 15:17
 * @fuction: about the role of class.
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    public List<Teacher> getAll() {
        return teacherMapper.getAll();
    }




}

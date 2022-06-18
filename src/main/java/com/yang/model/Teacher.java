package com.yang.model;

/**
 * @author: YangJiao
 * @email 1320259466@qq.com
 * @date: 2022/5/30
 * @time: 15:05
 * @fuction: about the role of class.
 */
public class Teacher {

    private Long id;
    private String name;
    private Integer age;

    public Teacher() {
    }

    public Teacher(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

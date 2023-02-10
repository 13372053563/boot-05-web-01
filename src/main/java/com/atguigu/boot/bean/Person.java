package com.atguigu.boot.bean;

import lombok.Data;

import java.util.Date;

/**
 * @author zhangshihao
 * @create 2023-02-05 10:26
 */
@Data
public class Person {
    private String userName;
    private Integer age;
    private Date birth;
    private Pet pet;
}

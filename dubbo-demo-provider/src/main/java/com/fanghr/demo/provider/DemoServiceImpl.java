package com.fanghr.demo.provider;

import com.fanghr.demo.DemoService;

/**
 * Created by IntelliJ IDEA.
 * User : fanghr
 * Date : 2018/7/21
 * Time : обнГ8:21
 */
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) throws Exception {
        return "Hello World " + name;
    }
}

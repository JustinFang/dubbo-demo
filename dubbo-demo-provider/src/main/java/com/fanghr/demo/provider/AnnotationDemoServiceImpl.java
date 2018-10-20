package com.fanghr.demo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.fanghr.demo.AnnotationDemoService;

/**
 * Created by IntelliJ IDEA.
 * User : fanghr
 * Date : 2018/7/23
 * Time : обнГ9:56
 */
@Service
public class AnnotationDemoServiceImpl implements AnnotationDemoService {

    public String helloAnnotataion(String name) throws Exception {
        return "hello Annotation, " + name;
    }
}

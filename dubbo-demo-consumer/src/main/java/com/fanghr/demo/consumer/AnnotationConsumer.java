package com.fanghr.demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.RpcContext;
import com.fanghr.demo.AnnotationDemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User : fanghr
 * Date : 2018/7/23
 * Time : ÏÂÎç10:02
 */
public class AnnotationConsumer {

    @Reference
    public AnnotationDemoService annotationDemoService;

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/consumer.xml");
        context.start();

        AnnotationDemoService service = (AnnotationDemoService) context.getBean("annotationDemoService");
        try {
            service.helloAnnotataion("fanghr");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

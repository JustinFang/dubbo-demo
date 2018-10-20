package com.fanghr.demo.consumer;

import com.fanghr.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User : fanghr
 * Date : 2018/7/21
 * Time : ÏÂÎç8:24
 */
public class Consumer {

    public static void main(String[] args) {

        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/consumer.xml"});
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService");
        try {
            String retStr = demoService.sayHello(" World");
            System.out.println(retStr);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

package win.gm945.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import win.gm945.service.TestService;


/**
 * Created by gm on 17-4-2.
 */
@Controller
public class TestContorller {

    public static void main(String[] args) {
        System.out.println("---start---");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        
        TestService testService = (TestService) applicationContext.getBean("testService");
        testService.Save();
    }
}
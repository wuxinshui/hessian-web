package com.mr.hessian.service.test;

import com.mr.hessian.api.ITaskRemoteService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.MalformedURLException;

/**
 * Created by Administrator on 2016/1/5.
 */
public class TaskRemoteServiceTest {
    @Test
    public void testService()  throws MalformedURLException {
        ApplicationContext context=new ClassPathXmlApplicationContext("context_hessian_service.xml");
        ITaskRemoteService taskRemoteService=(ITaskRemoteService)context.getBean("");
        taskRemoteService.task();
    }
}

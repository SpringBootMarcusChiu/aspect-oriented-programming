package com.marcuschiu.aspectorientedprogramming.business;

import com.marcuschiu.aspectorientedprogramming.aop.LogExecutionTime;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    @LogExecutionTime
    public void serve() throws InterruptedException {
        System.out.println("Inside Business Logic");
        Thread.sleep(2000);
    }
}

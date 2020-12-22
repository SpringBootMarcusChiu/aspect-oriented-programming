package com.marcuschiu.aspectorientedprogramming.business;

import com.marcuschiu.aspectorientedprogramming.aop.LogExecutionTime;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    public void methodOne() {
        System.out.println("BusinessService.methodOne()");
    }

    @LogExecutionTime
    public void methodTwo() throws InterruptedException {
        System.out.println("Inside BusinessService.methodTwo");
        Thread.sleep(500);
    }
}

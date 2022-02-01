package com.example.schedule;


import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class DemoTesk implements Runnable{
    @Override
    public void run() {
        System.out.println("My DemoTesk Started::"+new Date());
    }
}

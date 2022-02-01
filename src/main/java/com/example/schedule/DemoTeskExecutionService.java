package com.example.schedule;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
public class DemoTeskExecutionService {
    private final DemoTesk demoTesk;
    private final TaskScheduler taskScheduler;

    public void start(Date date){
        taskScheduler.schedule(demoTesk,date);
    }

    public Runnable sendEmail(){
        return ()-> System.out.println("Mail send at::");
    }

}

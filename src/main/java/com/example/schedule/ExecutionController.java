package com.example.schedule;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@AllArgsConstructor
public class ExecutionController {
    private final DemoTeskExecutionService service;

    @GetMapping("/start")
    public String start(){
        String sDate1="02/01/2022 11:17:00";
        System.out.println("Task will start at::"+sDate1);
        try {
            Date date1=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse(sDate1);
            service.start(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return "Started";
    }
}

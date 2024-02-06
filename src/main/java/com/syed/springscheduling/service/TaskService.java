package com.syed.springscheduling.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TaskService {

    @Scheduled(fixedRate = 1000L)
//    @Scheduled(initialDelay = 5000L, fixedDelay = 2000L)
//    @Scheduled(initialDelay = 3000L, fixedDelayString = "${scheduling.someJob.delay}")
//    @Scheduled(initialDelay = 3000L, cron = "0 0 18 * * MON-FRI")
    void someJob() throws InterruptedException {
        System.out.println("someJob1 Now is " + LocalDateTime.now());

        Thread.sleep(5000L);
    }

    @Scheduled(fixedRate = 1000L)
    void someJob2() {
        System.out.println("someJob2 Now is " + LocalDateTime.now());
    }
}

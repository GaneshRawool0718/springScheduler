package com.example.springScheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ScheduledTasks {

    @Scheduled(cron = "*/20 * * * * *") // Every 20 seconds
    public void scheduledMethod1() {
        log.info("Method 1: Cron job triggered");
    }

    @Scheduled(fixedRate = 5000) // Every 5 seconds
    public void scheduledMethod2() {
        log.info("Method 2: Fixed rate triggered");
    }

    @Scheduled(initialDelay = 1000, fixedDelay = 3000) // After 1s, then every 3s after completion
    public void scheduledMethod3() throws InterruptedException {
        log.info("Method 3: Fixed delay with initial delay started");
        Thread.sleep(5000); // Simulate work
    }
}


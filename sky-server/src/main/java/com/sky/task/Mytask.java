package com.sky.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 定时任务类
 */
@Component
@Slf4j
public class Mytask {
    //@Scheduled(cron = "0/5 * * * * ?")
    public void mytask(){
        log.info("定时任务开始：{}",new Date());
    }
}

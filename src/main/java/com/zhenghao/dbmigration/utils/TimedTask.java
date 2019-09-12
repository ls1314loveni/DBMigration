package com.zhenghao.dbmigration.utils;

import com.zhenghao.dbmigration.services.sqlserver.SQLServerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TimedTask {

    @Autowired
    private SQLServerServices sqlServerServices;

    @Scheduled(cron = "0 0/1 * * * ?") // 每分钟执行一次
    public void work() throws Exception {
        System.out.println("我开始执行任务啦。。。。borrowEntry");
        sqlServerServices.getAllEmployee();
    }

}

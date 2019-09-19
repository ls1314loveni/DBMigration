package com.zhenghao.dbmigration.utils;

import com.zhenghao.dbmigration.services.sqlserver.SQLServerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TimedTask {

    @Autowired
    private SQLServerServices sqlServerServices;

    @Scheduled(cron = "0 0/10 * * * ?") // 每分钟执行一次
    public void work() {

       try {
           System.out.println("我开始执行任务啦。。。。" + new Date());
           sqlServerServices.getAllEmployee();
//           sqlServerServices.getAllToolCategory();
//           sqlServerServices.getAllToolInfo();
//           sqlServerServices.getAllTools();
//           sqlServerServices.getAllBorrowEntry();
//           sqlServerServices.getAllBorrowEntryDetail();
//           sqlServerServices.getAllDetailedList();
//           sqlServerServices.getAllDetailedListDetail();
//           sqlServerServices.getAllToolHisBack();
//           sqlServerServices.getAllToolHisBorrow();
//           sqlServerServices.getAllLogMaintenance();
//           sqlServerServices.getAllWarehousingEntry();
//           sqlServerServices.getAllWarehousingEntryDetail();
//           sqlServerServices.getAllDiscardEntry();
//           sqlServerServices.getAllDiscardEntryDetail();
           System.out.println("我执行任务完成啦。。。。"+ new Date());
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

}

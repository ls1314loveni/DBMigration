package com.zhenghao.dbmigration.controller;

import com.zhenghao.dbmigration.entity.sqlserver.SQLServerBorrowEntry;
import com.zhenghao.dbmigration.entity.sqlserver.SQLServerBorrowEntryDetail;
import com.zhenghao.dbmigration.entity.sqlserver.SQLServerDetailedList;
import com.zhenghao.dbmigration.entity.sqlserver.SQLServerEmployee;
import com.zhenghao.dbmigration.services.sqlserver.SQLServerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/sqlserver")
public class SQLServerController {

    @Autowired
    private SQLServerServices sqlServerServices;

    /**
     * 获取所有员工表的信息
     * @return
     */
    @RequestMapping("/getAllEmployee")
    @ResponseBody
    public List<SQLServerEmployee> getAllEmployee() {
        List<SQLServerEmployee> all = sqlServerServices.getAllEmployee();
        return all;
    }

    /**
     * 获取所有领用表的信息
     * @return
     */
    @RequestMapping("/getAllBorrowEntry")
    @ResponseBody
    public List<SQLServerBorrowEntry> getAllBorrowEntry() {
        List<SQLServerBorrowEntry> all = sqlServerServices.getAllBorrowEntry();
        return all;
    }

    /**
     * 获取所有领用详情表的信息
     * @return
     */
    @RequestMapping("/getAllBorrowEntryDetail")
    @ResponseBody
    public List<SQLServerBorrowEntryDetail> getAllBorrowEntryDetail() {
        List<SQLServerBorrowEntryDetail> all = sqlServerServices.getAllBorrowEntryDetail();
        return all;
    }

    /**
     * 获取所有领用详情表的信息
     * @return
     */
    @RequestMapping("/getAllDetailedList")
    @ResponseBody
    public List<SQLServerDetailedList> getAllDetailedList() {
        List<SQLServerDetailedList> all = sqlServerServices.getAllDetailedList();
        return all;
    }

}

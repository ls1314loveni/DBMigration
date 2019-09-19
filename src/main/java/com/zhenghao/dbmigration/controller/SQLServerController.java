package com.zhenghao.dbmigration.controller;

import com.zhenghao.dbmigration.entity.sqlserver.*;
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
     * 获取所有推荐清单表的信息
     * @return
     */
    @RequestMapping("/getAllDetailedList")
    @ResponseBody
    public List<SQLServerDetailedList> getAllDetailedList() {
        List<SQLServerDetailedList> all = sqlServerServices.getAllDetailedList();
        return all;
    }

    /**
     * 获取所有推荐清单详情表的信息
     * @return
     */
    @RequestMapping("/getAllDetailedListDetail")
    @ResponseBody
    public List<SQLServerDetailedListDetail> getAllDetailedListDetail() {
        List<SQLServerDetailedListDetail> all = sqlServerServices.getAllDetailedListDetail();
        return all;
    }

    /**
     * 获取所有报废表的信息
     * @return
     */
    @RequestMapping("/getAllDiscardEntry")
    @ResponseBody
    public List<SQLServerDiscardEntry> getAllDiscardEntry() {
        List<SQLServerDiscardEntry> all = sqlServerServices.getAllDiscardEntry();
        return all;
    }

    /**
     * 获取所有报废详情表的信息
     * @return
     */
    @RequestMapping("/getAllDiscardEntryDetail")
    @ResponseBody
    public List<SQLServerDiscardEntryDetail> getAllDiscardEntryDetail() {
        List<SQLServerDiscardEntryDetail> all = sqlServerServices.getAllDiscardEntryDetail();
        return all;
    }

    /**
     * 获取维护日志表的信息
     * @return
     */
    @RequestMapping("/getAllLogMaintenance")
    @ResponseBody
    public List<SQLServerLogMaintenance> getAllLogMaintenance() {
        List<SQLServerLogMaintenance> all = sqlServerServices.getAllLogMaintenance();
        return all;
    }

    /**
     * 获取种类表的信息
     * @return
     */
    @RequestMapping("/getAllToolCategory")
    @ResponseBody
    public List<SQLServerToolCategory> getAllToolCategory() {
        List<SQLServerToolCategory> all = sqlServerServices.getAllToolCategory();
        return all;
    }

    /**
     * 获取工具归还流水表的信息
     * @return
     */
    @RequestMapping("/getAllToolHisBack")
    @ResponseBody
    public List<SQLServerToolHisBack> getAllToolHisBack() {
        List<SQLServerToolHisBack> all = sqlServerServices.getAllToolHisBack();
        return all;
    }

    /**
     * 获取工具领用流水表的信息
     * @return
     */
    @RequestMapping("/getAllToolHisBorrow")
    @ResponseBody
    public List<SQLServerToolHisBorrow> getAllToolHisBorrow() {
        List<SQLServerToolHisBorrow> all = sqlServerServices.getAllToolHisBorrow();
        return all;
    }

    /**
     * 获取工具信息表的信息
     * @return
     */
    @RequestMapping("/getAllToolInfo")
    @ResponseBody
    public List<SQLServerToolInfo> getAllToolInfo() {
        List<SQLServerToolInfo> all = sqlServerServices.getAllToolInfo();
        return all;
    }

    /**
     * 获取台账表的信息
     * @return
     */
    @RequestMapping("/getAllTools")
    @ResponseBody
    public List<SQLServerTools> getAllTools() {
        List<SQLServerTools> all = sqlServerServices.getAllTools();
        return all;
    }

    /**
     * 获取入库表的信息
     * @return
     */
    @RequestMapping("/getAllWarehousingEntry")
    @ResponseBody
    public List<SQLServerWarehousingEntry> getAllWarehousingEntry() {
        List<SQLServerWarehousingEntry> all = sqlServerServices.getAllWarehousingEntry();
        return all;
    }

    /**
     * 获取入库详情表的信息
     * @return
     */
    @RequestMapping("/getAllWarehousingEntryDetail")
    @ResponseBody
    public List<SQLServerWarehousingEntryDetail> getAllWarehousingEntryDetail() {
        List<SQLServerWarehousingEntryDetail> all = sqlServerServices.getAllWarehousingEntryDetail();
        return all;
    }

    /**
     * 清空所有表的数据
     * @return
     */
    @RequestMapping("/deleteAllTables")
    @ResponseBody
    public String deleteAllTables() {
        String result = "";
        int i = sqlServerServices.deleteAllTables();
        result = i == 1 ? "数据清空成功" : "数据清空失败";
        return result;
    }
}

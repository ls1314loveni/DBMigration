package com.zhenghao.dbmigration.services.sqlserver;

import com.zhenghao.dbmigration.entity.sqlserver.*;

import java.util.List;

public interface SQLServerServices {

    // 获取员工表所有的数据
    List<SQLServerEmployee> getAllEmployee();

    // 获取领用表所有的数据
    List<SQLServerBorrowEntry> getAllBorrowEntry();

    // 获取领用详情表所有的数据
    List<SQLServerBorrowEntryDetail> getAllBorrowEntryDetail();

    // 获取推荐清单表所有的数据
    List<SQLServerDetailedList> getAllDetailedList();

    // 获取推荐清单详情表所有的数据
    List<SQLServerDetailedListDetail> getAllDetailedListDetail();

    // 获取报废表所有的数据
    List<SQLServerDiscardEntry> getAllDiscardEntry();

    // 获取报废详情表所有的数据
    List<SQLServerDiscardEntryDetail> getAllDiscardEntryDetail();

    // 获取维护日志表所有的数据
    List<SQLServerLogMaintenance> getAllLogMaintenance();

    // 获取种类表所有的数据
    List<SQLServerToolCategory> getAllToolCategory();

    // 获取工具归还流水表所有的数据
    List<SQLServerToolHisBack> getAllToolHisBack();

    // 获取工具领用流水表所有的数据
    List<SQLServerToolHisBorrow> getAllToolHisBorrow();

    // 获取工具信息表所有的数据
    List<SQLServerToolInfo> getAllToolInfo();

    // 获取台账信息表所有的数据
    List<SQLServerTools> getAllTools();

    // 获取入库表所有数据
    List<SQLServerWarehousingEntry> getAllWarehousingEntry();

    // 获取入库详情表所有数据
    List<SQLServerWarehousingEntryDetail> getAllWarehousingEntryDetail();

    // 清空所有表中的数据
    int deleteAllTables();

}

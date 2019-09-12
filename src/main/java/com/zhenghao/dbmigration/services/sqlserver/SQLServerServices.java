package com.zhenghao.dbmigration.services.sqlserver;

import com.zhenghao.dbmigration.entity.sqlserver.SQLServerBorrowEntry;
import com.zhenghao.dbmigration.entity.sqlserver.SQLServerBorrowEntryDetail;
import com.zhenghao.dbmigration.entity.sqlserver.SQLServerDetailedList;
import com.zhenghao.dbmigration.entity.sqlserver.SQLServerEmployee;

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

}

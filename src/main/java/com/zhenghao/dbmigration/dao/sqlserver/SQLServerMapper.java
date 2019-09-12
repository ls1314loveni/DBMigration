package com.zhenghao.dbmigration.dao.sqlserver;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhenghao.dbmigration.entity.sqlserver.SQLServerBorrowEntry;
import com.zhenghao.dbmigration.entity.sqlserver.SQLServerBorrowEntryDetail;
import com.zhenghao.dbmigration.entity.sqlserver.SQLServerDetailedList;
import com.zhenghao.dbmigration.entity.sqlserver.SQLServerEmployee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SQLServerMapper extends BaseMapper<SQLServerEmployee> {

    /**
     * 员工表数据
     * @return
     */
    // 获取所有的员工信息
    List<SQLServerEmployee> getAllEmployee();

    // 删除员工表所有数据
    void deleteAllEmployee();

    // 插入一个员工实体类
    void insertEmployee(SQLServerEmployee sqlServerEmployee);

    /**
     * 领用表数据
     * @return
     */
    // 获取领用表所有的数据
    List<SQLServerBorrowEntry> getAllBorrowEntry();

    // 删除领用表所有数据
    void deleteAllBorrowEntry();

    // 插入一个领用表实体类
    void insertBorrowEntry(SQLServerBorrowEntry sqlServerBorrowEntry);

    /**
     * 领用详情表数据
     * @return
     */
    // 获取领用表所有的数据
    List<SQLServerBorrowEntryDetail> getAllBorrowEntryDetail();

    // 删除领用表所有数据
    void deleteAllBorrowEntryDetail();

    // 插入一个领用表实体类
    void insertBorrowEntryDetail(SQLServerBorrowEntryDetail sqlServerBorrowEntryDetail);

    /**
     * 推荐清单表数据
     * @return
     */
    // 获取领用表所有的数据
    List<SQLServerDetailedList> getAllDetailedList();

    // 删除领用表所有数据
    void deleteAllDetailedList();

    // 插入一个领用表实体类
    void insertDetailedList(SQLServerDetailedList sqlServerDetailedList);

}

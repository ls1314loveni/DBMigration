package com.zhenghao.dbmigration.dao.sqlite;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhenghao.dbmigration.entity.sqlite.SqliteEmployee;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SqliteMapper extends BaseMapper<SqliteEmployee> {

    // 查询员工表所有数据
    List<Map<String, Object>> getAllEmployee();

    // 查询领用表所有数据
    List<Map<String, Object>> getAllBorrowEntry();

    // 查询领用详情表所有数据
    List<Map<String, Object>> getAllBorrowEntryDetail();

    // 查询推荐清单表所有数据
    List<Map<String, Object>> getAllDetailedList();


}

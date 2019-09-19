package com.zhenghao.dbmigration.dao.sqlite;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhenghao.Params;
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

    // 查询推荐清单详情表所有数据
    List<Map<String, Object>> getAllDetailedListDetail();

    // 根据报废单号查询报废表中当前月报废的数据
    List<Map<String, Object>> getDiscardEntryByDiscardEntryId(Params params);

    // 根据报废单号查询报废详情表中当前月报废的数据
    List<Map<String, Object>> getDiscardEntryDetailByDiscardEntryId(Params params);

    // 根据维护单号查询维护表中当前月维护的数据
    List<Map<String, Object>> getLogMaintenanceByMaintenanceId(Params params);

    // 查询种类表所有数据
    List<Map<String, Object>> getAllToolCategory();

    // 查询工具归还流水表所有数据
    List<Map<String, Object>> getAllToolHisBack(Params params);

    // 查询工具领用流水表所有数据
    List<Map<String, Object>> getAllToolHisBorrow(Params params);

    // 查询工具信息表所有数据
    List<Map<String, Object>> getAllToolInfo();

    // 查询台账信息表所有数据
    List<Map<String, Object>> getAllTools();

    // 查询入库表所有数据
    List<Map<String, Object>> getAllWarehousingEntry();

    // 查询入库详情表所有数据
    List<Map<String, Object>> getAllWarehousingEntryDetail();
}

package com.zhenghao.dbmigration.dao.sqlserver;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhenghao.Params;
import com.zhenghao.dbmigration.entity.sqlserver.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SQLServerMapper extends BaseMapper<SQLServerEmployee> {

    /**
     * 员工表数据
     *
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
     *
     * @return
     */
    // 获取领用表所有的数据
    List<SQLServerBorrowEntry> getAllBorrowEntry();

    // 删除领用表所有数据
    void deleteAllBorrowEntry();

    // 插入一个领用实体类
    void insertBorrowEntry(SQLServerBorrowEntry sqlServerBorrowEntry);

    /**
     * 领用详情表数据
     *
     * @return
     */
    // 获取领用详情表所有的数据
    List<SQLServerBorrowEntryDetail> getAllBorrowEntryDetail();

    // 删除领用详情表所有数据
    void deleteAllBorrowEntryDetail();

    // 插入一个领用详情实体类
    void insertBorrowEntryDetail(SQLServerBorrowEntryDetail sqlServerBorrowEntryDetail);

    /**
     * 推荐清单表数据
     *
     * @return
     */
    // 获取推荐清单表所有的数据
    List<SQLServerDetailedList> getAllDetailedList();

    // 删除推荐清单表所有数据
    void deleteAllDetailedList();

    // 插入一个推荐清单实体类
    void insertDetailedList(SQLServerDetailedList sqlServerDetailedList);

    /**
     * 推荐清单详情表数据
     *
     * @return
     */
    // 获取推荐清单详情表所有的数据
    List<SQLServerDetailedListDetail> getAllDetailedListDetail();

    // 删除推荐清单详情表所有数据
    void deleteAllDetailedListDetail();

    // 插入一个推荐清单详情实体类
    void insertDetailedListDetail(SQLServerDetailedListDetail sqlServerDetailedListDetail);


    /**
     * 报废表数据
     *
     * @return
     */
    // 获取报废表所有的数据
    List<SQLServerDiscardEntry> getAllDiscardEntry();

    // 查询SQLserver数据库中任意一条数据的数量，若返回值为空，则表示是空数据库，反正，有数据
    int getOneDiscardEntry();

    // 查询当前月的报废单号
    List<String> getNowDiscardEntryId();

    // 根据报废单号删除数据
    void deleteDiscardEntryById(Params params);

    // 插入一个报废实体类
    void insertDiscardEntry(SQLServerDiscardEntry sqlServerDiscardEntry);

    /**
     * 报废详情表数据
     *
     * @return
     */
    // 获取报废详情表所有的数据
    List<SQLServerDiscardEntryDetail> getAllDiscardEntryDetail();

    // 查询SQLserver数据库中任意一条数据的数量，若返回值为空，则表示是空数据库，反正，有数据
    int getOneDiscardEntryDetail();

    // 查询当前月的报废单号
    List<String> getNowDiscardEntryDetailId();

    // 根据报废单号删除数据
    void deleteDiscardEntryDetailById(Params params);

    // 插入一个报废详情实体类
    void insertDiscardEntryDetail(SQLServerDiscardEntryDetail sqlServerDiscardEntryDetail);

    /**
     * 维护日志表数据
     *
     * @return
     */
    // 获取维护日志表所有的数据
    List<SQLServerLogMaintenance> getAllLogMaintenance();

    // 查询SQLserver数据库中任意一条数据的数量，若返回值为空，则表示是空数据库，反正，有数据
    int getOneLogMaintenance();

    // 查询当前月的维护单号
    List<String> getNowLogMaintenanceId();

    // 根据维护单号删除数据
    void deleteLogMaintenanceById(Params params);

    // 插入一个维护日志实体类
    void insertLogMaintenance(SQLServerLogMaintenance sqlServerLogMaintenance);

    /**
     * 种类表数据
     *
     * @return
     */
    // 获取所有的种类信息
    List<SQLServerToolCategory> getAllToolCategory();

    // 删除种类表所有数据
    void deleteAllToolCategory();

    // 插入一个种类实体类
    void insertToolCategory(SQLServerToolCategory sqlServerToolCategory);

    /**
     * 工具归还流水表数据
     *
     * @return
     */
    // 查询所有的工具归还流水表信息
    List<SQLServerToolHisBack> getAllToolHisBack();

    // 获取工具归还流水表中最大的id值
    int getHisBackMaxId();

    // 插入一个工具归还流水实体类
    void insertToolHisBack(SQLServerToolHisBack sqlServerToolHisBack);

    /**
     * 工具领用流水表数据
     *
     * @return
     */
    // 查询所有的工具领用流水表信息
    List<SQLServerToolHisBorrow> getAllToolHisBorrow();

    // 获取工具领用流水表中最大的id值
    int getHisBorrowMaxId();

    // 插入一个工具领用流水实体类
    void insertToolHisBorrow(SQLServerToolHisBorrow sqlServerToolHisBorrow);

    /**
     * 工具信息表数据
     *
     * @return
     */
    // 获取所有的工具信息
    List<SQLServerToolInfo> getAllToolInfo();

    // 删除工具信息表所有数据
    void deleteAllToolInfo();

    // 插入一个工具信息实体类
    void insertToolInfo(SQLServerToolInfo sqlServerToolInfo);

    /**
     * 台账信息表数据
     *
     * @return
     */
    // 获取所有的台账信息
    List<SQLServerTools> getAllTools();

    // 删除台账信息表所有数据
    void deleteAllTools();

    // 插入一个台账信息实体类
    void insertTools(SQLServerTools sqlServerTools);

    /**
     * 入库表数据
     *
     * @return
     */
    // 获取所有的入库信息
    List<SQLServerWarehousingEntry> getAllWarehousingEntry();

    // 删除入库表所有数据
    void deleteAllWarehousingEntry();

    // 插入一个入库实体类
    void insertWarehousingEntry(SQLServerWarehousingEntry sqlServerWarehousingEntry);

    /**
     * 入库详情表数据
     *
     * @return
     */
    // 获取所有的入库详情信息
    List<SQLServerWarehousingEntryDetail> getAllWarehousingEntryDetail();

    // 删除入库详情表所有数据
    void deleteAllWarehousingEntryDetail();

    // 插入一个入库详情实体类
    void insertWarehousingEntryDetail(SQLServerWarehousingEntryDetail sqlServerWarehousingEntryDetail);

    // 清空所有表中的数据
    void  deleteAllTables();
}

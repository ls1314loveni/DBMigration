package com.zhenghao.dbmigration.services.impl;

import com.zhenghao.Params;
import com.zhenghao.dbmigration.dao.sqlite.SqliteMapper;
import com.zhenghao.dbmigration.dao.sqlserver.SQLServerMapper;
import com.zhenghao.dbmigration.entity.sqlserver.*;
import com.zhenghao.dbmigration.services.sqlserver.SQLServerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = true, rollbackFor = Exception.class, transactionManager = "sqlserverTransactionManager",
        isolation = Isolation.READ_UNCOMMITTED, propagation = Propagation.REQUIRED)
public class SQLServerServicesImpl implements SQLServerServices {

    @Autowired
    private SQLServerMapper sqlServerMapper;

    @Autowired
    private SqliteMapper sqliteMapper;

    /**
     * 获取员工表数据
     *
     * @return
     */
    @Override
    public List<SQLServerEmployee> getAllEmployee(){
        // 获取sqlite数据库中员工表的数据
        List<Map<String, Object>> all = sqliteMapper.getAllEmployee();

        // 删除SQLserver数据库上员工表的数据
        sqlServerMapper.deleteAllEmployee();

        int size = all.size();
        for (int i = 0; i < size; i++) {
            Map<String, Object> stringObjectMap = all.get(i);
            String id = stringObjectMap.get("_id") == null ? null : stringObjectMap.get("_id").toString();
            String empName = stringObjectMap.get("EMP_NAME") == null ? null : stringObjectMap.get("EMP_NAME").toString();
            String password = stringObjectMap.get("PASSWORD") == null ? null : stringObjectMap.get("PASSWORD").toString();
            String cardId = stringObjectMap.get("CARD_ID") == null ? null : stringObjectMap.get("CARD_ID").toString();
            String telephone = stringObjectMap.get("TELEPHONE") == null ? null : stringObjectMap.get("TELEPHONE").toString();
            String gender = stringObjectMap.get("GENDER") == null ? null : stringObjectMap.get("GENDER").toString();
            String birthday = stringObjectMap.get("BIRTHDAY") == null ? null : stringObjectMap.get("BIRTHDAY").toString();
            String registDate = stringObjectMap.get("REGIST_DATE") == null ? null : stringObjectMap.get("REGIST_DATE").toString();
            String modifyDate = stringObjectMap.get("MODIFY_DATE") == null ? null : stringObjectMap.get("MODIFY_DATE").toString();
            String priority = stringObjectMap.get("PRIORITY") == null ? null : stringObjectMap.get("PRIORITY").toString();
            String openDoorTime = stringObjectMap.get("OPEN_DOOR_TIME") == null ? null : stringObjectMap.get("OPEN_DOOR_TIME").toString();
            String flag = stringObjectMap.get("FLAG") == null ? null : stringObjectMap.get("FLAG").toString();

            SQLServerEmployee s = new SQLServerEmployee();
            if (id != null) s.setEmpId(Integer.valueOf(id));
            s.setEmpName(empName);
            s.setPassword(password);
            s.setCardId(cardId);
            s.setTelephone(telephone);
            s.setGender(gender);
            s.setBirthday(birthday);
            s.setRegistDate(registDate);
            s.setModifyDate(modifyDate);
            if (priority != null) s.setPriority(Integer.valueOf(priority));
            s.setOpenDoorTime(openDoorTime);
            s.setFlag(flag);
            sqlServerMapper.insertEmployee(s);
        }
        List<SQLServerEmployee> list = sqlServerMapper.getAllEmployee();
        return list;
    }

    /**
     * 获取所有的领用表数据
     *
     * @return
     */
    @Override
    public List<SQLServerBorrowEntry> getAllBorrowEntry() {
        // 获取sqlite数据库中的数据
        List<Map<String, Object>> all = sqliteMapper.getAllBorrowEntry();

        // 删除SQLserver数据库上的数据
        sqlServerMapper.deleteAllBorrowEntry();

        int size = all.size();
        for (int i = 0; i < size; i++) {
            Map<String, Object> map = all.get(i);
            String borrowEntryId = map.get("BORROW_ENTRY_ID") == null ? null : map.get("BORROW_ENTRY_ID").toString();
            String detailedListId = map.get("DETAILED_LIST_ID") == null ? null : map.get("DETAILED_LIST_ID").toString();
            String borrowEmpId = map.get("BORROW_EMP_ID") == null ? null : map.get("BORROW_EMP_ID").toString();
            String borrowDate = map.get("BORROW_DATE") == null ? null : map.get("BORROW_DATE").toString();
            String planReturnDate = map.get("PLAN_RETURN_DATE") == null ? null : map.get("PLAN_RETURN_DATE").toString();
            String actualReturnDate = map.get("ACTUAL_RETURN_DATE") == null ? null : map.get("ACTUAL_RETURN_DATE").toString();
            String returnEmpId = map.get("RETURN_EMP_ID") == null ? null : map.get("RETURN_EMP_ID").toString();
            String purpose = map.get("PURPOSE") == null ? null : map.get("PURPOSE").toString();
            String taskTicket = map.get("TASK_TICKET") == null ? null : map.get("TASK_TICKET").toString();
            String borrowTickDate = map.get("BORROW_TICK_DATE") == null ? null : map.get("BORROW_TICK_DATE").toString();
            String status = map.get("STATUS") == null ? null : map.get("STATUS").toString();
            String remark = map.get("REMARK") == null ? null : map.get("REMARK").toString();

            SQLServerBorrowEntry s = new SQLServerBorrowEntry();
            s.setBorrowEntryId(borrowEntryId);
            if (detailedListId != null) s.setDetailedListId(Integer.valueOf(detailedListId));
            if (borrowEmpId != null) s.setBorrowEmpId(Integer.valueOf(borrowEmpId));
            s.setBorrowDate(borrowDate);
            s.setPlanReturnDate(planReturnDate);
            s.setActualReturnDate(actualReturnDate);
            if (returnEmpId != null) s.setReturnEmpId(Integer.valueOf(returnEmpId));
            s.setPurpose(purpose);
            s.setTaskTicket(taskTicket);
            s.setBorrowTickDate(borrowTickDate);
            s.setStatus(status);
            s.setRemark(remark);
            sqlServerMapper.insertBorrowEntry(s);
        }
        List<SQLServerBorrowEntry> list = sqlServerMapper.getAllBorrowEntry();
        return list;
    }

    /**
     * 获取所有的领用详情表数据
     *
     * @return
     */
    @Override
    public List<SQLServerBorrowEntryDetail> getAllBorrowEntryDetail() {
        // 获取sqlite数据库中的数据
        List<Map<String, Object>> all = sqliteMapper.getAllBorrowEntryDetail();

        // 删除SQLserver数据库上的数据
        sqlServerMapper.deleteAllBorrowEntryDetail();

        int size = all.size();
        for (int i = 0; i < size; i++) {
            Map<String, Object> map = all.get(i);
            String id = map.get("_id") == null ? null : map.get("_id").toString();
            String borrowEntryId = map.get("BORROW_ENTRY_ID") == null ? null : map.get("BORROW_ENTRY_ID").toString();
            String toolId = map.get("TOOL_ID") == null ? null : map.get("TOOL_ID").toString();
            String borrowNumber = map.get("BORROW_NUMBER") == null ? null : map.get("BORROW_NUMBER").toString();
            String returnNumber = map.get("RETURN_NUMBER") == null ? null : map.get("RETURN_NUMBER").toString();
            String testEmpName = map.get("TEST_EMP_NAME") == null ? null : map.get("TEST_EMP_NAME").toString();
            String remark = map.get("REMARK") == null ? null : map.get("REMARK").toString();
            SQLServerBorrowEntryDetail s = new SQLServerBorrowEntryDetail();
            if (id != null) s.setId(Integer.valueOf(id));
            s.setBorrowEntryId(borrowEntryId);
            if (toolId != null) s.setToolId(Integer.valueOf(toolId));
            if (borrowNumber != null) s.setBorrowNumber(Integer.valueOf(borrowNumber));
            if (returnNumber != null) s.setReturnNumber(Integer.valueOf(returnNumber));
            s.setTestEmpName(testEmpName);
            s.setRemark(remark);
            sqlServerMapper.insertBorrowEntryDetail(s);
        }
        List<SQLServerBorrowEntryDetail> list = sqlServerMapper.getAllBorrowEntryDetail();
        return list;
    }

    /**
     * 获取所有的推荐清单表数据
     *
     * @return
     */
    @Override
    public List<SQLServerDetailedList> getAllDetailedList() {
        // 获取sqlite数据库中的数据
        List<Map<String, Object>> all = sqliteMapper.getAllDetailedList();

        // 删除SQLserver数据库上的数据
        sqlServerMapper.deleteAllDetailedList();

        int size = all.size();
        for (int i = 0; i < size; i++) {
            Map<String, Object> map = all.get(i);
            String id = map.get("_id") == null ? null : map.get("_id").toString();
            String detailedListName = map.get("DETAILED_LIST_NAME") == null ? null : map.get("DETAILED_LIST_NAME").toString();
            String remark = map.get("REMARK") == null ? null : map.get("REMARK").toString();
            SQLServerDetailedList s = new SQLServerDetailedList();
            if (id != null) s.setDetailedListId(Integer.valueOf(id));
            s.setDetailedListName(detailedListName);
            s.setRemark(remark);
            sqlServerMapper.insertDetailedList(s);
        }
        List<SQLServerDetailedList> list = sqlServerMapper.getAllDetailedList();
        return list;
    }

    /**
     * 获取所有的推荐清单详情表数据
     *
     * @return
     */
    @Override
    public List<SQLServerDetailedListDetail> getAllDetailedListDetail() {
        // 获取sqlite数据库中的数据
        List<Map<String, Object>> all = sqliteMapper.getAllDetailedListDetail();

        // 删除SQLserver数据库上的数据
        sqlServerMapper.deleteAllDetailedListDetail();

        int size = all.size();
        for (int i = 0; i < size; i++) {
            Map<String, Object> map = all.get(i);
            String id = map.get("_id") == null ? null : map.get("_id").toString();
            String detailedListId = map.get("DETAILED_LIST_ID") == null ? null : map.get("DETAILED_LIST_ID").toString();
            String toolId = map.get("TOOL_ID") == null ? null : map.get("TOOL_ID").toString();
            String borrowNumber = map.get("BORROW_NUMBER") == null ? null : map.get("BORROW_NUMBER").toString();
            String remark = map.get("REMARK") == null ? null : map.get("REMARK").toString();

            SQLServerDetailedListDetail s = new SQLServerDetailedListDetail();
            if (id != null) s.setId(Integer.valueOf(id));
            if (detailedListId != null) s.setDetailedListId(Integer.valueOf(detailedListId));
            if (toolId != null) s.setToolId(Integer.valueOf(toolId));
            if (borrowNumber != null) s.setBorrowNumber(Integer.valueOf(borrowNumber));
            s.setRemark(remark);
            sqlServerMapper.insertDetailedListDetail(s);
        }
        List<SQLServerDetailedListDetail> list = sqlServerMapper.getAllDetailedListDetail();
        return list;
    }

    /**
     * 获取所有的报废表数据
     *
     * @return
     */
    @Override
    public List<SQLServerDiscardEntry> getAllDiscardEntry() {

        List<Map<String, Object>> all = new ArrayList<>();
        Params params = new Params();
        // 查询数据库中是否有数据，有数据则只更新当月的数据，如无数据，则更新所有数据
        int num = sqlServerMapper.getOneDiscardEntry();
        if (num > 0) {   // 表中有数据
            // 查询当前月的报废单号（结果如：201902 表示2019年2月份的数据）
            List<String> discardEntryId = sqlServerMapper.getNowDiscardEntryId();
            params.put("discardEntryId", discardEntryId.get(0));

            // 先删除当前月单号的所有数据
            sqlServerMapper.deleteDiscardEntryById(params);
        }
        all = sqliteMapper.getDiscardEntryByDiscardEntryId(params);
        int size = all.size();
        for (int i = 0; i < size; i++) {
            Map<String, Object> map = all.get(i);
            String discardEntryId = map.get("DISCARD_ENTRY_ID") == null ? null : map.get("DISCARD_ENTRY_ID").toString();
            String discardEmpId = map.get("DISCARD_EMP_ID") == null ? null : map.get("DISCARD_EMP_ID").toString();
            String discardDate = map.get("DISCARD_DATE") == null ? null : map.get("DISCARD_DATE").toString();
            String auditEmpId = map.get("AUDIT_EMP_ID") == null ? null : map.get("AUDIT_EMP_ID").toString();
            String auditDate = map.get("AUDIT_DATE") == null ? null : map.get("AUDIT_DATE").toString();
            String status = map.get("STATUS") == null ? null : map.get("STATUS").toString();
            String remark = map.get("REMARK") == null ? null : map.get("REMARK").toString();

            SQLServerDiscardEntry s = new SQLServerDiscardEntry();
            s.setDiscardEntryId(discardEntryId);
            if (discardEmpId != null) s.setDiscardEmpId(Integer.valueOf(discardEmpId));
            s.setDiscardDate(discardDate);
            if (auditEmpId != null) s.setAuditEmpId(Integer.valueOf(auditEmpId));
            s.setAuditDate(auditDate);
            s.setStatus(status);
            s.setRemark(remark);
            sqlServerMapper.insertDiscardEntry(s);
        }
        List<SQLServerDiscardEntry> list = sqlServerMapper.getAllDiscardEntry();
        return list;
    }

    /**
     * 获取所有的报废详情表数据
     *
     * @return
     */
    @Override
    public List<SQLServerDiscardEntryDetail> getAllDiscardEntryDetail() {

        List<Map<String, Object>> all = new ArrayList<>();
        Params params = new Params();
        // 查询数据库中是否有数据，有数据则只更新当月的数据，如无数据，则更新所有数据
        int num = sqlServerMapper.getOneDiscardEntryDetail();
        if (num > 0) {   // 表中有数据
            // 查询当前月的报废单号（结果如：201902 表示2019年2月份的数据）
            List<String> discardEntryId = sqlServerMapper.getNowDiscardEntryDetailId();
            params.put("discardEntryId", discardEntryId.get(0));

            // 先删除当前月单号的所有数据
            sqlServerMapper.deleteDiscardEntryDetailById(params);
        }
        all = sqliteMapper.getDiscardEntryDetailByDiscardEntryId(params);
        int size = all.size();
        for (int i = 0; i < size; i++) {
            Map<String, Object> map = all.get(i);
            String id = map.get("_id") == null ? null : map.get("_id").toString();
            String discardEntryId = map.get("DISCARD_ENTRY_ID") == null ? null : map.get("DISCARD_ENTRY_ID").toString();
            String barCode = map.get("BAR_CODE") == null ? null : map.get("BAR_CODE").toString();
            String toolId = map.get("TOOL_ID") == null ? null : map.get("TOOL_ID").toString();
            String categoryId = map.get("CATEGORY_ID") == null ? null : map.get("CATEGORY_ID").toString();
            String reason = map.get("REASON") == null ? null : map.get("REASON").toString();

            SQLServerDiscardEntryDetail s = new SQLServerDiscardEntryDetail();
            if (id != null) s.setId(Integer.valueOf(id));
            s.setDiscardEntryId(discardEntryId);
            s.setBarCode(barCode);
            if (toolId != null) s.setToolId(Integer.valueOf(toolId));
            if (categoryId != null) s.setCategoryId(Integer.valueOf(categoryId));
            s.setReason(reason);
            sqlServerMapper.insertDiscardEntryDetail(s);
        }
        List<SQLServerDiscardEntryDetail> list = sqlServerMapper.getAllDiscardEntryDetail();
        return list;
    }

    /**
     * 获取所有的维护日志表数据
     *
     * @return
     */
    @Override
    public List<SQLServerLogMaintenance> getAllLogMaintenance() {

        List<Map<String, Object>> all = new ArrayList<>();
        Params params = new Params();
        // 查询数据库中是否有数据，有数据则只更新当月的数据，如无数据，则更新所有数据
        int num = sqlServerMapper.getOneLogMaintenance();
        if (num > 0) {   // 表中有数据
            // 查询当前月的维护单号（结果如：201902 表示2019年2月份的数据）
            List<String> discardEntryId = sqlServerMapper.getNowLogMaintenanceId();
            params.put("maintenanceId", discardEntryId.get(0));

            // 先删除当前月单号的所有数据
            sqlServerMapper.deleteLogMaintenanceById(params);
        }
        all = sqliteMapper.getLogMaintenanceByMaintenanceId(params);
        int size = all.size();
        for (int i = 0; i < size; i++) {
            Map<String, Object> map = all.get(i);
            String id = map.get("_id") == null ? null : map.get("_id").toString();
            String maintenanceId = map.get("MAINTENANCE_ID") == null ? null : map.get("MAINTENANCE_ID").toString();
            String maintenanceEmpId = map.get("MAINTENANCE_EMP_ID") == null ? null : map.get("MAINTENANCE_EMP_ID").toString();
            String maintenanceDate = map.get("MAINTENANCE_DATE") == null ? null : map.get("MAINTENANCE_DATE").toString();
            String barCode = map.get("BAR_CODE") == null ? null : map.get("BAR_CODE").toString();
            String status = map.get("STATUS") == null ? null : map.get("STATUS").toString();

            SQLServerLogMaintenance s = new SQLServerLogMaintenance();
            if (id != null) s.setId(Integer.valueOf(id));
            s.setMaintenanceId(maintenanceId);
            if (maintenanceEmpId != null) s.setMaintenanceEmpId(Integer.valueOf(maintenanceEmpId));
            s.setMaintenanceDate(maintenanceDate);
            s.setBarCode(barCode);
            s.setStatus(status);
            sqlServerMapper.insertLogMaintenance(s);
        }
        List<SQLServerLogMaintenance> list = sqlServerMapper.getAllLogMaintenance();
        return list;
    }

    /**
     * 获取种类表数据
     *
     * @return
     */
    @Override
    public List<SQLServerToolCategory> getAllToolCategory() {
        // 获取sqlite数据库中的数据
        List<Map<String, Object>> all = sqliteMapper.getAllToolCategory();

        // 删除SQLserver数据库上的数据
        sqlServerMapper.deleteAllToolCategory();

        int size = all.size();
        for (int i = 0; i < size; i++) {
            Map<String, Object> stringObjectMap = all.get(i);
            String id = stringObjectMap.get("_id") == null ? null : stringObjectMap.get("_id").toString();
            String categoryName = stringObjectMap.get("CATEGORY_NAME") == null ? null : stringObjectMap.get("CATEGORY_NAME").toString();
            String fatherId = stringObjectMap.get("FATHER_ID") == null ? null : stringObjectMap.get("FATHER_ID").toString();
            String categoryTag = stringObjectMap.get("CATEGORY_TAG") == null ? null : stringObjectMap.get("CATEGORY_TAG").toString();

            SQLServerToolCategory s = new SQLServerToolCategory();
            if (id != null) s.setCategoryId(Integer.valueOf(id));
            s.setCategoryName(categoryName);
            if (fatherId != null) s.setFatherId(Integer.valueOf(fatherId));
            s.setCategoryTag(categoryTag);
            sqlServerMapper.insertToolCategory(s);
        }
        List<SQLServerToolCategory> list = sqlServerMapper.getAllToolCategory();
        return list;
    }

    /**
     * 获取工具归还流水表数据
     *
     * @return
     */
    public List<SQLServerToolHisBack> getAllToolHisBack() {
        // 在SQLserver数据库中查询最大的id值
        int maxId = sqlServerMapper.getHisBackMaxId();
        Params params = new Params();
        params.put("id", maxId);

        //从sqlite数据库中查询大于该id的数据
        List<Map<String, Object>> all = sqliteMapper.getAllToolHisBack(params);
        int size = all.size();
        for (int i = 0; i < size; i++) {
            Map<String, Object> map = all.get(i);
            String id = map.get("_id") == null ? null : map.get("_id").toString();
            String borrowEntryId = map.get("BORROW_ENTRY_ID") == null ? null : map.get("BORROW_ENTRY_ID").toString();
            String detailedListId = map.get("DETAILED_LIST_ID") == null ? null : map.get("DETAILED_LIST_ID").toString();
            String barCode = map.get("BAR_CODE") == null ? null : map.get("BAR_CODE").toString();
            String toolId = map.get("TOOL_ID") == null ? null : map.get("TOOL_ID").toString();
            String returnDate = map.get("RETURN_DATE") == null ? null : map.get("RETURN_DATE").toString();
            String returnEmpId = map.get("RETURN_EMP_ID") == null ? null : map.get("RETURN_EMP_ID").toString();
            String purpose = map.get("PURPOSE") == null ? null : map.get("PURPOSE").toString();
            String testEmpName = map.get("TEST_EMP_NAME") == null ? null : map.get("TEST_EMP_NAME").toString();
            String testStatus = map.get("TEST_STATUS") == null ? null : map.get("TEST_STATUS").toString();
            String remark = map.get("REMARK") == null ? null : map.get("REMARK").toString();

            SQLServerToolHisBack s = new SQLServerToolHisBack();
            if (id != null) s.setId(Integer.valueOf(id));
            s.setBorrowEntryId(borrowEntryId);
            if (detailedListId != null) s.setDetailedListId(Integer.valueOf(detailedListId));
            s.setBarCode(barCode);
            if (toolId != null) s.setToolId(Integer.valueOf(toolId));
            s.setReturnDate(returnDate);
            if (returnEmpId != null) s.setReturnEmpId(Integer.valueOf(returnEmpId));
            s.setPurpose(purpose);
            s.setTestEmpName(testEmpName);
            s.setTestStatus(testStatus);
            s.setRemark(remark);
            sqlServerMapper.insertToolHisBack(s);
        }
        List<SQLServerToolHisBack> list = sqlServerMapper.getAllToolHisBack();
        return list;
    }

    /**
     * 获取工具领用流水表数据
     *
     * @return
     */
    public List<SQLServerToolHisBorrow> getAllToolHisBorrow() {
        // 在SQLserver数据库中查询最大的id值
        int maxId = sqlServerMapper.getHisBorrowMaxId();
        Params params = new Params();
        params.put("id", maxId);

        //从sqlite数据库中查询大于该id的数据
        List<Map<String, Object>> all = sqliteMapper.getAllToolHisBorrow(params);
        int size = all.size();
        for (int i = 0; i < size; i++) {
            Map<String, Object> map = all.get(i);
            String id = map.get("_id") == null ? null : map.get("_id").toString();
            String borrowEntryId = map.get("BORROW_ENTRY_ID") == null ? null : map.get("BORROW_ENTRY_ID").toString();
            String detailedListId = map.get("DETAILED_LIST_ID") == null ? null : map.get("DETAILED_LIST_ID").toString();
            String barCode = map.get("BAR_CODE") == null ? null : map.get("BAR_CODE").toString();
            String toolId = map.get("TOOL_ID") == null ? null : map.get("TOOL_ID").toString();
            String borrowDate = map.get("BORROW_DATE") == null ? null : map.get("BORROW_DATE").toString();
            String numberOfUse = map.get("NUMBER_OF_USE") == null ? null : map.get("NUMBER_OF_USE").toString();
            String borrowEmpId = map.get("BORROW_EMP_ID") == null ? null : map.get("BORROW_EMP_ID").toString();
            String remark = map.get("REMARK") == null ? null : map.get("REMARK").toString();

            SQLServerToolHisBorrow s = new SQLServerToolHisBorrow();
            if (id != null) s.setId(Integer.valueOf(id));
            s.setBorrowEntryId(borrowEntryId);
            if (detailedListId != null) s.setDetailedListId(Integer.valueOf(detailedListId));
            s.setBarCode(barCode);
            if (toolId != null) s.setToolId(Integer.valueOf(toolId));
            s.setBorrowDate(borrowDate);
            if (numberOfUse != null) s.setNumberOfUse(Integer.valueOf(numberOfUse));
            if (borrowEmpId != null) s.setBorrowEmpId(Integer.valueOf(borrowEmpId));
            s.setRemark(remark);
            sqlServerMapper.insertToolHisBorrow(s);
        }
        List<SQLServerToolHisBorrow> list = sqlServerMapper.getAllToolHisBorrow();
        return list;
    }

    /**
     * 获取工具信息表数据
     *
     * @return
     */
    @Override
    public List<SQLServerToolInfo> getAllToolInfo() {
        // 获取sqlite数据库中的数据
        List<Map<String, Object>> all = sqliteMapper.getAllToolInfo();

        // 删除SQLserver数据库上的数据
        sqlServerMapper.deleteAllToolInfo();

        int size = all.size();
        for (int i = 0; i < size; i++) {
            Map<String, Object> stringObjectMap = all.get(i);
            String id = stringObjectMap.get("_id") == null ? null : stringObjectMap.get("_id").toString();
            String toolName = stringObjectMap.get("TOOL_NAME") == null ? null : stringObjectMap.get("TOOL_NAME").toString();
            String categoryId = stringObjectMap.get("CATEGORY_ID") == null ? null : stringObjectMap.get("CATEGORY_ID").toString();
            String briefCode = stringObjectMap.get("BRIEF_CODE") == null ? null : stringObjectMap.get("BRIEF_CODE").toString();
            String inAmount = stringObjectMap.get("IN_AMOUNT") == null ? null : stringObjectMap.get("IN_AMOUNT").toString();
            String borrowAmount = stringObjectMap.get("BORROW_AMOUNT") == null ? null : stringObjectMap.get("BORROW_AMOUNT").toString();
            String specification = stringObjectMap.get("SPECIFICATION") == null ? null : stringObjectMap.get("SPECIFICATION").toString();
            String unit = stringObjectMap.get("UNIT") == null ? null : stringObjectMap.get("UNIT").toString();
            String manufacturer = stringObjectMap.get("MANUFACTURER") == null ? null : stringObjectMap.get("MANUFACTURER").toString();
            String priceUnit = stringObjectMap.get("PRICE_UNIT") == null ? null : stringObjectMap.get("PRICE_UNIT").toString();
            String testPeriod = stringObjectMap.get("TEST_PERIOD") == null ? null : stringObjectMap.get("TEST_PERIOD").toString();
            String dateInProduced = stringObjectMap.get("DATE_IN_PRODUCED") == null ? null : stringObjectMap.get("DATE_IN_PRODUCED").toString();
            String remark = stringObjectMap.get("REMARK") == null ? null : stringObjectMap.get("REMARK").toString();

            SQLServerToolInfo s = new SQLServerToolInfo();
            if (id != null) s.setToolId(Integer.valueOf(id));
            s.setToolName(toolName);
            if (categoryId != null) s.setCategoryId(Integer.valueOf(categoryId));
            s.setBriefCode(briefCode);
            if (inAmount != null) s.setInAmount(Integer.valueOf(inAmount));
            if (borrowAmount != null) s.setBorrowAmount(Integer.valueOf(borrowAmount));
            s.setSpecification(specification);
            s.setUnit(unit);
            s.setManufacturer(manufacturer);
            s.setPriceUnit(priceUnit);
            s.setTestPeriod(testPeriod);
            s.setDateInProduced(dateInProduced);
            s.setRemark(remark);
            sqlServerMapper.insertToolInfo(s);
        }
        List<SQLServerToolInfo> list = sqlServerMapper.getAllToolInfo();
        return list;
    }

    /**
     * 获取台账信息表数据
     *
     * @return
     */
    @Override
    public List<SQLServerTools> getAllTools() {
        // 获取sqlite数据库中的数据
        List<Map<String, Object>> all = sqliteMapper.getAllTools();

        // 删除SQLserver数据库上的数据
        sqlServerMapper.deleteAllTools();

        int size = all.size();
        for (int i = 0; i < size; i++) {
            Map<String, Object> map = all.get(i);
            String barCode = map.get("BAR_CODE") == null ? null : map.get("BAR_CODE").toString();
            String flagBarCode = map.get("FLAG_BAR_CODE") == null ? null : map.get("FLAG_BAR_CODE").toString();
            String briefCode = map.get("BRIEF_CODE") == null ? null : map.get("BRIEF_CODE").toString();
            String toolId = map.get("TOOL_ID") == null ? null : map.get("TOOL_ID").toString();
            String warehousingEntryId = map.get("WAREHOUSING_ENTRY_ID") == null ? null : map.get("WAREHOUSING_ENTRY_ID").toString();
            String lastBorrowEntryId = map.get("LAST_BORROW_ENTRY_ID") == null ? null : map.get("LAST_BORROW_ENTRY_ID").toString();
            String lastTestDate = map.get("LAST_TEST_DATE") == null ? null : map.get("LAST_TEST_DATE").toString();
            String nextTestDate = map.get("NEXT_TEST_DATE") == null ? null : map.get("NEXT_TEST_DATE").toString();
            String numberOfUse = map.get("NUMBER_OF_USE") == null ? null : map.get("NUMBER_OF_USE").toString();
            String status = map.get("STATUS") == null ? null : map.get("STATUS").toString();
            String testStatus = map.get("TEST_STATUS") == null ? null : map.get("TEST_STATUS").toString();
            String maintenanceNumber = map.get("MAINTENANCE_NUMBER") == null ? null : map.get("MAINTENANCE_NUMBER").toString();
            String remark = map.get("REMARK") == null ? null : map.get("REMARK").toString();

            SQLServerTools s = new SQLServerTools();
            s.setBarCode(barCode);
            s.setFlagBarCode(flagBarCode);
            s.setBriefCode(briefCode);
            if (toolId != null) s.setToolId(Integer.valueOf(toolId));
            s.setWarehousingEntryId(warehousingEntryId);
            s.setLastBorrowEntryId(lastBorrowEntryId);
            s.setLastTestDate(lastTestDate);
            s.setNextTestDate(nextTestDate);
            if (numberOfUse != null) s.setNumberOfUse(Integer.valueOf(numberOfUse));
            s.setStatus(status);
            s.setTestStatus(testStatus);
            if (maintenanceNumber != null) s.setMaintenanceNumber(Integer.valueOf(maintenanceNumber));
            s.setRemark(remark);
            sqlServerMapper.insertTools(s);
        }
        List<SQLServerTools> list = sqlServerMapper.getAllTools();
        return list;
    }

    /**
     * 获取入库表数据
     *
     * @return
     */
    @Override
    public List<SQLServerWarehousingEntry> getAllWarehousingEntry() {
        // 获取sqlite数据库中的数据
        List<Map<String, Object>> all = sqliteMapper.getAllWarehousingEntry();

        // 删除SQLserver数据库上的数据
        sqlServerMapper.deleteAllWarehousingEntry();

        int size = all.size();
        for (int i = 0; i < size; i++) {
            Map<String, Object> map = all.get(i);
            String warehousingEntryId = map.get("WAREHOUSING_ENTRY_ID") == null ? null : map.get("WAREHOUSING_ENTRY_ID").toString();
            String warehousingDate = map.get("WAREHOUSING_DATE") == null ? null : map.get("WAREHOUSING_DATE").toString();
            String empId = map.get("EMP_ID") == null ? null : map.get("EMP_ID").toString();
            String acceptorId = map.get("ACCEPTOR_ID") == null ? null : map.get("ACCEPTOR_ID").toString();
            String certificateUrl = map.get("CERTIFICATE_URL") == null ? null : map.get("CERTIFICATE_URL").toString();
            String detailedListUrl = map.get("DETAILED_LIST_URL") == null ? null : map.get("DETAILED_LIST_URL").toString();
            String remark = map.get("REMARK") == null ? null : map.get("REMARK").toString();

            SQLServerWarehousingEntry s = new SQLServerWarehousingEntry();
            s.setWarehousingEntryId(warehousingEntryId);
            s.setWarehousingDate(warehousingDate);
            if (empId != null) s.setEmpId(Integer.valueOf(empId));
            if (acceptorId != null) s.setAcceptorId(Integer.valueOf(acceptorId));
            s.setCertificateUrl(certificateUrl);
            s.setDetailedListUrl(detailedListUrl);
            s.setRemark(remark);
            sqlServerMapper.insertWarehousingEntry(s);
        }
        List<SQLServerWarehousingEntry> list = sqlServerMapper.getAllWarehousingEntry();
        return list;
    }

    /**
     * 获取入库详情表数据
     *
     * @return
     */
    @Override
    public List<SQLServerWarehousingEntryDetail> getAllWarehousingEntryDetail() {
        // 获取sqlite数据库中入库详情表的数据
        List<Map<String, Object>> all = sqliteMapper.getAllWarehousingEntryDetail();

        // 删除SQLserver数据库上入库详情表的数据
        sqlServerMapper.deleteAllWarehousingEntryDetail();

        int size = all.size();
        for (int i = 0; i < size; i++) {
            Map<String, Object> map = all.get(i);
            String warehousingEntryId = map.get("WAREHOUSING_ENTRY_ID") == null ? null : map.get("WAREHOUSING_ENTRY_ID").toString();
            String toolId = map.get("TOOL_ID") == null ? null : map.get("TOOL_ID").toString();
            String lastTestDate = map.get("LAST_TEST_DATE") == null ? null : map.get("LAST_TEST_DATE").toString();
            String nextTestDate = map.get("NEXT_TEST_DATE") == null ? null : map.get("NEXT_TEST_DATE").toString();
            String acceptAmount = map.get("ACCEPT_AMOUNT") == null ? null : map.get("ACCEPT_AMOUNT").toString();
            String remark = map.get("REMARK") == null ? null : map.get("REMARK").toString();

            SQLServerWarehousingEntryDetail s = new SQLServerWarehousingEntryDetail();
            s.setWarehousingEntryId(warehousingEntryId);
            if (toolId != null)s.setToolId(Integer.valueOf(toolId));
            s.setLastTestDate(lastTestDate);
            s.setNextTestDate(nextTestDate);
            if (acceptAmount != null)s.setAcceptAmount(Integer.valueOf(acceptAmount));
            s.setRemark(remark);
            sqlServerMapper.insertWarehousingEntryDetail(s);
        }
        List<SQLServerWarehousingEntryDetail> list = sqlServerMapper.getAllWarehousingEntryDetail();
        return list;
    }

    /**
     * 清空所有表中的数据
     * @return
     */
    public int deleteAllTables() {
        int num = 0;
        try {
            sqlServerMapper.deleteAllTables();
            num = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }
}

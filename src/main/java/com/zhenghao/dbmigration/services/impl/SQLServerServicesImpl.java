package com.zhenghao.dbmigration.services.impl;

import com.zhenghao.dbmigration.dao.sqlite.SqliteMapper;
import com.zhenghao.dbmigration.dao.sqlserver.SQLServerMapper;
import com.zhenghao.dbmigration.entity.sqlserver.SQLServerBorrowEntry;
import com.zhenghao.dbmigration.entity.sqlserver.SQLServerBorrowEntryDetail;
import com.zhenghao.dbmigration.entity.sqlserver.SQLServerDetailedList;
import com.zhenghao.dbmigration.entity.sqlserver.SQLServerEmployee;
import com.zhenghao.dbmigration.services.sqlserver.SQLServerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
    public List<SQLServerEmployee> getAllEmployee() {
        // 获取sqlite数据库中员工表的数据
        List<Map<String, Object>> all = sqliteMapper.getAllEmployee();

        // 删除SQLserver数据库上员工表的数据
        sqlServerMapper.deleteAllEmployee();

        int size = all.size();
        for (int i = 0; i < size; i++) {
            Map<String, Object> stringObjectMap = all.get(i);
            int id = Integer.valueOf(stringObjectMap.get("_id").toString());
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
            s.setEmpId(id);
            s.setEmpName(empName);
            s.setPassword(password);
            s.setCardId(cardId);
            s.setTelephone(telephone);
            s.setGender(gender);
            s.setBirthday(birthday);
            s.setRegistDate(registDate);
            s.setModifyDate(modifyDate);
            s.setPriority(Integer.valueOf(priority));
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
            s.setDetailedListId(Integer.valueOf(detailedListId));
            s.setBorrowEmpId(Integer.valueOf(borrowEmpId));
            s.setBorrowDate(borrowDate);
            s.setPlanReturnDate(planReturnDate);
            s.setActualReturnDate(actualReturnDate);
            s.setReturnEmpId(Integer.valueOf(returnEmpId));
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
            s.setId(Integer.valueOf(id));
            s.setBorrowEntryId(borrowEntryId);
            s.setToolId(Integer.valueOf(toolId));
            s.setBorrowNumber(Integer.valueOf(borrowNumber));
            s.setReturnNumber(Integer.valueOf(returnNumber));
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
            s.setDetailedListId(Integer.valueOf(id));
            s.setDetailedListName(detailedListName);
            s.setRemark(remark);
            sqlServerMapper.insertDetailedList(s);
        }
        List<SQLServerDetailedList> list = sqlServerMapper.getAllDetailedList();
        return list;
    }
}

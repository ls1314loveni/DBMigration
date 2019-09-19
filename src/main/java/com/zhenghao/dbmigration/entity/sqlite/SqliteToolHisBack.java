package com.zhenghao.dbmigration.entity.sqlite;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tool_his_back")
public class SqliteToolHisBack {

    private Long id;
    private String borrowEntryId;
    private Long detailedListId;
    private String barCode;
    private Long toolId;
    private String returnDate;
    private Long returnEmpId;
    private String purpose;
    private String testEmpName;
    private String testStatus;
    private String remark;

}

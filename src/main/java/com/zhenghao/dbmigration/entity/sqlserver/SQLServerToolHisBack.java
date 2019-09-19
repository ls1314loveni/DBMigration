package com.zhenghao.dbmigration.entity.sqlserver;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tool_his_back")
public class SQLServerToolHisBack {

    private Integer id;
    private String borrowEntryId;
    private Integer detailedListId;
    private String barCode;
    private Integer toolId;
    private String returnDate;
    private Integer returnEmpId;
    private String purpose;
    private String testEmpName;
    private String testStatus;
    private String remark;

}

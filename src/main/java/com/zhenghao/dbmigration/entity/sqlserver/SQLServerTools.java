package com.zhenghao.dbmigration.entity.sqlserver;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tools")
public class SQLServerTools {

    private String barCode;
    private String flagBarCode;
    private String briefCode;
    private Integer toolId;
    private String warehousingEntryId;
    private String lastBorrowEntryId;
    private String lastTestDate;
    private String nextTestDate;
    private Integer numberOfUse;
    private String status;
    private String testStatus;
    private Integer maintenanceNumber;
    private String remark;

}

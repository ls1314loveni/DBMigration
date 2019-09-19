package com.zhenghao.dbmigration.entity.sqlite;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tools")
public class SqliteTools {

    private String barCode;
    private String flagBarCode;
    private String briefCode;
    private Long toolId;
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

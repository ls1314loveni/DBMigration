package com.zhenghao.dbmigration.entity.sqlserver;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "borrow_entry_detail")
public class SQLServerBorrowEntryDetail {

    private Integer id;
    private String borrowEntryId;
    private Integer toolId;
    private Integer borrowNumber;
    private Integer returnNumber;
    private String testEmpName;
    private String remark;
    private String reserved1;
    private String reserved2;
    private String reserved3;
    private String reserved4;
    private String reserved5;

}

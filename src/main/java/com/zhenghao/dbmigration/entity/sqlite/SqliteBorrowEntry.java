package com.zhenghao.dbmigration.entity.sqlite;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "borrow_entry")
public class SqliteBorrowEntry {

    private String borrowEntryId;
    private Integer detailedListId;
    private Integer borrowEmpId;
    private String borrowDate;
    private String planReturnDate;
    private String actualReturnDate;
    private Integer returnEmpId;
    private String purpose;
    private String taskTicket;
    private String borrowTickDate;
    private String status;
    private String remark;
    private String reserved1;
    private String reserved2;
    private String reserved3;
    private String reserved4;
    private String reserved5;

}

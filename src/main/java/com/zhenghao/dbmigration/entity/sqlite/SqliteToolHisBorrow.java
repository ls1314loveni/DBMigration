package com.zhenghao.dbmigration.entity.sqlite;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tool_his_borrow")
public class SqliteToolHisBorrow {

    private Long _id;
    private String borrowEntryId;
    private Long detailedListId;
    private String barCode;
    private Long toolId;
    private String borrowDate;
    private Integer numberOfUse;
    private Long borrowEmpId;
    private String remark;

}

package com.zhenghao.dbmigration.entity.sqlserver;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tool_his_borrow")
public class SQLServerToolHisBorrow {

    private Integer id;
    private String borrowEntryId;
    private Integer detailedListId;
    private String barCode;
    private Integer toolId;
    private String borrowDate;
    private Integer numberOfUse;
    private Integer borrowEmpId;
    private String remark;

}

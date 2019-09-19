package com.zhenghao.dbmigration.entity.sqlserver;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "discard_entry")
public class SQLServerDiscardEntry {

    private String discardEntryId;
    private Integer discardEmpId;
    private String discardDate;
    private Integer auditEmpId;
    private String auditDate;
    private String status;
    private String remark;

}

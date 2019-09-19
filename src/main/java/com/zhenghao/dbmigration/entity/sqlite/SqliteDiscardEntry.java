package com.zhenghao.dbmigration.entity.sqlite;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "discard_entry")
public class SqliteDiscardEntry {

    private String discardEntryId;
    private Long discardEmpId;
    private String discardDate;
    private Long auditEmpId;
    private String auditDate;
    private String status;
    private String remark;

}

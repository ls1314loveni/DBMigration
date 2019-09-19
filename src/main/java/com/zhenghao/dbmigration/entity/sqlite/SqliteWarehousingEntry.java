package com.zhenghao.dbmigration.entity.sqlite;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "warehousing_entry")
public class SqliteWarehousingEntry {

    private String warehousingEntryId;
    private String warehousingDate;
    private Long empId;
    private Long acceptorId;
    private String certificateUrl;
    private String detailedListUrl;
    private String remark;

}

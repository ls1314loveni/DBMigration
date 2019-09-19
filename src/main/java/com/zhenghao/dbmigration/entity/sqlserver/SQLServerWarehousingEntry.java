package com.zhenghao.dbmigration.entity.sqlserver;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "warehousing_entry")
public class SQLServerWarehousingEntry {

    private String warehousingEntryId;
    private String warehousingDate;
    private Integer empId;
    private Integer acceptorId;
    private String certificateUrl;
    private String detailedListUrl;
    private String remark;

}

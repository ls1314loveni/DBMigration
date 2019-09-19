package com.zhenghao.dbmigration.entity.sqlserver;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "warehousing_entryDetail")
public class SQLServerWarehousingEntryDetail {

    private String warehousingEntryId;
    private Integer toolId;
    private String lastTestDate;
    private String nextTestDate;
    private Integer acceptAmount;
    private String remark;

}

package com.zhenghao.dbmigration.entity.sqlite;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "warehousing_entryDetail")
public class SqliteWarehousingEntryDetail {

    private String warehousingEntryId;
    private Long toolId;
    private String lastTestDate;
    private String nextTestDate;
    private Integer acceptAmount;
    private String remark;

}

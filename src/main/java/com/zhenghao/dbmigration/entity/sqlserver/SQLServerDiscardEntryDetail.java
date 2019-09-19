package com.zhenghao.dbmigration.entity.sqlserver;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "discard_entry_detail")
public class SQLServerDiscardEntryDetail {

    private Integer id;
    private String discardEntryId;
    private String barCode;
    private Integer toolId;
    private Integer categoryId;
    private String reason;

}

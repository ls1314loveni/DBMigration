package com.zhenghao.dbmigration.entity.sqlite;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "discard_entry_detail")
public class SqliteDiscardEntryDetail {

    private Long _id;
    private Long discardEntryId;
    private String barCode;
    private Long toolId;
    private Long categoryId;
    private String reason;

}

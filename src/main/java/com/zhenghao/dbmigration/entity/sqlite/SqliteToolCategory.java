package com.zhenghao.dbmigration.entity.sqlite;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tool_category")
public class SqliteToolCategory {

    private Long _id;
    private String categoryName;
    private Long fatherId;
    private String categoryTag;

}

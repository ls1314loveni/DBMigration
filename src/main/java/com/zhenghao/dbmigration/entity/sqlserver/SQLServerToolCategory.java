package com.zhenghao.dbmigration.entity.sqlserver;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tool_category")
public class SQLServerToolCategory {

    private Integer categoryId;
    private String categoryName;
    private Integer fatherId;
    private String categoryTag;

}

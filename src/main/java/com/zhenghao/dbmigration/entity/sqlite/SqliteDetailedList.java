package com.zhenghao.dbmigration.entity.sqlite;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "detailed_list")
public class SqliteDetailedList {

    private Long _id;
    private String detailedListName;
    private String remark;

}

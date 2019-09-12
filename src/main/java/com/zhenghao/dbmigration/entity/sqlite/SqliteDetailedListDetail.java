package com.zhenghao.dbmigration.entity.sqlite;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "detailed_list_detail")
public class SqliteDetailedListDetail {

    private Long id;
    private Integer DETAILED_LIST_ID;
    private Integer TOOL_ID;
    private Integer BORROW_NUMBER;
    private Integer REMARK;

}

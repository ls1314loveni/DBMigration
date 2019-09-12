package com.zhenghao.dbmigration.entity.sqlserver;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "detailed_list_detail")
public class SQLServerDetailedListDetail {

    private Integer id;
    private Integer DETAILED_LIST_ID;
    private Integer TOOL_ID;
    private Integer BORROW_NUMBER;
    private Integer REMARK;

}

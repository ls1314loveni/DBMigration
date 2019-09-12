package com.zhenghao.dbmigration.entity.sqlserver;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "detailed_list")
public class SQLServerDetailedList {

    private Integer detailedListId;
    private String detailedListName;
    private String remark;

}

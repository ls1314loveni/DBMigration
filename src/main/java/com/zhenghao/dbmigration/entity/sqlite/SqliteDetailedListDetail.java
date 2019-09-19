package com.zhenghao.dbmigration.entity.sqlite;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "detailed_list_detail")
public class SqliteDetailedListDetail {

    private Long id;
    private Integer detailedListId;
    private Integer toolId;
    private Integer borrowNumber;
    private String remark;

}

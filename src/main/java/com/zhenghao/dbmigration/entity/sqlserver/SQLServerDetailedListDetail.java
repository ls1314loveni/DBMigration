package com.zhenghao.dbmigration.entity.sqlserver;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "detailed_list_detail")
public class SQLServerDetailedListDetail {

    private Integer id;
    private Integer detailedListId;
    private Integer toolId;
    private Integer borrowNumber;
    private String remark;

}

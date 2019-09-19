package com.zhenghao.dbmigration.entity.sqlite;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tool_info")
public class SqliteToolInfo {

    private Long _id;
    private String toolName;
    private Long categoryId;
    private String briefCode;
    private Integer inAmount;
    private Integer borrowAmount;
    private String specification;
    private String unit;
    private String manufacturer;
    private String priceUnit;
    private String testPeriod;
    private String dateInProduced;
    private String remark;

}

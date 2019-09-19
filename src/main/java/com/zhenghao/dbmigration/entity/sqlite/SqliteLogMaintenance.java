package com.zhenghao.dbmigration.entity.sqlite;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "log_maintenance")
public class SqliteLogMaintenance {

    private Long _id;
    private String maintenanceId;
    private Long maintenanceEmpId;
    private String maintenanceDate;
    private String barCode;
    private String status;

}

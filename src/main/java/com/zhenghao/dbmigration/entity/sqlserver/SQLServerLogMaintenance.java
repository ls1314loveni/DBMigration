package com.zhenghao.dbmigration.entity.sqlserver;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "log_maintenance")
public class SQLServerLogMaintenance {

    private Integer id;
    private String maintenanceId;
    private Integer maintenanceEmpId;
    private String maintenanceDate;
    private String barCode;
    private String status;

}

package com.zhenghao.dbmigration.entity.sqlserver;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "employee")
public class SQLServerEmployee {

    private Integer empId;
    private String empName;
    private String password;
    private String cardId;
    private String telephone;
    private String gender;
    private String birthday;
    private String registDate;
    private String modifyDate;
    private Integer priority;
    private String openDoorTime;
    private String flag;

}

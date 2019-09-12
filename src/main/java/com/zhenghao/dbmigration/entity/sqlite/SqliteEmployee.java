package com.zhenghao.dbmigration.entity.sqlite;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "employee")
public class SqliteEmployee {

    private Long _id;
    private String empName;
    private String password;
    private String cardId;
    private String telephone;
    private String gender;
    private String birthday;
    private String registDate;
    private String modifyDate;
    private String priority;
    private String openDoorTime;
    private String flag;

}

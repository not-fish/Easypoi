package com.peko.easypoi.entity;

import cn.afterturn.easypoi.excel.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@ExcelTarget("userssimple")
public class UserSimple implements Serializable {
    @Excel(name = "编号")
    private String id;

    @Excel(name = "姓名")
    private String name;

    @Excel(name = "年龄")
    private String age;

    @Excel(name = "生日",width = 35.0,format = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;

}

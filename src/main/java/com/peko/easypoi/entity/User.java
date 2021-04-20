package com.peko.easypoi.entity;

import cn.afterturn.easypoi.excel.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@ExcelTarget("users")
public class User implements Serializable {
    @Excel(name = "编号")
    private String id;

    @Excel(name = "姓名")
    private String name;

    @Excel(name = "年龄")
    private String age;

    @Excel(name = "生日",width = 35.0,format = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;

//    @Excel(name = "爱好",width = 30)
    @ExcelIgnore
    private List<String> hobby;

    @Excel(name = "爱好",width = 30.0)
    private String hobbyStr;

    @ExcelEntity
    private Card card;

    @ExcelCollection(name = "订单列表")
    private List<Order> orders;

    //重载hobbyStr的get方法
     public String getHobbyStr(){
        StringBuilder sb = new StringBuilder();
         hobby.forEach(e->{
             sb.append(e).append("、");
         });
         sb.deleteCharAt(sb.lastIndexOf("、"));

        return sb.toString();
    }

}

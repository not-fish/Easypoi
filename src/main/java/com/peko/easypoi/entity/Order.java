package com.peko.easypoi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 与 User 实体是一对多关系，则 User要打印 Card 需要使用 @ExcelCollection
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ExcelTarget("order")
public class Order implements Serializable {
    @Excel(name = "订单编号",width = 15.0)
    private String no;

    @Excel(name = "订单名称",width = 15.0)
    private String name;


}

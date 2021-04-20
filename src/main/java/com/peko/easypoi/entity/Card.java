package com.peko.easypoi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelIgnore;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 与 User 实体是一对一关系，则 User要打印 Card 需要使用 @ExcelEntity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ExcelTarget("card")
public class Card implements Serializable {
    @Excel(name = "身份证号",width = 20.0)
    private String no;

    @Excel(name = "籍贯")
    private String place;


}

package com;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.peko.easypoi.entity.Card;
import com.peko.easypoi.entity.Order;
import com.peko.easypoi.entity.User;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestPOI {

    @Test
    public void textExport() throws IOException{
        //设置数据
        List<User> lists = getUsers();
        //导出Excel
        //参数1：exportParams 导出配置对象    参数2：导出的类型    参数3：导出数据集合
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("用户信息列表","用户信息"),User.class,lists);
        //将Excel写入固定位置
        FileOutputStream outputStream = new FileOutputStream("E:/myexcel/a.xls");
        workbook.write(outputStream);
        outputStream.close();
        workbook.close();
    }

    public List<User> getUsers(){

        List<User> lists = new ArrayList<>();

        for(int i=0;i<5;i++){
            User user = new User();
            user.setId(String.valueOf(i));
            user.setName("用户_"+i);
            user.setAge(String.valueOf(10+i));
            user.setBirthday(new Date());
            user.setHobby(Arrays.asList("打波","踢波"));
            user.setCard(new Card("123456","旮旯"));
            List<Order> orders = new ArrayList<>();
            orders.add(new Order("01","衣服"));
            orders.add(new Order("02","裤子"));
            user.setOrders(orders);
            user.setPhoto("E:/myexcel/csdn-menu/antd.png");
            lists.add(user);
        }

        return lists;
    }

}

package com.day1.www;

import java.util.Calendar;

public class New34 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//获取当前那时间
        c.set(Calendar.DATE, 1);//设置代表的日期为1号
        System.out.println(c);
        int start = c.get(Calendar.DAY_OF_WEEK);//获取一号是星期几
        int maxDay = c.getActualMaximum(Calendar.DATE);//获得当前月的最大日期数
        //输出标题
        System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
        for (int i = 1; i < start; i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= maxDay; i++) {
            System.out.print(i + "\t"+"\t");
            if ((start + i - 1) % 7 == 0) {//判断是否换行
                System.out.println();
            }
        }
        System.out.println();//换行
    }
}

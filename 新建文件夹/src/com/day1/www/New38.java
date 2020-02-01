package com.day1.www;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class New38 {
    public static void main(String[] args) {
        HashMap<String, String> h = new HashMap<String, String>();
        h.put("1","aaa");
        h.put("2","bbb");
        h.put("3","ccc");

        System.out.println("第一种遍历方式");
        for (Object key : h.keySet()){
            System.out.println(key +":"+h.get(key));
        }
        System.out.println("第二种遍历方式");
        Set s = h.keySet();//获取键的集合
        Iterator i = s.iterator();
        while (i.hasNext()){
            Object key = i.next();
            Object value = h.get(key);
            System.out.println(key+":"+value);
        }
        System.out.println("第三种遍历方式");
        for (Map.Entry<String, String> entry : h.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}

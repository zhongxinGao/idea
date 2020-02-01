package com.reflect;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-10-11 14:20
 * ​
 **/
public class New1 {
    public static void main(String[] args){
        //在运行期间一个类只会产生一个Class对象
        Student s = new Student();
        //第一种
        Class c1 = s.getClass();
        System.out.println(c1.hashCode());
        //第二种
        Class c2 = Student.class;
        System.out.println(c2.hashCode());
        //第三种


        try {
            Class c3 = Class.forName("com.reflect.Student");
            System.out.println(c3.hashCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
    class Student {}

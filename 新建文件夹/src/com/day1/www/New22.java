package com.day1.www;

public class New22 {
    public static void main(String[] args) {
    Student s = new Student();
    s.setAge(21);
    s.setName("张");
    s.run();
    }
}
    class Student{
    private int age;
    private String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void run(){
            System.out.println("我叫"+name+"今年"+age+"岁");
        }
    }

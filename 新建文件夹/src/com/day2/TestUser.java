package com.day2;

public class TestUser {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.day2.User");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

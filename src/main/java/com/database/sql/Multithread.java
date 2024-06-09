package com.database.sql;

public class Multithread {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            System.out.println(i);
            ThreadDemo threadDemo = new ThreadDemo();
            System.out.println(i);
            threadDemo.start();
            System.out.println(i);
        }
    }
}

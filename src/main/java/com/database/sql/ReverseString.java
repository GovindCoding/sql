package com.database.sql;

import java.util.Locale;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println("Hello reverse string......");
        String name = "govind";
        System.out.println(name.substring(2,3));
        System.out.println(name.getBytes());
        System.out.println(name.toLowerCase(Locale.ROOT));

    }

}

package com.half.javalearning;

import java.util.Scanner;

public class JavaLearning {
    public static void main(String[] args) {
        String a = "hello";
        //String b = "hello";
        //Sy<stem.out.println(a == b); // Might print true due to string pooling

        String c = new Scanner(System.in).nextLine(); // User types "hello"
        System.out.println(a == c); // Will print false even if c contains "hello"
        if(c.toLowerCase().equals(a)){
            System.out.println("Hey");
        }
    }
}
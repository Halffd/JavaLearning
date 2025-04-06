/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.half.javalearning;

import java.util.Scanner;

/**
 *
 * @author half
 */
public class Strings {
    public void equal(){
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

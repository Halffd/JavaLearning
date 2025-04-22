package com.half.javalearning;

import java.util.Scanner;

public class JavaLearning {
    public static void main(String[] args) {
        Aluno.criar();
        ConcreteExample concreteExample = new ConcreteExample(10, "Hello");
        System.out.println(concreteExample.getName()+" "+concreteExample.getValue());
        MathUtility.calc(args);
        // HelloServer.start(args);
    }
}
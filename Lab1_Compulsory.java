/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1_pa;

/**
 *
 * @author Bucataru Cristian
 */
public class Lab1_Compulsory {
    public void comp(){
        System.out.println("Hello World");
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n1 = (int) (Math.random() * 1_000_000);
        System.out.println(n1);
        int result = n1*3;
        System.out.println(result);
        result += Integer.parseInt("10101",2);
        System.out.println(result);
        result += Integer.parseInt("FF",16);
        System.out.println(result);
        result *= 6;
        System.out.println(result);
        int sumOfDig = 0;
        do {
            while(result!=0)
            {
                sumOfDig += result%10;
                result /= 10;
            }
            result = sumOfDig;
            sumOfDig = 0;
        } while(result>=10);
        System.out.println(result);
        System.out.println("Willy-nilly, this semester I will learn " + languages[result]);
    }
}

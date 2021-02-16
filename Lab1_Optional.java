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
public class Lab1_Optional {
    public void opt(String[] args){
        int n = 5;
        /*
        try
        {
            n = Integer.parseInt(args[0]);
        }
        catch(Exception e)
        {
            System.out.println("Not an integer!");
            return;
        }
*/
        int[][] matrix = new int[n][n];
        System.out.println(Math.random());
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                matrix[i][j] = (int) (Math.random()*1_000_000)%2;
                System.out.printf("%d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}

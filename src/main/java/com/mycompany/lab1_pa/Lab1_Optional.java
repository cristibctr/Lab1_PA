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
    int[] visit = new int [10000];
    int [][] DFSMatrix = new int [10000][10000];
    public void opt(String[] args){
        long startTime = System.nanoTime();
        int n = 0;
        try
        {
            n = Integer.parseInt(args[0]);
        }
        catch(Exception e)
        {
            System.out.println("Not an integer!");
            return;
        }
        if(n%2 == 0) 
        {
            System.out.println("Not odd!");
            return;
        }
        int[][] matrix = new int[n][n];
        //Atribui 0 sau 1 random primei jumatati a matricii
        for(int i = 1; i<n; i++)
        {
            for(int j = 0; j<i; j++)
            {
                matrix[i][j] = (int) (Math.random()*1_000_000)%2;
            }
        }
        //Adaug a doua jumatate de dupa diagonala principala
        for(int i = 0; i<n-1; i++)
            for(int j = i+1; j<n; j++)
                matrix[i][j] = matrix[j][i];
        //Afisez matricea
        printMatrix(matrix, n);
        int ok = 0;
        for(int i = 0; i < n; i++)
            resetArr(DFSMatrix[i], n);
        DFS(matrix, 0, n);
        for(int i = 0; i<n; i++)
        {
            if(visit[i] == 0) 
            {
                System.out.println("Graful nu este conex");
                ok = 1;
                break;
            }
        }
        if(ok == 1)
        {
            int[] visitVerify = new int [100];
            resetArr(visitVerify, n);
            System.out.println("Subgrafurile conexe:");
            for(int i = 0; i<n; i++)
            {
                if(visitVerify[i] == 0)
                {
                    resetArr(visit, n);
                    DFS(matrix, i, n);
                    for(int k = 0; k < n; k++)
                        if(visit[k] == 1)
                        {
                            visitVerify[k] = 1;
                            System.out.printf("%d", k);
                        }
                    System.out.println();
                }
            }
        }
        else
        {
            System.out.println("partial tree matrix:");
            printMatrix(DFSMatrix,n);
        }
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Running time in nanoseconds: " + totalTime);
    }
    public void DFS(int[][] matr, int x, int n)
    {
        visit[x] = 1;
        
        for(int i = 0; i < n; i++)
        {
            if(matr[x][i] == 1 && visit[i] == 0) 
            {
                DFSMatrix[x][i] = 1;
                DFS(matr, i, n);
            }
        }
    }
    public void resetArr(int[] Arr, int n)
    {
        for(int i = 0; i < n; i++)
        {
            Arr[i] = 0;
        }
    }
    public void printMatrix(int[][] matr, int n)
    {
        if(n>14)
            System.out.println("Matrix too large to print");
        else
        {
            for(int i = 0; i<n; i++)
            {
                for(int j = 0; j<n; j++)
                    System.out.printf("%d", matr[i][j]);
                System.out.println();
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1_pa;

/**
 *
 * @author crist
 */
public class Lab1_randRootTree {
    int numberInTree = 0;
    public void randRootTree(nodeDef node, int n, int maxDepth)
    {
        if(n < maxDepth)
        {
            node.nrOfChild = (int) (Math.random()*3);
            System.out.println(node.nrOfChild);
            for(int i = 0; i < node.nrOfChild; i++)
            {
                node.nodeNr[i] = new nodeDef(n+1);
                randRootTree(node.nodeNr[i], n+1, maxDepth);
            }
        }
        else
        {
            node.nrOfChild = 0;
        }
    }
    public void printTree(nodeDef node, int nrOfChild)
    {
        //print Tree depth with + and print - when nrOfChild == 0
        if(node != null)
            for(int j = 0; j < nrOfChild; j++)
            {
                for(int i = 0; i < node.nr; i++)
                {
                    System.out.printf(" ");
                }
                if(node.nrOfChild == 0)
                    System.out.printf("-");
                else
                    System.out.printf("+");
                System.out.printf("node");
                System.out.printf("%d", numberInTree);
                System.out.println();
                numberInTree++;
                printTree(node.nodeNr[j], node.nrOfChild);
            }
    }
}

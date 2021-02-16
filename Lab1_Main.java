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
public class Lab1_Main {
    public static void main(String[] args)
    {
        Lab1_Compulsory compObj = new Lab1_Compulsory();
        compObj.comp();
        
        Lab1_Optional optObj = new Lab1_Optional();
        optObj.opt(args);
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Fitrah
 */
public class WSIB_week3_1_2 {
    public static void main(String[] args) {
        System.out.print("\t Do_While \n"
                + "Bilangan kelipatan 2 (1-100) \n"
                + "============================ \n"); 
        int awal = 2;
        do{
            System.out.print(" "+awal+" ");  
            awal*=2;
        }while(awal<=100);
    }
}

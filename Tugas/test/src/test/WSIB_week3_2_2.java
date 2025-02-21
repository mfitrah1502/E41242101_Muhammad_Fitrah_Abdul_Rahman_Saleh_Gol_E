/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.*;

/**
 *
 * @author Fitrah
 */
public class WSIB_week3_2_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Batas Angka : ");
        int jumlahderet = sc.nextInt();
        
        int[]deret = new int[jumlahderet];
        for(int i = 0; i<jumlahderet; i++){
            deret[i]=rd.nextInt(100);
        }
        System.out.println("Deretan angka random :");
        for(int angka : deret){
            System.out.println(angka+" ");
        }
    }
}

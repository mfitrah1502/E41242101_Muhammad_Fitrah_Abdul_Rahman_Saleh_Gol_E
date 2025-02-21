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
public class WSIB_week3_1_1 {
    static int angka1, angka2;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan angka pertama : ");
        angka1 = sc.nextInt();
        System.out.print("Masukkan angka kedua : ");
        angka2 = sc.nextInt();
        for(int i = angka1; i < angka2; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;
public class segitiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah titik segitiga : ");
        int batas = sc.nextInt();
        for(int i = 0; i <=batas ;i++){
            for(int j = i; j < batas ; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Fitrah
 */
public class array1dimensi {
    public static void main(String[] args) {
        int[]angka = {5,10,17,20,1};
        String[]teks = {"Saya","sedang","belajar","OOP","Java"};
        
        for(int i = 0; i<angka.length; i++){
            System.out.println(angka[i]);
        }
        for(int j = 0; j<angka.length;j++){
            System.out.print(teks[j]);
            System.out.print(" ");
        }
    }
}

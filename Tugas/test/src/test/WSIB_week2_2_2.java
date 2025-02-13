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
public class WSIB_week2_2_2 {
    public static Scanner sc = new Scanner(System.in);
    public static String nama;
    public static void main(String[] args) {
        System.out.println("CAFE CERIA"+"\n"
                + "ANEKA MINUMAN"+"\n"
                + "------------------------------------"+"\n"
                + "SPECIAL MENU"+"\n"
                + "1. Soft drinks"+"\n"
                + "2. Mix juice"+"\n"
                + "3. Nescafe"+"\n"
                + "4. Soda milk"+"\n"
                + "5. Tea"+"\n"
                + "------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        nama = sc.nextLine();
        System.out.print("Silahkan masukkan pilihan anda : ");
        int pilihan = sc.nextInt();
        String Tambahan = "Pesanan akan segera kami antar"+"\n"
                + "Terima Kasih "+nama+" telah berkunjung di Cafe Ceria";
        switch(pilihan){
            case 1 :
                System.out.println("Minuman yang anda pesan adalah Soft drinks"+"\n"+Tambahan);
                break;
            case 2 :
                System.out.println("Minuman yang anda pesan adalah Mix juice"+"\n"+Tambahan);
                break;
            case 3 :
                System.out.println("Minuman yang anda pesan adalah Nescafe"+"\n"+Tambahan);
                break;
            case 4 :
                System.out.println("Minuman yang anda pesan adalah Soda milk"+"\n"+Tambahan);
                break;
            case 5 :
                System.out.println("Minuman yang anda pesan adalah Tea"+"\n"+Tambahan);
                break;
        }
    }
}

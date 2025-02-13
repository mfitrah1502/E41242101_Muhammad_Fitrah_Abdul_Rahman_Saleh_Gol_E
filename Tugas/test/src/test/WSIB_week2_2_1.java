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
public class WSIB_week2_2_1 {
    public static double harga1, harga2, harga3, harga4, harga5, total;
    public static String nama;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama anda : ");
        nama = sc.nextLine();
        System.out.print("Masukkan harga barang 1 : ");
        harga1 = sc.nextDouble();
        System.out.print("Masukkan harga barang 2 : ");
        harga2 = sc.nextDouble();
        System.out.print("Masukkan harga barang 3 : ");
        harga3 = sc.nextDouble();
        System.out.print("Masukkan harga barang 4 : ");
        harga4 = sc.nextDouble();
        System.out.print("Masukkan harga barang 5 : ");
        harga5 = sc.nextDouble();
        
        total = harga1+harga2+harga3+harga4+harga5;
        
        System.out.print("Kharisma Agung Plaza <KAP>"+"\n"
                + "Promo Belanja Berhadiah"+"\n"
                + "Dengan Harga Minimum Rp.10000,00"+"\n"
                + "------------------------------------"+"\n"
                + "Harga Barang ke-1: Rp. "+harga1+"\n"
                + "Harga Barang ke-1: Rp. "+harga2+"\n"
                + "Harga Barang ke-1: Rp. "+harga3+"\n"
                + "Harga Barang ke-1: Rp. "+harga4+"\n"
                + "Harga Barang ke-1: Rp. "+harga5+"\n"
                + "Total Harga Pembelian Atas nama "+nama+" Dengan Total "+total+"\n"
                        + "\n"
                        + "Selamat . . . ."+"\n"
                        + "Anda Mendapat Hadiah 1 Buah Mug Cantik"+"\n"
                        + "\n"
                        + "------------------------------------"+"\n"
                        + "Terima Kasih"+"\n"
                        + "Anda Sudah Belanja di Kharisma Agung Plazza"+"\n");
    }
}

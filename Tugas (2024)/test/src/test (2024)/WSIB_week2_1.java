/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
public class WSIB_week2_1 {
static String studentName;
static int stuID;
static String stuStatus;   

public static void showData(){
    studentName = "Lisa Palombo";
    stuID = 123456789;
    stuStatus = "Active";
    
    System.out.println("Nama : "+studentName);
    System.out.println("ID :" + stuID);
    System.out.println("Status Mahasiswa : " + stuStatus);
}
    public static void main(String[] args) {
        showData();
    }
}

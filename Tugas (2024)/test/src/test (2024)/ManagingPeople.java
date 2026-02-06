/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Fitrah
 */
public class ManagingPeople {
    public static void main(String[] args) {
        Person p1 = new Person("Ariel", 37);
        Person p2 = new Person("Joseph", 15);
        
        if(p1.getage()==p2.getage()){
            System.out.println(p1.getname() +" is the same age "+p2.getname());
        }else{
            System.out.println(p1.getname()+" is not the same age "+p2.getname());
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
public class Person {
    
    public String name;
    public int age;
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getname(){return name;}
    public int getage(){return age;}
    public void setage(int age){this.age=age;}
}

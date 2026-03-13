/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lubiproject1;

/**
 *
 * @author STT MANDALA
 */
public class OperasiMatematika {
    public static void main(String[] args){
        int a = 10;
        int b = 3;
        
        System.out.println("Nilai a = " + (a + b));
        System.out.println("Nilai b = " + (a + b));
        System.out.println("-----------------------");
        
        //Penjumlahan
        System.out.println("a + b = " + (a + b));
        
        //Pengurangan
        System.out.println("a - b = " + (a - b));
        
        //Perkalian
        System.out.println("a * b = " + (a * b));
        
        //Pembagian (Perhatikan hasilnya integer!)
        System.out.println("a / b = " + (a / b));
        
        //Modulus (Sisa Bagi)
        System.out.println("a % b = " + (a % b));
        
        //Tips: Jika ingin hasil pembagian desimal
        double hasilBagi = (double) a / b; //casting
        System.out.println("a/b (desimal) = " + hasilBagi);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lubiproject1;
import java.util.Scanner;
/**
 *
 * @author STT MANDALA
 */
public class CekGanjilGenap {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int angka;
        
        System.out.print("Masukkan Sebuah Angka : ");
        angka = scan.nextInt();
        
        if(angka % 2 ==0){
            System.out.println(angka + "adalah bilangan GENAP");
        }else{
            System.out.println(angka + "adalah bilangan GANJIL");
        }
        scan.close();
    }
}

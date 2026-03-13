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
public class LogikaKaryawan {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int umur, pengalaman;
        
        System.out.print("Masukkan Umur: ");
        umur = scan.nextInt();
        
        System.out.print("Masukkan Pengalaman: ");
        pengalaman = scan.nextInt();
        
        //Logika And (&&)
        //Harus kedua-duanya benar baru hasilnya true
        boolean lolos = (umur >= 21) && (pengalaman >= 2);
        
        System.out.println("--------------------------------");
        System.out.println("Status Kelulusan : " + lolos);
        
        //Logika OR (||)
        //Misal syarat diperlongga: cukup umur tua ATAU pengalaman banyak
        boolean lolosAlternatif = (umur >= 30) || (pengalaman >= 5);
        System.out.println("Lolos Alternatif? " + lolosAlternatif);
        
        scan.close();
    }
        
}

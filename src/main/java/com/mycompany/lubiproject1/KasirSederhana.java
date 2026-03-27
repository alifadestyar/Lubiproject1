/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lubiproject1;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class KasirSederhana {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int total =0;
        char pilihan;
        
        System.out.println("\n===== KASIR SEDERHANA =====");
        
        do{
            System.out.println("Masukkan Harga Barang: ");
            int harga = scan.nextInt();
            total += harga;
                    
            System.out.print("Ada Barang Lagi? ");
            pilihan = scan.next().charAt(0);
        } while (pilihan== 'y' || pilihan == 'Y');
        System.out.println("-----------------------------");
        System.out.println("Total Harga: Rp" + total);
        System.out.println("Terima Kasih telah Berbelanja!");
        scan.close();
    }
}

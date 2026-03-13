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
public class GajiPokok {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double gajiPokok, tunjangan, pajak, gajiBersih;
        
        System.out.print("Masukkan Gaji Pokok : Rp.");
        gajiPokok = input.nextDouble();
        
        //Proses Aritmatika
        tunjangan = 0.2 * gajiPokok; //20%
        pajak = 0.05 * (gajiPokok + tunjangan); //5%
        gajiBersih =gajiPokok + tunjangan - pajak;
        
        System.out.println("\n=== SLIP GAJI ===");
        System.out.println("Gaji Pokok   : Rp. " + gajiPokok);
        System.out.println("Tunjangan   : Rp. " + tunjangan);
        System.out.println("Pajak   : Rp. " + pajak);
        System.out.println("----------------------");
        System.out.println("Gaji Bersih : Rp." + gajiBersih);      
    }    
}

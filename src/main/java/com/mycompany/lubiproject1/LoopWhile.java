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
public class LoopWhile {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int angkaRahasia = 7;
        int tebakan = 0;
        
        while(tebakan != angkaRahasia){
            System.out.print("Tebak angka (1-10): ");
            tebakan = scan.nextInt();
            
            if(tebakan !=angkaRahasia){
                System.out.println("Salah! Silakan Coba Lagi.");
            }
        }
        System.out.println("Benar! Angka Rahasianya adalah " + angkaRahasia);
        scan.close();
    }
}

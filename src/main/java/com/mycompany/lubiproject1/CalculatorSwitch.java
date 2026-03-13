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
public class CalculatorSwitch {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double angka1, angka2, hasil = 0;
        char operator;

        System.out.print("Masukkan Angka 1 : ");
        angka1 = scan.nextDouble();

        System.out.print("Masukkan Angka 2 : ");
        angka2 = scan.nextDouble();
        
        System.out.print("Pilih Operator ( +, -, /)");
        operator = scan.next().charAt(0);
        
        switch (operator){
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '/':
                hasil = angka1 / angka2;
                break;
            default:
                System.out.println("Operator tidak dikenali");
        }   
    if (operator =='+' || operator =='-' || operator == '/'){
        System.out.print("Hasil: " + hasil);
    }
    scan.close();
    }
}

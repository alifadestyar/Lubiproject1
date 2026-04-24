/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lubiproject1.pertemuan9;

/**
 *
 * @author ASUS
 */
public class RunKalkulator {
    public static void main(String[] args){
        KalkulatorOOP calc = new KalkulatorOOP();
        
        int hasil = calc.tambah(10, 5);
        System.out.println("Hasil tambah: " + hasil);
        System.out.println("Hasil kurang: " + calc.kurang(10, 5));
    }
}

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
public class Lubiproject2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama;
        String nim;
        double tinggibadan;
        double beratbadan;
        String jurusan;

        System.out.print("Masukkan Nama Anda: ");
        nama = input.nextLine();

        System.out.print("Masukkan NIM Anda: ");
        nim = input.nextLine();

        System.out.print("Masukkan Tinggi Badan: ");
        tinggibadan = input.nextDouble();

        System.out.print("Masukkan Berat Badan Anda: ");
        beratbadan = input.nextDouble();

        System.out.print("Masukkan Jurusan Anda : ");
        jurusan = input.nextLine();

        System.out.println("--------------------------------");
        System.out.println("       Biodaata Mahasiswa       ");
        System.out.println("--------------------------------");
        System.out.println("Nama         : " + nama);
        System.out.println("Nim          : " + nim);
        System.out.println("Tinggi Badan : " + tinggibadan);
        System.out.println("Berat Badan  : " + beratbadan);
        System.out.println("Jurusan      : " + jurusan);
        System.out.println("--------------------------------");
    }    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lubiproject1.pertemuan10;

/**
 *
 * @author User
 */
public class RekeningBank {
    private String nomorRekening;
    private double saldo;
    
    public RekeningBank(String noRek, double saldoAwal){
        this.nomorRekening = noRek;
        if (saldoAwal >= 0){
            this.saldo = saldoAwal;
        }else{
            this.saldo = 0;
            System.out.println("Saldo awal tidak valid, di set 0.");
        }
    }
    //Getter saldo
    public double getSaldo(){
        return saldo;
    }
    //method menyetor
    public void setor(double jumlah){
        if (jumlah > 0){
            saldo = saldo + jumlah;
            System.out.println("Setor Rp" + jumlah + " berhasil. Saldo saat ini: " + saldo);
        }else {
            System.out.println("Jumlah setor harus positif!");
        }
    }
    //method menarik uang
    public void tarik(double jumlah){
        if (jumlah > 0 && jumlah <= saldo){
            saldo = saldo - jumlah;
            System.out.println("Tarik Rp" + jumlah + " berhasil. Sisa saldo: " + saldo); 
        }else{
            System.out.println("Penarikan gagal! Saldo tidak cukup untuk jumlah investasi");
        }
    }
}
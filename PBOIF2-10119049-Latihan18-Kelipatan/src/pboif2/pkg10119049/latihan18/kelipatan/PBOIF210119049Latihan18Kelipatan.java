/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119049.latihan18.kelipatan;

/**
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Program untuk melipatkan angka
 */
public class PBOIF210119049Latihan18Kelipatan {

    public static void tampilKelipatan(double angkaAwal,int banyakAngka){
        int n = 1;
        
        for(int i = 0; i < n;i++){
            System.out.println(angkaAwal*n);
            if(n != banyakAngka){
                n++;
            }
        }
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        //init var
        double angkaAwal = 3.5;
        int banyakAngka = 10;
        
        // panggil prosedur
        tampilKelipatan(angkaAwal, banyakAngka);       
    }
    
}

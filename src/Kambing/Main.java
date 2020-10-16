/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kambing;

/**
 *
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan variabel lokal
 */
public class Main {
    public void tambahKambing(){
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("jumlah kambing setelah ditambahkan:" + jumlahKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main kambingJantan = new Main();
        kambingJantan.tambahKambing();
    }
    
}

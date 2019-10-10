/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan21;

import java.util.Scanner;

/**
 *
 * @author acer
 * NAMA      : Azis komara
 * KELAS     : IF-1
 * NIM       : 10118029
 * Deskripsi Program   : Program ini berisi program rata-rata nilai
 */
public class Latihan21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //inputan
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Bayaknya Nilai mahasiswa : ");
        int banyakMhs = input.nextInt();
        
        //logika
        
        double ratarata = 0;
        int[] nilaiMhs = new int[4];
        for(int i = 0; i < banyakMhs; i++){
            System.out.print("Nilai mahasiswa ke-  " +( i + 1)+":");
            nilaiMhs[i] = input.nextInt();
            ratarata= ratarata + nilaiMhs[i];
        }
        ratarata = ratarata / banyakMhs;
        System.out.println("Maka rata-rata nilainya adalah"+ratarata);
        System.out.println("developed by Azis komara");
    }
    
}

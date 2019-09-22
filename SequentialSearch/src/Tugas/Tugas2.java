/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author CMOO76AU
 */
public class Tugas2 {
    public static void main(String[] args) {
        double RataRata = 0;
        int nilai[] = {83, 76, 45, 90, 85, 80, 78, 74};
        for (int i = 0; i <nilai.length; i++) {
            RataRata = RataRata + nilai[i];
        }
        RataRata = RataRata / nilai.length;
        System.out.println("Rata-ratanya adalah : " + RataRata);
        System.out.print("Nilai yang diatas Rata-rata adalah: ");
        for (int x = 0; x < nilai.length; x++) {
            if (nilai[x] > RataRata) 
            { System.out.print(" " + nilai[x]);
            }
            
        }
        System.out.println(" ");
    }
}

        
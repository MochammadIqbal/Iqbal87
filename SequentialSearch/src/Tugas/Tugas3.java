/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author CMOO76AU
 * 
 */
public class Tugas3 {
     public static void main(String[] args) {
        int[] nilai = {92, 98, 76, 72, 84, 101, 39};
        int akhir;
        System.out.print("nilai pada array : ");
        for (int x = 0; x < nilai.length; x++) {
            System.out.print(nilai[x]);
        }
     {System.out.println(" ");
        System.out.print("Nilai yang merupakan kelipatan tiga : ");
        for (int i = 0; i < nilai.length; i++) {
            akhir = nilai[i] % 3;
            if (akhir == 0) {
                System.out.print("   " + nilai[i]);
            }
        }
        System.out.println(" ");
    }
}}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author CMOO76AU
 */
public class Tugas1 {
     public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int cari=0;
        int ulang = 0;
        int []nomer ={74,98,72,74,72,90,81,72};
        System.out.print("Masukkan data yang dicari : ");
        int x = input.nextInt();
        for (int i = 0;i< nomer.length;i++) {
            if (ulang == nomer.length) {
              
            }if (x==nomer[i]) {
               ++cari;
            } else if (x != i) {
               ++ulang;
             
            }

        }if (cari != nomer[x]) {
            System.out.println("Data tidak ditemukan !");
        } else {
            System.out.println("Data ditemukan sebanyak"+cari);
        }
    }
}

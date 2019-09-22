/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author CMOO76AU
 */
public class Praktikum1 {
    public static void main(String[] args) {
        String cari;
        boolean found = false;
        String[] nama = new String[]{"Nopal","Lucky","Iqbal","RaditThomas","RheygoBercanda"};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan data yang dicari");
        cari = input.nextLine();
        for (int i = 0; i < nama.length; i++) {
            if(cari.equalsIgnoreCase(nama[i])){
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("Data ditemukan !");
        }else{
            System.out.println("Data tidak ditemukan");
        }
    }
}

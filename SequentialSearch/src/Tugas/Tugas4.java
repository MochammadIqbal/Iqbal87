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
public class Tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan kata/kalimat : ");
        String kata = input.nextLine();
        int a=0; int i=0; int u=0; int e=0; int o=0;
        for (int x=0;x<kata.length();x++){
            switch (kata.charAt(x)) {
                case 'a':
                    a++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'u':
                    u++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'o':
                    o++;
                    break;    
            }}
       System.out.println("huruf a : "+a);
       System.out.println("huruf i : "+i);
       System.out.println("huruf u : "+u);
       System.out.println("huruf e : "+e);
       System.out.println("huruf o : "+o);
       int jumlah = a+i+u+e+o;
       System.out.println("keseluruhan huruf vokal pada kalimat ini ada : "+jumlah);
    }

}

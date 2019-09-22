/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author CMOO76AU
 */
public class Praktikum3 {

    public static void main(String[] args) {
        int poll = 123;
        int[] data = new int[]{-87, 123, 24, 10, 04, 66};
        System.out.println("Data Pada Array:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
            if (data[i] > poll) {
                poll = data[i];
            }

        }
        System.out.println("\n Data Terbesar Adalah :" + poll);
    }
}

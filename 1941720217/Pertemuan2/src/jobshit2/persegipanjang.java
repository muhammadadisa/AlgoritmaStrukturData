/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobshit2;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class persegipanjang {
    public int panjang;
    public int lebar;
    public static void main(String[] args) {
        persegipanjang[]ppArray=new persegipanjang[3];
        //ppArray[0]=new persegipanjang();
        //ppArray[0].panjang =110;
        //ppArray[0].lebar=30;
        //ppArray[0]=new persegipanjang();
        //ppArray[1].panjang =80;
        //ppArray[1].lebar=40;
        //ppArray[2]=new persegipanjang();
        //ppArray[2].panjang =100;
        //ppArray[2].lebar=20;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            ppArray[0]=new persegipanjang();
            System.out.println("persegi panjang ke-" +i);
            System.out.println("masukan panjang: ");
            ppArray[0].panjang=sc.nextInt();
            System.out.println("masukan lebar: ");
            ppArray[0].lebar=sc.nextInt();
    }
    }
}

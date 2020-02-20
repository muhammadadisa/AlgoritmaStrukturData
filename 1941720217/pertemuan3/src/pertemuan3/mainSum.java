/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class mainSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("program menghitung keuntungan total(satuan juta,misal 5,9)");
        System.out.println("masukan jumlah bulan : ");
        int elm=sc.nextInt();
        sum sm=new sum(elm);
        System.out.println("===========================================");
        for(int i=0;i<sm.elemen;i++){
            System.out.println("masukan untung bulan ke-"+(i+1)+" = ");
            sm.keuntungan[i]=sc.nextDouble();
        }
            System.out.println("===========================================");
            System.out.println("algoritma brute force");
            System.out.println("total keuntungan perusahan selama "+sm.elemen+" bulan adalah = "+sm.totalBF(sm.keuntungan));
            System.out.println("===========================================");
            System.out.println("algoritma divide conquer");
            System.out.println("total keuntungan perusahaan selama "+sm.elemen+" bulan adalah = "+sm.totalDC(sm.keuntungan,0,sm.elemen-1));
            
        }
        
    }
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class minMax {
    public int nilaiArray;
    public static void main(String[] args) {
        minMax[]ppArray=new minMax[5];
        ppArray[0]=new minMax();
        
        Scanner disa = new Scanner(System.in);
        
        for(int i=0; i <5;i++){
            ppArray[i] = new minMax();
            System.out.println("Nilai array indeks ke-"+i);
            System.out.println("masukan nilai: ");
            ppArray[i].nilaiArray=disa.nextInt();       
        }
        int arr[] = new int [5];
        for(int i=1;i<5;i++){
            arr[i]=ppArray[i].nilaiArray;
        }
        
    }
    
}

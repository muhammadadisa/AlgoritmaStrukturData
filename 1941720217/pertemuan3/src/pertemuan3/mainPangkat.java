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
public class mainPangkat {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);  
        System.out.println("==========================================");
        System.out.println("masukan jumlah elemen yang ingin dihitung: ");
        int elemen=sc.nextInt();
        pangkat[]png=new pangkat[elemen];
        for (int i=0;i<elemen;i++){
            png[i]=new pangkat();
            System.out.println("masukan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
            png[i].nilai =sc.nextInt();
            System.out.println("masukan nilai perangkat ke-"+(i+1)+" : ");
            png[i].pangkat=sc.nextInt();
        }
        System.out.println("==========================================");
        System.out.println("hasil pangkat dengan brute force");
        for(int i=0;i<elemen;i++){
            System.out.println("nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
        }
        System.out.println("==========================================");
        System.out.println("hasil pangkat dengan divide dan conquer");
        for(int i=0;i<elemen;i++){
            System.out.println("nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
        }
    }   
}

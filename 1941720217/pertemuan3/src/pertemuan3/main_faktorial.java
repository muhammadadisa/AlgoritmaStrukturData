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
public class main_faktorial {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("====================================================");
    System.out.println("masukan jumlah elemen yang ingin dihitung : ");
    int elemen =sc.nextInt();
    faktorial []fk=new faktorial[elemen];
    for(int i =0;i<elemen;i++){
        fk[i]=new faktorial();
        System.out.println("masukan nilai data ke-"+(i+1)+" : ");
        fk[i].nilai=sc.nextInt();
    }
    System.out.println("====================================================");
    System.out.println("hasil faktorial dengan brute force");
    for(int i=0;i<elemen;i++){
        System.out.println("faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));
    }
    System.out.println("====================================================");
    System.out.println("hasil faktorial dengan divide dan conquer");
    for(int i=0;i<elemen;i++){
        System.out.println("faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
    }
    System.out.println("====================================================");
}
}    

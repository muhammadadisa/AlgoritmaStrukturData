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
public class arraybalok {
     public static void main(String[] args) {
        balok[]biArray=new balok[3];
        biArray[0]=new balok(100,30,12);
        biArray[1]=new balok(120,40,15);
        biArray[2]=new balok(210,50,25);
        for(int i=0;i<3;i++){
            System.out.println("volume balok ke "+i+": "+biArray[i].hitungvolume());
        }
    }
    
}

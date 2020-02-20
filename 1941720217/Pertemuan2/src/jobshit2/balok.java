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
public class balok {
    public int panjang;
    public int lebar;
    public int tinggi;
    public balok(int p,int i,int t){
    
    panjang = p;
    lebar =i;
    tinggi=t;
    
}
    public int hitungvolume(){
        return panjang*lebar*tinggi;
    }
    
}

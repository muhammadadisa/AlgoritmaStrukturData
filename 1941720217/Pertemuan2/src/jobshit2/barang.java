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
public class barang {
    String nama_barang,jenis_barang;
        int stok,harga_satuan;
        barang(){
        }
        barang (String nm,String jn,int st,int hs){
            nama_barang=nm;
            jenis_barang=jn;
            stok=st;
            harga_satuan=hs;
        }
        void tampil_barang(){
            System.out.println("nama = "+nama_barang);
            System.out.println("jenis = "+jenis_barang);
            System.out.println("stok = "+stok);
            System.out.println("harga satuan = "+harga_satuan);
        }
        void tambah_stok(int n){
            stok =stok+n;
        }
         void kurang_stok(int n){
             if(stok>0){
            stok =stok-n;
             }
        }
         int hitung_harga_total(int jumlah){
             return jumlah*harga_satuan;
        
    }
    
}


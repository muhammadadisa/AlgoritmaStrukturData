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
public class barangmain {
    public static void main(String[] args) {
        barang b1=new barang();
        b1.nama_barang="corsair 2 GB";
        b1.jenis_barang="DDR";
        b1.harga_satuan=250000;
        b1.stok=10;
        b1.tambah_stok(1);
        b1.kurang_stok(3);
        b1.tampil_barang();
        int harga_total=b1.hitung_harga_total(4);
        System.out.println("harga 4 buah = "+harga_total);
        
        barang b2=new barang("logitech","wireless mouse",150000,25);
        b2.tampil_barang();
    }
        
    }
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;


/**
 *
 * @author santuy
 */
public class benda extends Challenge{
    private int jumlahbarang;
    public benda(int harga, int diskon, int total,int jumlahbarang) {
        super(harga, diskon, total);
        this.jumlahbarang = jumlahbarang;
    }
    public void info(){
        System.out.println("\njumlah barang yang di beli : "+jumlahbarang);
        super.info();
    }
}

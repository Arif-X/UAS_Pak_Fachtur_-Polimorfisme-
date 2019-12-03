/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ava_polymorfism;

/**
 *
 * @author Lenovo
 */
public class print extends bentuk_pembayaran {

    private String classMain;
    
    private void tampil(bentuk_pembayaran[] obj) {
        for (int i = 0; i < obj.length; i++) {
            obj[i].cetakTransaksi();
            obj[i].setNamaClass();
            System.out.println("******************************************");
        }
    }

    public static void main(String[] args) {
        bentuk_pembayaran[] obj = {new tunai(), new atm(), new elektronik()};
        print cetak = new print();

        cetak.cetakTransaksi();
        System.out.println("******************************************");
        cetak.tampil(obj);
    }

    @Override
    protected String setNamaClass() {
        return classMain;
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ava_polymorfism;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class atm extends bentuk_pembayaran {
    
    
    protected String noTransaksi;
    protected String jumlahDibayar;
    protected String noRekPerusahaan;

    protected String JOptionNo_Transaksi = JOptionPane.showInputDialog("Nomor Transaksi (ATM)");
    protected int no_transaksi = Integer.parseInt(JOptionNo_Transaksi);

    protected String getNoTransaksi() {
        noTransaksi = "No Transaksi\t\t : " + no_transaksi;
        return noTransaksi;
    }
    
    protected String JOptionNo_Rek_Perusahaan = JOptionPane.showInputDialog("No Rekening Perusahaan (ATM)");
    protected int no_rek_perusahaan = Integer.parseInt(JOptionNo_Rek_Perusahaan);

    protected String getNoRekPerusahaan() {
        noRekPerusahaan = "No Rekening Perusahaan\t : " + no_rek_perusahaan;
        return noRekPerusahaan;
    }
    
    protected String JOptionJumlah_Dibayar = JOptionPane.showInputDialog("Jumlah Dibayar (ATM)");
    protected int jumlah_dibayar = Integer.parseInt(JOptionJumlah_Dibayar);

    protected String getJumlahDibayar() {
        jumlahDibayar = "Jumlah Dibayar\t\t : " + jumlah_dibayar;
        return jumlahDibayar;
    }
    
    protected void cetakTransaksi() {
        System.out.println(setNamaClass());
        System.out.println(getNoTransaksi());
        System.out.println(getNoRekPerusahaan());
        System.out.println(getJumlahDibayar());
    }
    
    protected String namaClass = "Class ATM";
    
    @Override
    protected String setNamaClass() {
        return namaClass;
    }
}

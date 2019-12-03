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
public abstract class bentuk_pembayaran {
    
    protected abstract String setNamaClass();
    
    protected int no_transaksi;
    protected int jumlah_dibayar;
    protected int no_rek_perusahaan;
    protected String id_customer;
    protected int saldo_customer;
    
    protected String str_no_transaksi = String.valueOf(no_transaksi);
    protected String str_jumlah_dibayar = String.valueOf(jumlah_dibayar);
    protected String str_no_rek_perusahaan = String.valueOf(no_rek_perusahaan);
    protected String str_saldo_customer = String.valueOf(saldo_customer);

    protected void setNoTransaksi(int no_transaksi) {
        this.no_transaksi = no_transaksi;
    }

    protected String getNoTransaksi() {
        return str_no_transaksi;
    }

    protected String getJumlahDibayar() {
        return str_jumlah_dibayar;
    }

    protected String getNoRekPerusahaan() {
        return str_no_rek_perusahaan;
    }

    protected String getIDCustomer() {
        return id_customer;
    }

    protected String getSaldoCustomer() {
        return str_saldo_customer;
    }

    protected void cetakTransaksi() {
        System.out.println("Class Bentuk Pembayaran");
    }
}

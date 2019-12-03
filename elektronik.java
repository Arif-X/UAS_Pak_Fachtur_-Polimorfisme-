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
public class elektronik extends bentuk_pembayaran {

    protected String str_no_transaksi;
    protected String str_jumlah_dibayar;
    protected String id_customer;
    protected String str_saldo_customer;
    protected double diskon = 0.5;

    protected String JOptionNo_Transaksi = JOptionPane.showInputDialog("Nomor Transaksi (Uang Elektronik)");
    protected int no_transaksi = Integer.parseInt(JOptionNo_Transaksi);

    protected String getNoTransaksi() {
        str_no_transaksi = "No Transaksi\t\t : " + no_transaksi;
        return str_no_transaksi;
    }

    protected String JOptionId_Customer = JOptionPane.showInputDialog("ID Customer (Uang Elektronik)");
    protected String idCustomer = JOptionId_Customer;

    protected String getIDCustomer() {
        id_customer = "ID Customer\t\t : " + idCustomer;
        return id_customer;
    }

    protected String JOptionSaldo_Customer = JOptionPane.showInputDialog("Saldo Customer (Uang Elektronik)");
    protected int saldo_customer = Integer.parseInt(JOptionSaldo_Customer);

    protected String getSaldoCustomer() {
        str_saldo_customer = "Saldo Customer\t\t : " + saldo_customer;
        return str_saldo_customer;
    }

    protected String JOptionJumlah_Dibayar = JOptionPane.showInputDialog("Jumlah Dibayar (Uang Elektronik)");
    protected int jumlah_dibayar = Integer.parseInt(JOptionJumlah_Dibayar);
    protected double jumlahBayar = jumlah_dibayar * 0.5;

    protected String getJumlahDibayar() {
        str_jumlah_dibayar = "Jumlah Dibayar\t\t : " + jumlahBayar;
        return str_jumlah_dibayar;
    }

    protected void validasi() {
        if (saldo_customer < (jumlah_dibayar * diskon)) {
            JOptionPane.showMessageDialog(null, "Transaksi Gagal Dikarenakan Saldo Tidak Cukup");
            System.out.println("Transaksi Elektronik Gagal");
        } else {
            JOptionPane.showMessageDialog(null, "Transaksi Sukses");
            System.out.println("Transaksi Elektronik Sukses");
        }
    }

    protected void cetakTransaksi() {
        System.out.println(setNamaClass());
        System.out.println(getNoTransaksi());
        System.out.println(getIDCustomer());
        System.out.println(getSaldoCustomer());
        System.out.println(getJumlahDibayar());
        System.out.print("Status Transaksi\t : ");
        validasi();
    }

    protected String namaClass = "Class Elektronik";

    @Override
    protected String setNamaClass() {
        return namaClass;
    }

}

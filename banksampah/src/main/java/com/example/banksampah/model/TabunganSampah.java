package com.example.banksampah.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.Date;

@Entity
@Table(name="tabungansampah")
public class TabunganSampah {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;

  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long nomor_rekening;

  @Column(name= "JumlahSampah")
  private Integer jumlah_sampah;

  @Column(name= "SaldoDebit")
  private Integer saldo_debit;

  @Column(name= "SaldoKredit")
  private Integer saldo_kredit;

  @Column(name= "TanggalTransaksi")
  private Date tanggal_transaksi;

 
  public Long getNomor_rekening() {
    return nomor_rekening;
  }

  public void setNomor_rekening(Long nomor_rekening) {
    this.nomor_rekening = nomor_rekening;
  }

  public Integer getJumlah_sampah() {
    return jumlah_sampah;
  }

  public void setJumlah_sampah(Integer jumlah_sampah) {
    this.jumlah_sampah = jumlah_sampah;
  }

  public Integer getSaldo_debit() {
    return saldo_debit;
  }

  public void setSaldo_debit(Integer saldo_debit) {
    this.saldo_debit = saldo_debit;
  }

  public Integer getSaldo_kredit() {
    return saldo_kredit;
  }

  public void setSaldo_kredit(Integer saldo_kredit) {
    this.saldo_kredit = saldo_kredit;
  }

  public Date getTanggal_transaksi() {
    return tanggal_transaksi;
  }

  public void setTanggal_transaksi(Date tanggal_transaksi) {
    this.tanggal_transaksi = tanggal_transaksi;
  }
}
package com.example.banksampah.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

import java.util.Date;

@Entity
@Table(name="tabungansampah")
public class TabunganSampah {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "id_nasabah", referencedColumnName= "id_nasabah",insertable = false, updatable = false)
  private Nasabah nasabah;
  private Long id_nasabah;

  @Column(name= "JenisSampah")
  private String jenis_sampah;

  @Column(name= "JumlahSampah")
  private Integer jumlah_sampah;

  @Column(name= "SaldoDebit")
  private Integer saldo_debit;

  @Column(name= "SaldoKredit")
  private Integer saldo_kredit;

  @Column(name= "TanggalTransaksi")
  private Date tanggal_transaksi;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
 
  public Nasabah getNasabah() {
    return nasabah;
  }

  public void setNasabah(Nasabah nasabah) {
    this.nasabah = nasabah;
  }

  public Long getId_nasabah() {
    return id_nasabah;
  }

  public void setId_nasabah(Long id_nasabah) {
    this.id_nasabah = id_nasabah;
  }

  public String getJenis_sampah() {
    return jenis_sampah;
  }

  public void setJenis_sampah(String jenis_sampah) {
    this.jenis_sampah = jenis_sampah;
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
package com.example.banksampah.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="nasabah")
public class Nasabah {
  @Id
  @GeneratedValue
  private Long id_nasabah;

  @Column(name= "NamaNasabah")
  private String nama_nasabah;

  @Column(name= "Alamat")
  private String alamat;

  @Column(name= "NomorTelpon")
  private Integer nomor_telpon;

  @Column(name= "Email")
  private String email;

  @Column(name= "NomorRekening")
  private Long nomor_rekening;

  public Long getIdNasabah() {
    return id_nasabah;
  }

  public void setId(Long id_nasabah) {
    this.id_nasabah = id_nasabah;
  }

  public String getNama_nasabah() {
    return nama_nasabah;
  }

  public void setNama_nasabah(String nama_nasabah) {
    this.nama_nasabah = nama_nasabah;
  }

  public String getAlamat() {
    return alamat;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public Integer getNomor_telpon() {
    return nomor_telpon;
  }

  public void setNomor_telpon(Integer nomor_telpon) {
    this.nomor_telpon = nomor_telpon;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Long getNomor_rekening() {
    return nomor_rekening;
  }

  public void setNomor_rekening(Long nomor_rekening) {
    this.nomor_rekening = nomor_rekening;
  }
}
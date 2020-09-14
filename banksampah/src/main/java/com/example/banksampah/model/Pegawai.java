package com.example.banksampah.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="pegawai")
public class Pegawai {
  @Id
  @GeneratedValue
  private Long id_pegawai;

  @Column(name= "NamaPegawai")
  private String nama_pegawai;


  public Long getIdPegawai() {
    return id_pegawai;
  }

  public void setIdPegawai(Long id_pegawai) {
    this.id_pegawai = id_pegawai;
  }

  public String getNama_pegawai() {
    return nama_pegawai;
  }

  public void setNama_pegawai(String nama_pegawai) {
    this.nama_pegawai = nama_pegawai;
  }
}
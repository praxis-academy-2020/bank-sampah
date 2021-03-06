package com.example.banksampah.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name="jenissampah")
public class JenisSampah{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;


    @Column(name= "Karton")
    private Integer karton;

    @Column(name= "BotolPlasik")
    private Integer botol_plastik;

    @Column(name= "BotolKaca")
    private Integer botol_kaca;

    @Column(name= "BarangBekas")
    private Integer barang_bekas;

    @Column(name= "PengaliKarton")
    private Integer pengali_karton;

    @Column(name= "PengaliBotolPlastik")
    private Integer pengali_botol_plastik;

    @Column(name= "PengaliBotolKaca")
    private Integer pengali_botol_kaca;

    @Column(name= "PengaliBarangBekas")
    private Integer pengali_barang_bekas;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getKarton(){
        return karton;
    }

    public void setKarton(Integer karton){
        this.karton = karton;
    }

    public Integer getBotol_plastik(){
        return botol_plastik;
    }

    public void setBotol_plastik(Integer botol_plastik){
        this.botol_plastik = botol_plastik;
    }

    public Integer getBotol_kaca(){
        return botol_kaca;
    }

    public void setBotol_kaca(Integer botol_kaca){
        this.botol_kaca = botol_kaca;
    }

    public Integer getBarang_bekas(){
        return barang_bekas;
    }

    public void setBarang_bekas(Integer barang_bekas){
        this.barang_bekas = barang_bekas;
    }

}
package com.example.banksampah.controller;

import java.util.Optional;
import java.util.List;
import com.example.banksampah.model.TabunganSampah;
import com.example.banksampah.repository.TabunganSampahRepository;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/tabungansampah")
public class TabunganSampahController {
    private TabunganSampahRepository tabungansampahRepository;

    @Autowired 
    public TabunganSampahController(TabunganSampahRepository tabungansampahRepository){
        this.tabungansampahRepository = tabungansampahRepository;
    }
    @GetMapping("/all")
    Iterable<TabunganSampah> all() {
      return tabungansampahRepository.findAll();
    }

    @GetMapping("/{id}")
    TabunganSampah getByNomor_rekening(@PathVariable ("id") Long nomor_rekening) {
      return tabungansampahRepository.findByNomorRekening(nomor_rekening).get();
    }

    @PostMapping("/save") 
    TabunganSampah save(@RequestBody TabunganSampah tabungansampah){
        return tabungansampahRepository.save(tabungansampah);
    }
    @PutMapping("/{id}")
    TabunganSampah update(@RequestBody TabunganSampah newTabunganSampah, @PathVariable ("id") Long nomor_rekening) {
      TabunganSampah tabungansampah = tabungansampahRepository.findByNomorRekening(nomor_rekening).get();
        tabungansampah.setNomor_rekening(newTabunganSampah.getNomor_rekening());
        tabungansampah.setJumlah_sampah(newTabunganSampah.getJumlah_sampah());
        tabungansampah.setSaldo_debit(newTabunganSampah.getSaldo_debit());
        tabungansampah.setSaldo_kredit(newTabunganSampah.getSaldo_kredit());
        tabungansampah.setTanggal_transaksi(newTabunganSampah.getTanggal_transaksi());
        return tabungansampahRepository.save(tabungansampah);
      }

      @DeleteMapping("/{id}")
      public void deleteTabunganSampah(@PathVariable ("id") Long nomor_rekening){
      TabunganSampah tabungansampah = tabungansampahRepository.findByNomorRekening(nomor_rekening).get();
        tabungansampahRepository.delete(tabungansampah);
      }
  }
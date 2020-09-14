package com.example.banksampah.controller;

import com.example.banksampah.model.Pegawai;
import com.example.banksampah.repository.PegawaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@RequestMapping("/pegawai")
public class PegawaiController {
    private PegawaiRepository pegawaiRepository;

    @Autowired 
    public PegawaiController(PegawaiRepository pegawaiRepository){
        this.pegawaiRepository = pegawaiRepository;
    }
    @GetMapping("/all")
    Iterable<Pegawai> all() {
      return pegawaiRepository.findAll();
    }

    @GetMapping("/{id}")
    Pegawai userById(@PathVariable Long id_pegawai) {
      return pegawaiRepository.findById(id_pegawai).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save") 
    Pegawai save(@RequestBody Pegawai pegawai){
        return pegawaiRepository.save(pegawai);
    }

    @PutMapping("/{id}")
    Pegawai updatepegawai(@RequestBody Pegawai newUser, @PathVariable Long id_pegawai) {
      return pegawaiRepository.findById(id_pegawai)
        .map(pegawai ->{
        pegawai.setNama_pegawai(newUser.getNama_pegawai());
        return pegawaiRepository.save(pegawai);

      })
      .orElseGet(() -> {
         newUser.setIdPegawai(id_pegawai);
        return pegawaiRepository.save(newUser);
      });
      }

      @DeleteMapping("/{id}")
      public void deletePegawai(@PathVariable Long id){
        pegawaiRepository.deleteById(id);
      }
    }
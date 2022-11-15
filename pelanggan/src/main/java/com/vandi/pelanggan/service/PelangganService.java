/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vandi.pelanggan.service;

import com.vandi.pelanggan.entity.Pelanggan;
import com.vandi.pelanggan.repository.PelangganRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Vandi
 */
public class PelangganService {
     @Autowired
    private PelangganRepository pelangganRepository;
    private Long pelangganKodeBarang;
    
    public Pelanggan savePelanggan(Pelanggan pelanggan){
        return pelangganRepository.save(pelanggan);
    }
    
    public Pelanggan findPelangganByKodeBarang(Long PelangganKodeBarang){
        return pelangganRepository.findByPelangganKodeBarang(pelangganKodeBarang);
    }

}

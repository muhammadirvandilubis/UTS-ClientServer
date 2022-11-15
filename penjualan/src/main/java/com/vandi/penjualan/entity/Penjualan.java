/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vandi.penjualan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Vandi
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Penjualan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long penjualanKodeBarang;
    private Long pelangganKodeBarang;
    private String namaBarang;
    private Double harga;
    private Double jumlah;
    private Double total;
    private Double diskon;
    private Double totalBayar;
    private Double tDiskon;
    private Double ttotalBayar;
    
    
    public Double getTotal(){
        total = harga * jumlah;
        return total;
    }
    
    public Double getTDiskon(){
        tDiskon = diskon * total;
        return tDiskon;
    }
    
//    public Double getTppn(){
//        tppn = ppnPersen * (total - tDiskon);
//        return tppn;
//    }
//    
//    public Double getTotalBayar(){
//        totalBayar = total - tDiskon + tppn;
//        return totalBayar;
//    }
}

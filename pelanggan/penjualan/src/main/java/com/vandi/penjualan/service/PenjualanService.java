/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vandi.penjualan.service;

import com.vandi.penjualan.VO.Pelanggan;
import com.vandi.penjualan.VO.ResponseTemplateVO;
import com.vandi.penjualan.entity.Penjualan;
import com.vandi.penjualan.repository.PenjualanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Vandi
 */
@Service
public class PenjualanService {

    @Autowired
    private PenjualanRepository penjualanRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Penjualan savePenjualan(Penjualan penjualan) {
        return penjualanRepository.save(penjualan);
    }

    public ResponseTemplateVO getPenjualan(Long penjualanId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Long penjualanKodeBarang = null;
        Penjualan penjualan = penjualanRepository.findByPenjualanKodeBarang(penjualanKodeBarang);
//        Pelanggan pelanggan = restTemplate.getForObject("http://localhost:8888/pelangggan/" 
//              + penjualan.getPelangganId(), Pelanggan.class);
//        vo.setPelanggan(pelanggan);
        Pelanggan pelanggan = restTemplate.getForObject("http://localhost:8888/pelanggan/"
                + penjualan.getPelangganKodeBarang(), Pelanggan.class);
        vo.setPenjualan(penjualan);
        vo.setPelanggan(pelanggan);
        return vo;
    }
}
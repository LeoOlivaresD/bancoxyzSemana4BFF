package com.duoc.bancoxyz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.bancoxyz.dtos.DtoCuentaAnual;
import com.duoc.bancoxyz.repository.CuentaAnualRepository;

@Service
public class CuentaAnualService {
    @Autowired
    private CuentaAnualRepository cuentaAnualRepository;

    public CuentaAnualService(CuentaAnualRepository cuentaAnualRepository) {
        this.cuentaAnualRepository = cuentaAnualRepository;
    }

    public List<DtoCuentaAnual> findAllAnnualAccounts() {
        return cuentaAnualRepository.findAll().stream()
                .map(cuentaAnual -> new DtoCuentaAnual(
                        cuentaAnual.getId(),
                        cuentaAnual.getIdCuenta(),
                        cuentaAnual.getFecha(),
                        cuentaAnual.getTipoTransaccion(),
                        cuentaAnual.getMonto(),
                        cuentaAnual.getDescTransaccion()))
                .toList();
    }
}
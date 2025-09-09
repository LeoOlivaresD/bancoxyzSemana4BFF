package com.duoc.bancoxyz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.bancoxyz.dtos.DtoCuentaAnual;
import com.duoc.bancoxyz.services.CuentaAnualService;

@RestController
@RequestMapping("banco/api")
public class CuentaAnualRestController {
    @Autowired
    private CuentaAnualService cuentaAnualService;

    public CuentaAnualRestController(CuentaAnualService cuentaAnualService) {
        this.cuentaAnualService = cuentaAnualService;
    }

    @GetMapping("/cuentas-anuales")
    public ResponseEntity<List<DtoCuentaAnual>> getAllAnnualAccounts() {
        return ResponseEntity.ok(cuentaAnualService.findAllAnnualAccounts());
    }
}

package com.duoc.bancoxyz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.bancoxyz.dtos.DtoTransaccion;
import com.duoc.bancoxyz.repository.TransaccionRepository;

@Service
public class TransaccionService {

    @Autowired
    private TransaccionRepository transaccionRepository;

    public TransaccionService(TransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository;
    }

    public List<DtoTransaccion> findAllTransactions() {
        return transaccionRepository.findAll().stream()
                .map(transaccion -> new DtoTransaccion(
                        transaccion.getId(),
                        transaccion.getFechaTransaccion(),
                        transaccion.getMonto(),
                        transaccion.getTipo()))
                .toList();
    }
}

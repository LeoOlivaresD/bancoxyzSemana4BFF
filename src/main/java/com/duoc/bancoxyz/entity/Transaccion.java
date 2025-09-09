package com.duoc.bancoxyz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transacciones")
public class Transaccion {
    @Id
    private Long id;
    @Column(name = "fecha_transaccion")
    private String fechaTransaccion;
    private Integer monto;
    private String tipo;
}

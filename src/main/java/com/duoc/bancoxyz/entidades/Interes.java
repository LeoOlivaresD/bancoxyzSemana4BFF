package com.duoc.bancoxyz.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "intereses")
public class Interes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "id_cuenta")
    private String idCuenta;
    @Column(name = "nombre_cliente")
    private String nombreCliente;
    private Integer saldo;
    @Column(name = "edad_cliente")
    private Integer edadCliente;
    @Column(name = "tipo_interes")
    private String tipoInteres;
}

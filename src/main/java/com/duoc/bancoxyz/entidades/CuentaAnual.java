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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cuentas_anuales")
public class CuentaAnual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_cuenta")
    private String idCuenta;

    @Column(name = "fecha_transaccion")
    private String fecha;

    @Column(name = "tipo_transanccion")
    private String tipoTransaccion;

    private Integer monto;

    @Column(name = "descripcion_transaccion")
    private String descTransaccion;

}

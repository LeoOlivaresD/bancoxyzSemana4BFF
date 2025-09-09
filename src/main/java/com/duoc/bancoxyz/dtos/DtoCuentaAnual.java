package com.duoc.bancoxyz.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class DtoCuentaAnual {
    private Long id;
    private String idCuenta;
    private String fecha;
    private String tipoTransaccion;
    private Integer monto;
    private String descTransaccion;
}

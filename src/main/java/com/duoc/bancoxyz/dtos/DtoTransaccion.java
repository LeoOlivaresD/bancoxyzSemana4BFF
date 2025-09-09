package com.duoc.bancoxyz.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class DtoTransaccion {
    private Long id;
    private String fechaTransaccion;
    private Integer monto;
    private String tipo;
}

package com.Branchbit.serverApp.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadoDTO {
    
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String curp;
    private Long telefono;


}

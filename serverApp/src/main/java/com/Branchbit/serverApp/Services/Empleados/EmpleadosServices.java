package com.Branchbit.serverApp.Services.Empleados;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Branchbit.serverApp.DTO.EmpleadoDTO;
import com.Branchbit.serverApp.Entities.Empleado;

@Service
public interface EmpleadosServices {


    public List<Empleado> findbyFilterService (Object param);

    public Boolean updateEmpleado(EmpleadoDTO user);

}

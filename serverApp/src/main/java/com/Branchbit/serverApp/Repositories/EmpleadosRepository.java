package com.Branchbit.serverApp.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Branchbit.serverApp.Entities.Empleado;



public interface EmpleadosRepository extends  JpaRepository<Empleado, Integer> {


    List<Empleado> findByNombre(String nombre);
    List<Empleado> findByApellidoMaterno(String apellidoMaterno);
    List<Empleado> findByApellidoPaterno(String apellidoPaterno);
    List<Empleado> findByCurp(String curp);
    List<Empleado> findByTelefono(Long telefono);


  @Query("SELECT e FROM Empleado e WHERE " +
           "(:param IS NULL OR e.nombre = :param) OR " +
           "(:param IS NULL OR e.apellidoMaterno = :param) OR " +
           "(:param IS NULL OR e.apellidoPaterno = :param) OR " +
           "(:param IS NULL OR e.curp = :param)")
    List<Empleado> findByAnyString(@Param("param") String param);

}

package com.Branchbit.serverApp.Services.Empleados;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Branchbit.serverApp.DTO.EmpleadoDTO;
import com.Branchbit.serverApp.Entities.Empleado;
import com.Branchbit.serverApp.Repositories.EmpleadosRepository;

@Service
public class EmpleadosServicesImpl implements  EmpleadosServices {

    @Autowired
    EmpleadosRepository empleadosRepository;


    @Override
    public List<Empleado> findbyFilterService(Object param){

        boolean flag = false;
        
        try{
            Long numericalInput = Long.parseLong(param.toString());
            System.out.println("es dobule");
            flag = true;
            return  empleadosRepository.findByTelefono(numericalInput);
            
        }catch(Exception e){}

        if(!flag){
        try{
            String textInput = param.toString();
            System.out.println("es string");
            return  empleadosRepository.findByAnyString(textInput);
        }catch(Exception e){}


        }

        return  null;




        
        


    }


    @Override

    public Boolean updateEmpleado(EmpleadoDTO user) {
        
        try {
            List<Empleado> empleado = empleadosRepository.findByCurp(user.getCurp());

            if(empleado.size()>0){
                Empleado _empleado = empleado.get(0);

                _empleado.setNombre(user.getNombre());
                _empleado.setApellidoPaterno(user.getApellidoPaterno());
                _empleado.setApellidoMaterno(user.getApellidoMaterno());
                _empleado.setTelefono(user.getTelefono());
                _empleado.setCurp(user.getCurp());
                empleadosRepository.save(_empleado);
                return true;

            }
            return false;

        } catch (Exception e) {

        return null;
    }
    }
}

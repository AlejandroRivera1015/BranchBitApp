package com.Branchbit.serverApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Branchbit.serverApp.DTO.EmpleadoDTO;
import com.Branchbit.serverApp.DTO.RequestDTO;
import com.Branchbit.serverApp.Entities.Empleado;
import com.Branchbit.serverApp.Repositories.EmpleadosRepository;
import com.Branchbit.serverApp.Services.Empleados.EmpleadosServicesImpl;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/empleados")
public class EmpleadosController {


    @Autowired
    EmpleadosServicesImpl empleadosServices;

    @Autowired
    EmpleadosRepository empleadosRepository;

    @GetMapping("/findby")
    public ResponseEntity<?> findByFilter(@RequestParam Object param) {


        System.out.println(param);


        try {
            return  new ResponseEntity<>(empleadosServices.findbyFilterService(param), HttpStatus.OK);
            
        } catch (Exception e) {

        }

        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND );

    }


    @PostMapping("/findby2")
    public ResponseEntity<?> findByFilter2(@RequestBody RequestDTO param) {


        System.out.println(param);


        try {
            return  new ResponseEntity<>(empleadosServices.findbyFilterService(param.getParam()), HttpStatus.OK);
            
        } catch (Exception e) {

        }

        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND );

    }



    @PostMapping("/save")
    public ResponseEntity<?> saveEmpleado(@RequestBody EmpleadoDTO entity) {


        try {

            empleadosRepository.save(new Empleado( entity.getNombre(), entity.getApellidoPaterno(), entity.getApellidoMaterno(), entity.getCurp(), entity.getTelefono()));
            return  new ResponseEntity<>(true, HttpStatus.OK);
            
        } catch (Exception e) {

        }

        
        return new ResponseEntity<>(null,HttpStatus.NOT_IMPLEMENTED);
    }


    @PostMapping("/edit")
    public ResponseEntity<?> editEmpleado(@RequestBody EmpleadoDTO entity) {


        try {

            empleadosServices.updateEmpleado(entity);
            return  new ResponseEntity<>(true, HttpStatus.OK);
            
        } catch (Exception e) {

        }




        
        return new ResponseEntity<>(null,HttpStatus.NOT_IMPLEMENTED);
    }
    
    
    @GetMapping("/delete")
    public ResponseEntity<?> deleteEmpleado(@RequestParam String curp) {


        try {

            List<Empleado> empleado = empleadosRepository.findByCurp(curp);

            if(empleado.size()>0){
                Empleado _empleado = empleado.get(0);
                empleadosRepository.delete(_empleado);
                return  new ResponseEntity<>(true, HttpStatus.OK);
            }
            return new ResponseEntity<>(false, HttpStatus.OK);
            
        } catch (Exception e) {

        }

        
        return new ResponseEntity<>(null,HttpStatus.NOT_IMPLEMENTED);
    }
    


    

}

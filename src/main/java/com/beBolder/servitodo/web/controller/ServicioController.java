package com.beBolder.servitodo.web.controller;

import com.beBolder.servitodo.domain.dto.ServicioDto;
import com.beBolder.servitodo.domain.service.ServicioDtoService;
import com.beBolder.servitodo.persistencia.entity.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicio")
@CrossOrigin({"*"})
public class ServicioController {
    @Autowired
    private ServicioDtoService servicioDtoService;

    @GetMapping("/consultar")
    public ResponseEntity<List<ServicioDto>> getAll(){
        try {
            return new ResponseEntity<>(servicioDtoService.getAll(),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/nuevoServicio")
    public ResponseEntity<ServicioDto> nuevoServicio(@RequestBody Servicio servicio){
        try {
            return new ResponseEntity<>(servicioDtoService.nuevoServicio(servicio), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }
}

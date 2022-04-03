package com.beBolder.servitodo.web.controller;

import com.beBolder.servitodo.domain.dto.HacedorDto;
import com.beBolder.servitodo.domain.dto.HacedorHabilidadDto;
import com.beBolder.servitodo.domain.service.HacedorHabilidadDtoService;
import com.beBolder.servitodo.persistencia.entity.Hacedor;
import com.beBolder.servitodo.persistencia.entity.HacedorHabilidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hacedorHabilidad")
@CrossOrigin({"*"})
public class HacedorHabilidadController {

    @Autowired
    private HacedorHabilidadDtoService habilidadDtoService;

    @GetMapping("/consultar")
    public ResponseEntity<List<HacedorHabilidadDto>> getAll(){
        try{
            return new ResponseEntity<>(habilidadDtoService.getAll(), HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/habilidades/{hacedorID}")
    public ResponseEntity<List<HacedorHabilidadDto>> getHabilidadesHacedor(@PathVariable("hacedorID") int hacedorID){
        try {
            return new ResponseEntity<>(habilidadDtoService.getHabilidadesHacedor(hacedorID), HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/registrar")
    public ResponseEntity<HacedorHabilidadDto> registrarHabilidadHacedor(@RequestBody HacedorHabilidad hacedorHabilidad){
        return new ResponseEntity<>(habilidadDtoService.registrarHabilidadHacedor(hacedorHabilidad), HttpStatus.CREATED);
    }
}

package com.beBolder.servitodo.web.controller;

import com.beBolder.servitodo.domain.dto.ClienteDto;
import com.beBolder.servitodo.domain.dto.HacedorDto;
import com.beBolder.servitodo.domain.service.HacedorDtoService;
import com.beBolder.servitodo.persistencia.entity.Hacedor;
import com.beBolder.servitodo.persistencia.entity.HacedorHabilidad;
import com.beBolder.servitodo.persistencia.mapper.HacedorDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/hacedor")
@CrossOrigin({"*"})
public class HacedorController {
    @Autowired
    private HacedorDtoService hacedorDtoService;

    @Autowired
    private HacedorDtoMapper mapper;

    @GetMapping("/consultar")
    public ResponseEntity<List<HacedorDto>> getAll(){
        try {
            return new ResponseEntity<>(hacedorDtoService.getAll(), HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/auth")
    public ResponseEntity<HacedorDto> authCliente(@RequestParam("email") String email){
        try{
            return new ResponseEntity<>(hacedorDtoService.authHacedor(email), HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/detalles/{hacedorID}")
    public ResponseEntity<HacedorDto> getDetallesHacedor(@PathVariable("hacedorID") int hacedorID){
        try {
            return new ResponseEntity<>(hacedorDtoService.getDetallesHacedor(hacedorID), HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/registrar")
    public ResponseEntity<HacedorDto> registrarHacedor(@RequestBody Hacedor hacedor){
        try {
            return new ResponseEntity<>(hacedorDtoService.registrarHacedor(hacedor), HttpStatus.CREATED);
        }catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @PutMapping("/registrarDetalles/{hacedorID}")
    public ResponseEntity<HacedorDto> registrarDetallesHacedor(@PathVariable("hacedorID") int hacedorID, @RequestBody Hacedor hacedor){
        try {
            return new ResponseEntity<>(hacedorDtoService.registrarDetallesHacedor(hacedorID, hacedor), HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

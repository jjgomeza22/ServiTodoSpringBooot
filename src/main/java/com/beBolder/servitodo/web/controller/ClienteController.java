package com.beBolder.servitodo.web.controller;

import com.beBolder.servitodo.domain.dto.ClienteDto;
import com.beBolder.servitodo.domain.service.ClienteDtoService;
import com.beBolder.servitodo.persistencia.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@CrossOrigin({"*"})
public class ClienteController {
    @Autowired
    private ClienteDtoService clienteDtoService;

    @GetMapping("/consultar")
    public ResponseEntity<List<ClienteDto>> getAll(){
        try {
            return new ResponseEntity<>(clienteDtoService.getAll(), HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/obtener/{clienteID}")
    public ResponseEntity<ClienteDto> getCliente(@PathVariable("clienteID") int clienteID){
        try{
            return new ResponseEntity<>(clienteDtoService.getCliente(clienteID), HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/auth")
    public ResponseEntity<ClienteDto> authCliente(@RequestParam("email") String email){
        try{
            return new ResponseEntity<>(clienteDtoService.authCliente(email), HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/registrar")
    public ResponseEntity<ClienteDto> registrarCliente(@RequestBody Cliente cliente){
        try {
            return new ResponseEntity<>(clienteDtoService.registrarCliente(cliente), HttpStatus.CREATED);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
        }
    }
}

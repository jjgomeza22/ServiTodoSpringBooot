package com.beBolder.servitodo.web.controller;

import com.beBolder.servitodo.domain.dto.HabilidadDto;
import com.beBolder.servitodo.domain.service.HabilidadDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/habilidad")
@CrossOrigin({"*"})
public class HabilidadController {
    @Autowired
    private HabilidadDtoService habilidadDtoService;

    @GetMapping("/consultar")
    public ResponseEntity<List<HabilidadDto>> getAll(){
        try{
            return new ResponseEntity<>(habilidadDtoService.getAll(), HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

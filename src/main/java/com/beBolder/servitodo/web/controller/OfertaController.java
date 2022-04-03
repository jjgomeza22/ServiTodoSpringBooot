package com.beBolder.servitodo.web.controller;

import com.beBolder.servitodo.domain.dto.OfertaDto;
import com.beBolder.servitodo.domain.service.OfertaDtoService;
import com.beBolder.servitodo.persistencia.entity.Oferta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/oferta")
@CrossOrigin({"*"})
public class OfertaController {
    @Autowired
    private OfertaDtoService ofertaDtoService;

    @GetMapping("/consultar")
    public ResponseEntity<List<OfertaDto>> getAll(){
        try {
            return new ResponseEntity<>(ofertaDtoService.getAll(), HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/registrar")
    public ResponseEntity<OfertaDto> registrarOferta(@RequestBody Oferta oferta){
        try {
            return new ResponseEntity<>(ofertaDtoService.registrarOferta(oferta), HttpStatus.CREATED);
        }catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @GetMapping("/detalles/{ofertaID}")
    public ResponseEntity<OfertaDto> getDetallesOferta(@PathVariable("ofertaID") int ofertaID){
        try {
            return new ResponseEntity<>(ofertaDtoService.getDetallesOferta(ofertaID), HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/ofertaHacedores")
    public ResponseEntity<List<OfertaDto>> getOfertasParaHacedores(){
        try{
            return new ResponseEntity<>(ofertaDtoService.getOfertasParaHacedores(), HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/aceptar/{ofertaID}")
    public ResponseEntity<OfertaDto> aceptarOferta(@PathVariable("ofertaID") int ofertaID, @RequestBody Oferta oferta){
        try {
            return new ResponseEntity<>(ofertaDtoService.aceptarOferta(ofertaID, oferta), HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/ofertasHacedores/{habilidadID}")
    public ResponseEntity<List<OfertaDto>> serviciosParaHacedores(@PathVariable("habilidadID") int habilidadID){
        try{
            return new ResponseEntity<>(ofertaDtoService.serviciosParaHacedores(habilidadID), HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/ofertasAceptadas")
    public ResponseEntity<List<OfertaDto>> getOfertasAceptadas(){
        try{
            return new ResponseEntity<>(ofertaDtoService.getOfertasAceptadas(), HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }   

}

package com.nestor.login.controller;

import com.nestor.login.entity.Persona;
import com.nestor.login.service.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {
    private final PersonaService personaService;

    private PersonaController(PersonaService personaService){
        this.personaService=personaService;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Persona>> listarPersonas(){
        return ResponseEntity.status(HttpStatus.OK).body(personaService.listarPersonas());
    }

    @PostMapping("/insertar")
    public ResponseEntity<Persona>ingrsarPersona(@RequestBody Persona persona){
        return ResponseEntity.status(HttpStatus.CREATED).body(personaService.ingresarPersona(persona));
    }
}

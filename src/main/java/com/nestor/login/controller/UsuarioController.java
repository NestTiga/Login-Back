package com.nestor.login.controller;

import com.nestor.login.entity.Usuario;
import com.nestor.login.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Usuario>> listarUsuarios(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.listarUsuarios());
    }

    @GetMapping("/buscarPorId/{id}")
    public ResponseEntity<Usuario> buscarUsuarioPorId(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.buscarUsuarioPorId(id));
    }

    @PostMapping("/insertar")
    public ResponseEntity<Usuario>ingresarUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.ingresarUsuario(usuario));
    }
}

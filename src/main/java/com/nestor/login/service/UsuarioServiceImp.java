package com.nestor.login.service;

import com.nestor.login.entity.Usuario;
import com.nestor.login.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImp implements UsuarioService{

    private final UsuarioRepository usuarioRepository;

    private UsuarioServiceImp(UsuarioRepository usuarioRepository){

        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario buscarUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).get();
    }

    @Override
    public Usuario ingresarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}

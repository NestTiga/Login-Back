package com.nestor.login.service;

import com.nestor.login.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> listarUsuarios();

    Usuario buscarUsuarioPorId(Long id);

    Usuario ingresarUsuario(Usuario usuario);
}

package com.nestor.login.service;

import com.nestor.login.entity.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> listarPersonas();

    Persona ingresarPersona(Persona persona);
}

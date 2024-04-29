package com.nestor.login.service;

import com.nestor.login.entity.Persona;
import com.nestor.login.repository.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImp implements PersonaService{
    private final PersonaRepository personaRepository;
    private PersonaServiceImp(PersonaRepository personaRepository){
        this.personaRepository=personaRepository;
    }
    @Override
    public List<Persona> listarPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona ingresarPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona buscarPersonaPorId(Long id) {
        return personaRepository.findById(id).get();
    }
}

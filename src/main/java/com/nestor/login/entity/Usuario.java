package com.nestor.login.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @SequenceGenerator(
            name = "usuario_sequence",
            sequenceName = "usuario_sequence"
    )
    @GeneratedValue(
            generator = "usuario_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long ususarioId;
    private String nombreUsuario;
    private String contrasenia;
    private String correo;
    private char sesionActiva;
    private String estado;

    @OneToOne
    @JoinColumn(
            name = "persona_id",
            referencedColumnName = "personaId"
    )
    private Persona persona;

}

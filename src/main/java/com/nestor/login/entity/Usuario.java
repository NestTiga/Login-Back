package com.nestor.login.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(
        name = "usuarios",
        uniqueConstraints = @UniqueConstraint(
                name = "usuario_unico",
                columnNames = "nombreUsuario"
        )
        /* con el uniqueConstraints puedo validar que no se ingrese
        nombres de usuarios duplicados
         */
)
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
    @Pattern(regexp = "^[A-Za-z0-9]*$", message = "El nombre de usuario no debe contener signos")
    @Pattern(regexp = ".*\\d+.*", message = "El nombre de usuario debe contener al menos un número")
    @Pattern(regexp = ".*[A-Z]+.*", message = "El nombre de usuario debe contener al menos una letra mayúscula")
    @Size(min = 8, max = 20, message = "El nombre de usuario debe tener entre 8 y 20 caracteres")
    private String nombreUsuario;
    private String contrasenia;

    @Email(message = "Por favor ingrese un correo válido")
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

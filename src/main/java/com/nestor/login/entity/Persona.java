package com.nestor.login.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "personas")
public class Persona {

    @Id
    @SequenceGenerator(
            name = "persona_sequence",
            sequenceName = "persona_sequence"
    )
    @GeneratedValue(
            generator = "persona_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long personaId;
    private String nombres;
    private String apellidos;
    private String identificacion;
    private Date fechaDeNacimiento;

}

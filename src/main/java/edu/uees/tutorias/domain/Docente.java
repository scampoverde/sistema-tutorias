package edu.uees.tutorias.domain;

public class Docente extends Usuario {

    private String especialidad;

    public Docente(Long id,
                   String nombre,
                   String email,
                   String especialidad) {

        super(id, nombre, email);
        this.especialidad = especialidad;
    }
}
package edu.uees.tutorias.domain;

public class Estudiante extends Usuario {

    private String matricula;
    private String carrera;

    public Estudiante(Long id, String nombre, String email,
                      String matricula, String carrera) {
        super(id, nombre, email);
        this.matricula = matricula;
        this.carrera = carrera;
    }
}
package edu.uees.tutorias.domain;

import java.time.LocalDateTime;

public class HorarioDisponible {

    private LocalDateTime inicio;
    private LocalDateTime fin;
    private boolean disponible = true;

    public HorarioDisponible(LocalDateTime inicio,
                             LocalDateTime fin) {

        this.inicio = inicio;
        this.fin = fin;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void ocupar() {
        disponible = false;
    }

    public void liberar() {
        disponible = true;
    }
}
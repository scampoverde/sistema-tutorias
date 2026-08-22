package edu.uees.tutorias.repository;

import edu.uees.tutorias.domain.Reserva;

public interface ReservaRepository {

    void guardar(Reserva reserva);

    Reserva buscarPorId(Long id);
}

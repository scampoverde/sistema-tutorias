package edu.uees.tutorias.repository;

import edu.uees.tutorias.domain.Reserva;
import java.util.HashMap;
import java.util.Map;

public class ReservaRepositoryMemoria
        implements ReservaRepository {

    private final Map<Long, Reserva> reservas =
            new HashMap<>();

    @Override
    public void guardar(Reserva reserva) {
        reservas.put(
            System.currentTimeMillis(),
            reserva
        );
    }

    @Override
    public Reserva buscarPorId(Long id) {
        return reservas.get(id);
    }
}

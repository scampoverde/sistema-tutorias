package edu.uees.tutorias.service;

import edu.uees.tutorias.domain.*;
import edu.uees.tutorias.notification.Notificador;
import edu.uees.tutorias.repository.ReservaRepository;

public class ServicioReservas {

    private final ReservaRepository repository;
    private final Notificador notificador;

    public ServicioReservas(
            ReservaRepository repository,
            Notificador notificador) {

        this.repository = repository;
        this.notificador = notificador;
    }

    public Reserva crearReserva(
            Long id,
            Estudiante estudiante,
            Docente docente,
            HorarioDisponible horario) {

        if (!horario.isDisponible()) {
            throw new IllegalStateException(
                    "Horario no disponible");
        }

        horario.ocupar();

        Reserva reserva =
                new Reserva(
                        id,
                        estudiante,
                        docente,
                        horario);

        repository.guardar(reserva);

        notificador.notificar(
                "Reserva creada exitosamente");

        return reserva;
    }
}
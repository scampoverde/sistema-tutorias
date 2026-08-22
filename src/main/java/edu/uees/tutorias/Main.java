package edu.uees.tutorias.app;

import edu.uees.tutorias.domain.*;
import edu.uees.tutorias.notification.*;
import edu.uees.tutorias.repository.*;
import edu.uees.tutorias.service.*;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Estudiante estudiante =
            new Estudiante(
                1L,
                "Juan Perez",
                "juan@uees.edu.ec",
                "2024001",
                "Sistemas");

        Docente docente =
            new Docente(
                1L,
                "Maria Gomez",
                "maria@uees.edu.ec",
                "Programacion");

        HorarioDisponible horario =
            new HorarioDisponible(
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(1));

        ServicioReservas servicio =
            new ServicioReservas(
                new ReservaRepositoryMemoria(),
                new NotificadorEmail());

        Reserva reserva =
            servicio.crearReserva(
                1L,
                estudiante,
                docente,
                horario);

        System.out.println(reserva.getEstado());
    }
}
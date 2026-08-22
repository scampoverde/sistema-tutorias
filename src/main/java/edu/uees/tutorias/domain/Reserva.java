package edu.uees.tutorias.domain;

public class Reserva {

    private Long id;
    private Estudiante estudiante;
    private Docente docente;
    private HorarioDisponible horario;

    private EstadoReserva estado;

    public Reserva(Long id,
                   Estudiante estudiante,
                   Docente docente,
                   HorarioDisponible horario) {

        this.id = id;
        this.estudiante = estudiante;
        this.docente = docente;
        this.horario = horario;
        this.estado = EstadoReserva.PENDIENTE;
    }

    public void confirmar() {
        estado = EstadoReserva.CONFIRMADA;
    }

    public void cancelar() {
        estado = EstadoReserva.CANCELADA;
    }

    public EstadoReserva getEstado() {
        return estado;
    }
}
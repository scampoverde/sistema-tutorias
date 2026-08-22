package edu.uees.tutorias.notification;

public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(String mensaje) {
        System.out.println("[EMAIL] " + mensaje);
    }
}

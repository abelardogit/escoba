package Core;

import entidades.Carta;
import java.util.List;

public class Output {

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void mostrarMano(List<Carta> mano, String jugador) {
        System.out.println("Mano de " + jugador + ": " + mano);
    }

    public static void mostrarMesa(List<Carta> mesa) {
        System.out.println("Cartas en la mesa: " + mesa);
    }

    public static void mostrarPuntos(int puntosJugador, int puntosMaquina) {
        System.out.println("Puntos del jugador: " + puntosJugador);
        System.out.println("Puntos de la máquina: " + puntosMaquina);
    }
}
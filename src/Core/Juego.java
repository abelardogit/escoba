package Core;

import java.util.ArrayList;
import java.util.List;

import entidades.Carta;
import entidades.Jugador;
import entidades.Baraja;
import entidades.Npc;

import static Core.Output.mostrarMano;
import static Core.Output.mostrarMesa;

public class Juego {
    private static Baraja baraja;
    private static Jugador jugador;
    private static Npc npc;
    private static List<Carta> mesa;

    public Juego() {
        baraja = new Baraja();
        jugador = new Jugador();
        npc = new Npc();
        mesa = new ArrayList<>();
    }

    public static void jugar() {
        repartirCartas();
        mostrarEstadoJuego();
    }

    private static void repartirCartas() {
        for (int i = 0; i < 3; i++) {
            jugador.recibirCarta(baraja.repartirCarta());
            npc.recibirCarta(baraja.repartirCarta());
            mesa.add(baraja.repartirCarta());
        }
    }

    private static void mostrarEstadoJuego() {
        mostrarMano(jugador.getMano(), "Jugador");
        mostrarMesa(mesa);
    }
}

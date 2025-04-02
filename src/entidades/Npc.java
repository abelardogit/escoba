package entidades;

import java.util.List;

// ¿Qué significa NPC?
public class Npc extends Jugador {

    public Carta jugarCarta(List<Carta> mesa) {
        return getMano().remove(0);
    }
}

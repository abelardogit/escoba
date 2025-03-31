package entidades;

import java.util.List;

public class Npc extends Jugador {

    public Carta jugarCarta(List<Carta> mesa) {
        return getMano().remove(0);
    }
}

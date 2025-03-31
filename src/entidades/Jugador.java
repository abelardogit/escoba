package entidades;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private List<Carta> mano;
    private int puntos;

    public Jugador() {
        mano = new ArrayList<>();
        puntos = 0;
    }

    public void recibirCarta(Carta carta) {
        mano.add(carta);
    }

    public void sumarPuntos(int puntos) {
        this.puntos += puntos;
        if (this.puntos > 21) {
            this.puntos = 21;
        }
    }

    public int getPuntos() {
        return puntos;
    }

    public List<Carta> getMano() {
        return mano;
    }

    public void vaciarMano() {
        mano.clear();
    }
}
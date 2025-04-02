package entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
    private List<Carta> cartas;

    public Baraja() {
        // No es un array list porque sabes que tiene un número LIMITADO de cartas.
        cartas = new ArrayList<>();

        String[] palos = {"oros", "espadas", "copas", "bastos"};
        int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Código similar a otro.
        for (String palo : palos) {
            for (int valor : valores) {
                cartas.add(new Carta(valor, palo));
            }
        }
        barajar();
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta repartirCarta() {
        // Este método no debería ejecutarse si no hay cartas
        if (cartas.isEmpty()) {
            return null;
        }
        return cartas.remove(cartas.size() - 1);
    }
}
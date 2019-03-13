
import java.util.ArrayList;
import java.util.Random;

public class Mesa {

    private ArrayList<Ficha> fichasOcultas = new ArrayList<Ficha>();
    private ArrayList<Ficha> fichasEnJuego = new ArrayList<Ficha>();
    Random randomGenerator = new Random();

    public ArrayList<Ficha> getFichas() {
        return fichasOcultas;
    }

    public Ficha getFichaOculta() {
        int eleccion = randomGenerator.nextInt(fichasOcultas.size() - 1);
        return fichasOcultas.remove(eleccion);
    }

    public int getFirst() {
        return fichasEnJuego.get(0).getIzquierdo();
    }

    //Se generan las 28 fichas del domino
    public Mesa() {
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                Ficha temporal = new Ficha(i, j);
                fichasOcultas.add(temporal);
            }
        }
    }

    public boolean jugarFicha(Player jugador, int sitioJugar, int indiceFichaJugar) {
        if (sitioJugar == 1) {
            if (this.ponerFichaInicio(jugador.getMazo().get(indiceFichaJugar))) {
                System.out.println("La ficha se inserto correctamente");
                jugador.getFicha(indiceFichaJugar);
                return true;
            } else {
                System.out.println("La ficha no se puede poner en este lugar");
                return false;
            }
        } else {
            if (this.ponerFichaFinal(jugador.getMazo().get(indiceFichaJugar))) {
                System.out.println("La ficha se inserto correctamente");
                jugador.getFicha(indiceFichaJugar);
                return true;
            } else {
                System.out.println("La ficha no se puede poner en este lugar");
                return false;
            }
        }

    }

    public int getLast() {
        return fichasEnJuego.get(fichasEnJuego.size() - 1).getDerecho();
    }

    // Validar que admite una ficha en un lado de la mesa y de ser necesario la rota
    public void addFichaInicial(Ficha a) {
        fichasEnJuego.add(a);
    }

    //Colocar la ficha al inicio de cada jugada
    public boolean ponerFichaInicio(Ficha ficha) {
        if (ficha.getDerecho() == getFirst()) {
            fichasEnJuego.add(0, ficha);
            return true;
        }
        if (ficha.getIzquierdo() == getFirst()) {
            ficha.rotarFicha();
            fichasEnJuego.add(0, ficha);
            return true;
        }
        return false;

    }

    //Colocar la ficha al final de cada jugada
    public boolean ponerFichaFinal(Ficha ficha) {
        if (ficha.getIzquierdo() == getLast()) {
            fichasEnJuego.add(ficha);
            return true;
        }
        if (ficha.getDerecho() == getLast()) {
            ficha.rotarFicha();
            fichasEnJuego.add(ficha);
            return true;
        }
        return false;
    }

    //mostrar la fichas que cada jugador me vaya generando en la mesa
    public void show() {
        System.out.println("Mesa:");

        for (int i = 0; i < fichasEnJuego.size(); i++) {
            System.out.print(fichasEnJuego.get(i).show() + "=");
        }
        System.out.println();

    }

}

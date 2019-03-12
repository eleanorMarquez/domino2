
import java.util.ArrayList;

public class Player {

    private String nombre;
    private ArrayList<Ficha> mazo = new ArrayList<>();
    //constructor por defecto

    public Player() {
    }

    //constructor sobrecargado
    public Player(String name) {
        this.nombre = name;

    }

    public String getNombre() {
        return nombre;
    }

    //Validar si el  jugador puede tirar una ficha y si le permite tirar que me muestre el indice de la ficha
    public boolean jugadaPosible(int mesaFirst, int mesaLast) {
        for (int i = 0; i < this.getMazo().size(); i++) {
            if (this.getMazo().get(i).getDerecho() == mesaFirst
                    || this.getMazo().get(i).getIzquierdo() == mesaFirst
                    || this.getMazo().get(i).getDerecho() == mesaLast
                    || this.getMazo().get(i).getIzquierdo() == mesaLast) {
                System.out.println("puedes jugar una ficha " + i);
                return true;
            }
        }
        System.out.println("Jugador pasa");
        return false;
    }

    public ArrayList<Ficha> getMazo() {
        return mazo;
    }

    public void addFicha(Ficha ficha) {

        mazo.add(ficha);
    }

    public Ficha getFicha(int x) {
        return mazo.remove(x);
    }

    public void showMazo() {
        System.out.println(nombre);
        mazo.forEach(temp -> System.out.print(temp.show()));
        System.out.println();

    }

    public Ficha parAlto() {
        int value = -1;
        int index = -1;

        for (int i = 0; i < mazo.size(); i++) {
            if (mazo.get(i).getDerecho() == mazo.get(i).getIzquierdo() && mazo.get(i).getDerecho() > value) {
                value = mazo.get(i).getDerecho();
                index = i;
            }

        }
        if (index == -1) {
            return null;
        }

        return mazo.remove(index);

    }
}

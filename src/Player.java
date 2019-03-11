
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LENOVO
 */
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
            if (mazo.get(i).getDerecho()== mazo.get(i).getIzquierdo() && mazo.get(i).getDerecho()> value) {
                value = mazo.get(i).getDerecho();
                index = i;
            }

        }
        if (index == -1) {
            return null;
        }

        return mazo.remove(index);

    }

    //preguntarle al jugador que ficha quiere tirar 
}


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
public class player {

    private String nombre;
    ArrayList<Ficha> mazo = new ArrayList<>();
    //constructor por defecto

    public player() {
    }

    //constructor sobrecargado
    public player(String name) {
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

    public Ficha parAlto() {
        int value = -1;
        int index = -1;

        for (int i = 0; i < mazo.size(); i++) {
            if (mazo.get(i).getPinta1() == mazo.get(i).getPinta2() && mazo.get(i).getPinta1() > value) {
                value = mazo.get(i).getPinta1();
                index = i;
            }

        }
        if(index == -1){
            return null; }

        return mazo.remove(index);
        

    }
    
    
    //preguntarle al jugador que ficha quiere tirar 
	
}

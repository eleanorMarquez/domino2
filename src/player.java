
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
private ArrayList<Ficha> mano = new ArrayList<>();

public player (){
}

public player (String nom, ArrayList man){
 this.nombre=nom;
 this.mano=man;
}
}

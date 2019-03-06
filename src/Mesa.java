
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Mesa {

    
    private ArrayList<Ficha> fichasOcultas = new ArrayList<Ficha>();
    private ArrayList<Ficha> fichasEnJuego = new ArrayList<Ficha>();
    Random randomGenerator = new Random(); 

    public Mesa() {
        for (int i = 0; i <= 6; i++) { //Se generan las 28 fichas del domino
            for (int j = i; j <= 6; j++) {
                Ficha temporal = new Ficha(i, j);
                fichasOcultas.add(temporal);
            }
        }
    }
    public ArrayList<Ficha> getFichas(){
        return fichasOcultas;
    }
            
    
    public Ficha getFichaOculta(){ 
            int eleccion = randomGenerator.nextInt(fichasOcultas.size() - 1);
            return fichasOcultas.remove(eleccion);            
    }
          
    public int getFirst() {
        return fichasEnJuego.get(0).getPinta1();
    }

    public int getLast() {
        return fichasEnJuego.get(fichasEnJuego.size() - 1).getPinta2();
    }

    // Validar que admite una ficha de ser necesario la rota
    /*public boolean ponerFicha(Ficha ficha){
    		if (ficha.getValorDer() == getFirst || )
    	}*/
    // Validar que admite una ficha en un lado de la mesa y de ser necesario la rota
    public void addFichaInicial(Ficha insert){
        fichasEnJuego.add(insert);    
    }
    public boolean ponerFichaInicio(Ficha ficha) {
        if (ficha.getPinta1() == getFirst()) {
            fichasEnJuego.add(0, ficha);
            return true;
        }
        if (ficha.getPinta2() == getFirst()) {
            fichasEnJuego.add(0, ficha);
            ficha.rotarFicha();

            return true;
        }
        return false;

    }

    public boolean ponerFichaFinal(Ficha ficha) {
        if (ficha.getPinta1() == getLast()) {
            fichasEnJuego.add(ficha);
            return true;
        }
        if (ficha.getPinta2() == getLast()) {
            fichasEnJuego.add(ficha);
            ficha.rotarFicha();
            return true;
        }
        return false;
    }

    public void show() {
        System.out.print("Mesa :");

        for (int i = 0; i < fichasEnJuego.size(); i++) {
            System.out.print(fichasEnJuego.get(i).show());
        }
        System.out.println();
    }

}

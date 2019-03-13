
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

    public ArrayList<Ficha> getMazo() {
        return mazo;
    }

    public void addFicha(Ficha ficha) {

        mazo.add(ficha);
    }

    public Ficha getFicha(int x) {
        return mazo.remove(x);
    }
    
    public boolean fichaLanzable( int indexFichaLanzar, int numeroComparar ) {
    	/*Verifica si una ficha en el mazo del jugador se puede colocar junnto
    	 * al numero que viene en numero comparar*/
    	if(this.getMazo().get(indexFichaLanzar).getDerecho() == numeroComparar ||
    	   this.getMazo().get(indexFichaLanzar).getIzquierdo() == numeroComparar) {
    		return true;
    	}
    	return false;
    }
    
    /*Validar si el  jugador puede tirar una fichaADerecha
     *  Si se le pasa un numero diferente de -1 valida 
     *  Si ese indice de ficha se puede lanzar
     *  y lo retorna si la jugada es posible y si no 
     *  es posible retorna -1.
     *  Si se le pasa un -1 revisa todo el mazo y retorna el 
     *  numero de la primera ficha a jugar en la derecha si
     *  no existe retorna -1*/
    public int mostrarJugadaPosible(int numeroEnMesa) {

    		  for (int i = 0; i < this.getMazo().size(); i++) {
    	            if (this.fichaLanzable(i , numeroEnMesa)){
    	            	System.out.println("puedes jugar una ficha " + i );
    	                return i;
    	            }
    	       }
    	return -1;    		  
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

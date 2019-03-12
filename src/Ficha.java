
public class Ficha {

    private int Derecho; //Derecha
    private int Izquierdo; //Izquierda

    //constructor por defecto
    public Ficha() {
    }

    //constructor sobrecargado
    public Ficha(int v1, int v2) {

        this.Derecho = v1;
        this.Izquierdo = v2;

    }

    public int getDerecho() {
        return this.Derecho;
    }

    public void setDerecho(int Derecho) {
        this.Derecho = Derecho;
    }

    public int getIzquierdo() {
        return this.Izquierdo;
    }

    public void setIzquierdo(int Izquierdo) {
        this.Izquierdo = Izquierdo;
    }

    public void rotarFicha() {

        int aux = this.Derecho;
        this.Derecho = this.Izquierdo;
        this.Izquierdo = aux;

    }

    //Buscar la ficha con mas puntos 
    public int sumar() {
        int aux = this.Derecho + this.Izquierdo;
        return aux;
    }

    public void intercambioFicha(Ficha x, Ficha y) {

        Ficha aux = x;
        x = y;
        y = aux;
    }

    public String show() {

        return "|" + this.Izquierdo + ":" + this.Derecho + "|";

    }
}

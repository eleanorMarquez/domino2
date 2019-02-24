/**
 *
 * @author LENOVO
 */
public class Ficha {
    
    private int pinta1, pinta2;
    //constructor por defecto
    public Ficha(){
    }
    
    //constructor sobrecargado
    public Ficha(int v1, int v2){
    
        this.pinta1=v1;
        this.pinta2=v2;
    
    }
    


    public int getPinta1() {
        return pinta1;
    }

    public void setPinta1(int pinta1) {
        this.pinta1 = pinta1;
    }

    public int getPinta2() {
        return pinta2;
    }

    public void setPinta2(int pinta2) {
        this.pinta2 = pinta2;
    }

    public void rotarFicha(){
        
        int aux=this.pinta1;
        this.pinta1=this.pinta2;
        this.pinta2=aux;
    }
    
    public int sumarFicha(){
    
        int aux=this.pinta1+this.pinta2;
        return aux;
    }
    
    public void intercambioFicha(Ficha x, Ficha y){
        
        Ficha aux;
        aux=x;
        x=y;
        y=aux;  
}
}
public class ficha {
    //atributos
    private  int pinta1,pinta2;
    //constructor por default
    public ficha(){
    }
    //constructor sobrecargado
    public ficha(int x, int y){
       this.pinta1=x;
       this.pinta2=y;
    }
    
    //metodos get y set

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
    
    //metodo para rotar ficha
    public void rotar(){
        int aux=this.pinta1;
        this.pinta1=this.pinta2;
        this.pinta2=aux;
        
    }
    
    //metodo para sumar points
    public int sumar(){
        int aux= this.pinta1+this.pinta2;   
        return aux;
    }
    
    //metodo intercambiar
    public void intercambio(ficha n){
        int aux= this.pinta1;
        int temp=this.pinta2;
     
        this.pinta1=n.pinta1;
        this.pinta2=n.pinta2;
        n.pinta1=aux;
        n.pinta2=temp;
        
    }
    

}

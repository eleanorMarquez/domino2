
import java.util.ArrayList;


public class Main{


public static void main(String[] args){


        Ficha f1=new Ficha(0,6);
        Ficha f2=new Ficha (2,1);
        
        
        ArrayList<Ficha> dominoes = new ArrayList<Ficha>();
/*00*/		      dominoes.add(new Ficha(0, 0));
/*01*/                dominoes.add(new Ficha(0, 1));
/*02*/                dominoes.add(new Ficha(0, 2));
/*03*/                dominoes.add(new Ficha(0, 3));
/*04*/                dominoes.add(new Ficha(0, 4));
/*05*/                dominoes.add(new Ficha(0, 5));
/*06*/                dominoes.add(new Ficha(0, 6));
/*07*/                dominoes.add(new Ficha(1, 1));
/*08*/                dominoes.add(new Ficha(1, 2));
/*09*/                dominoes.add(new Ficha(1, 3));
/*10*/                dominoes.add(new Ficha(1, 4));
/*11*/                dominoes.add(new Ficha(1, 5));
/*12*/                dominoes.add(new Ficha(1, 6));
/*13*/                dominoes.add(new Ficha(2, 2));
/*14*/                dominoes.add(new Ficha(2, 3));
/*15*/                dominoes.add(new Ficha(2, 4));
/*16*/                dominoes.add(new Ficha(2, 5));
/*17*/                dominoes.add(new Ficha(2, 6));
/*18*/                dominoes.add(new Ficha(3, 3));
/*19*/                dominoes.add(new Ficha(3, 4));
/*20*/                dominoes.add(new Ficha(3, 5));
/*21*/                dominoes.add(new Ficha(3, 6));
/*22*/                dominoes.add(new Ficha(4, 4));
/*23*/                dominoes.add(new Ficha(4, 5));
/*24*/                dominoes.add(new Ficha(4, 6));
/*25*/                dominoes.add(new Ficha(5, 5));
/*26*/                dominoes.add(new Ficha(5, 6));                
/*27*/                dominoes.add(new Ficha(6, 6));
                
                
        
        //metodo rotar
       f1.rotarFicha();
       
        //llamar metodo de intercamiar 2 fichas
        //f1.intercambioFicha(f2, f2);
        System.out.println(f1.getPinta1()+":"+f1.getPinta2());
        System.out.println(f2.getPinta1()+":"+f2.getPinta2());
        //metodo sumar ficha
        /* f1.sumarFicha();
        f2.sumarFicha();
        
        System.out.println(f1.getPinta1()+f1.getPinta2());
        System.out.println(f2.getPinta1()+f2.getPinta2());
        */

}
}

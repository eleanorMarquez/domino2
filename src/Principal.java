
import java.util.ArrayList;
import java.security.SecureRandom;
public class Principal {
   
   
    public static void main(String[] args) {
     ficha f0= new ficha(0,0); ficha f1=new ficha(0,1); ficha f2=new ficha(0,2); ficha f3=new ficha(0,3);
     ficha f4=new ficha(0,4);  ficha f5=new ficha(0,5); ficha f6=new ficha(0,6); ficha f7=new ficha(1,1); 
     ficha f8=new ficha(1,2);  ficha f9=new ficha(1,3); ficha f10=new ficha(1,4); ficha f11=new ficha(1,5);  
     ficha f12=new ficha(1,6);ficha f13=new ficha(2,2); ficha f14=new ficha(2,3); ficha f15=new ficha(2,4);    
    ficha f16=new ficha(2,5); ficha f17=new ficha(2,6); ficha f18=new ficha(3,3); ficha f19=new ficha(3,4);   
    ficha f20=new ficha(3,5); ficha f21=new ficha(3,6); ficha f22=new ficha(4,4); ficha f23=new ficha(4,5);
    ficha f24=new ficha(4,6); ficha f25=new ficha(5,5); ficha f26=new ficha(5,6); ficha f27=new ficha(6,6); 
    
    
    
     ArrayList<ficha> domino= new ArrayList<>();
      domino.add(f0); domino.add(f1); domino.add(f2); domino.add(f3); domino.add(f4); domino.add(f5);
     domino.add(f6); domino.add(f7); domino.add(f8); domino.add(f9); domino.add(f10); domino.add(f11);
     domino.add(f12); domino.add(f13); domino.add(f14); domino.add(f15); domino.add(f16); domino.add(f17);
     domino.add(f18); domino.add(f19); domino.add(f20); domino.add(f21); domino.add(f22); domino.add(f23);
     domino.add(f24); domino.add(f25); domino.add(f26); domino.add(f27); 
     
    SecureRandom ale =new SecureRandom();
    ArrayList<ficha> domino1= new ArrayList<>();
    ArrayList<ficha> domino2= new ArrayList<>();    
    
    for (int i = 0; i < 7; i++) {
            int valor=ale.nextInt(domino.size());
            ficha n = domino.get(valor);
            domino1.add(n);
            domino.remove(valor);
        }
        
     for (int i = 0; i < 7; i++) {
            int val=ale.nextInt(domino.size());
            ficha x = domino.get(val);
            domino2.add(x);
            domino.remove(val); 
        }
      jugador pc= new jugador("pc", domino2);
      jugador yo = new jugador("juego",domino1);
       
        }
    
    
}    
    


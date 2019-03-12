
import java.util.Scanner;
//import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {

//        Ficha f1=new Ficha(0,6);
//        Ficha f2=new Ficha (2,1);
//        
//        
//        
//                
//                
//        
//        //metodo rotar
//       //f1.rotarFicha();
//       
//        //llamar metodo de intercamiar 2 fichas
//        //f1.intercambioFicha(f2, f2);
//        //System.out.println(f1.getPinta1()+":"+f1.getPinta2());
//        //System.out.println(f2.getPinta1()+":"+f2.getPinta2());
//        //metodo sumar ficha
//        /* f1.sumarFicha();
//        f2.sumarFicha();
//        
//        System.out.println(f1.getPinta1()+f1.getPinta2());
//        System.out.println(f2.getPinta1()+f2.getPinta2());
//        */
//
//        
//        SecureRandom aleatorio =new SecureRandom();
//    ArrayList<Ficha> domino1= new ArrayList<>();
//    ArrayList<Ficha> domino2= new ArrayList<>(); 
//    
//  
//    
//    for (int i = 1; i < 8; i++) {
//            int valor1=aleatorio.nextInt(dominoes.size());
//            Ficha n = dominoes.get(valor1);
//            domino1.add(n);
//           
//            dominoes.remove(valor1);
//           
//        }
//        
//     for (int i = 1; i < 8; i++) {
//            int valor2=aleatorio.nextInt(dominoes.size());
//            Ficha x = dominoes.get(valor2);
//            domino2.add(x);
//            
//            dominoes.remove(valor2); 
//        }
//      player pc= new player("pc", domino2);
//      player yo = new player("juego",domino1); 
        Random randomGenerator = new Random();
       
        
        // se crean 28 fichas y se ocultan 28
        Mesa mesa = new Mesa();
        // Se crean los jugadores para mostrar su mazo
        Player jugador1 = new Player("Estrella");
        Player jugador2 = new Player("PC");

        // Repartir 7 fichas a cada jugador
        for (int i = 0; i < 7; i++) {
            jugador1.addFicha(mesa.getFichaOculta());
            jugador2.addFicha(mesa.getFichaOculta());
        }
        //sacar la ficha inicial
        mesa.addFichaInicial(jugador1.getFicha(0));
   
          
        
        
 
        
        Scanner scan = new Scanner(System.in);
        
           
        
        
        //preguntar en menu de opciones cual ficha desea poner
//		//Colocar una ficha con los pares mas altos |6:6| jugador1,
//		int value = -1;
//		int index = -1;
//		Ficha mayorPar = null;
//		for(int i = 0; i < jugador1.size() ; i++ ){
//      	if(jugador1.get(i).getPinta1()== jugador1.get(i).getPinta2()&&  jugador1.get(i).getPinta1()> value){
//        		//value = jugador1.get(i).getPinta1();
//        		index = i;
//      	}
//   	}
        //mayorPar = jugador1.remove(index); 
        //System.out.println(mayorPar.show());
        //Buscar la ficha con mas puntos 
//   	         value = -1;
//		for(Ficha temp : jugador2){
//      	if(value < (temp.getPinta1()+ temp.getPinta2())){
//        		value = temp.getPinta1()+ temp.getPinta2();
//                        
//      	}
//   	}
//   	System.out.println(value);
//   	
//		Mesa.show();
        jugador1.showMazo();
        System.out.println();
        jugador2.showMazo();
        System.out.println();
        mesa.show("\n");
                  

          System.out.println(mesa.ponerFichaInicio(jugador2.getMazo().get(scan.nextInt())));
//        System.out.println(mesa.ponerFichaInicio(jugador2.getMazo().get(scan.nextInt())));
//        System.out.println(mesa.ponerFichaFinal(jugador1.getMazo().get(scan.nextInt())));
//        System.out.println(mesa.ponerFichaFinal(jugador2.getMazo().get(scan.nextInt())));
   
        mesa.show("\n");

//    int poner = 0;
//        do {
//            Scanner scan = new Scanner(System.in);
//            System.out.println("menu de opciones:\n1.tirar la primera ficha\n2.salir");
//            poner = scan.nextInt();
//            switch (poner) {
//                case 1:
//                    Scanner mostrar = new Scanner(System.in);
//                    System.out.println("digite el numero de la ficha desea mostar" + "/n");
//            }
//        } while (poner != 2);
//
    }

}

import java.util.Scanner;
//import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.*;


public class Main{



public static void main(String[] args){


//        Ficha f1=new Ficha(0,6);
//        Ficha f2=new Ficha (2,1);
//        
//        
//        ArrayList<Ficha> dominoes = new ArrayList<>();
///*00*/		      dominoes.add(new Ficha(0, 0));
///*01*/                dominoes.add(new Ficha(0, 1));
///*02*/                dominoes.add(new Ficha(0, 2));
///*03*/                dominoes.add(new Ficha(0, 3));
///*04*/                dominoes.add(new Ficha(0, 4));
///*05*/                dominoes.add(new Ficha(0, 5));
///*06*/                dominoes.add(new Ficha(0, 6));
///*07*/                dominoes.add(new Ficha(1, 1));
///*08*/                dominoes.add(new Ficha(1, 2));
///*09*/                dominoes.add(new Ficha(1, 3));
///*10*/                dominoes.add(new Ficha(1, 4));
///*11*/                dominoes.add(new Ficha(1, 5));
///*12*/                dominoes.add(new Ficha(1, 6));
///*13*/                dominoes.add(new Ficha(2, 2));
///*14*/                dominoes.add(new Ficha(2, 3));
///*15*/                dominoes.add(new Ficha(2, 4));
///*16*/                dominoes.add(new Ficha(2, 5));
///*17*/                dominoes.add(new Ficha(2, 6));
///*18*/                dominoes.add(new Ficha(3, 3));
///*19*/                dominoes.add(new Ficha(3, 4));
///*20*/                dominoes.add(new Ficha(3, 5));
///*21*/                dominoes.add(new Ficha(3, 6));
///*22*/                dominoes.add(new Ficha(4, 4));
///*23*/                dominoes.add(new Ficha(4, 5));
///*24*/                dominoes.add(new Ficha(4, 6));
///*25*/                dominoes.add(new Ficha(5, 5));
///*26*/                dominoes.add(new Ficha(5, 6));                
///*27*/                dominoes.add(new Ficha(6, 6));
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
		ArrayList<Ficha> fichas = new ArrayList<>();
		ArrayList<Ficha> jugador1 = new ArrayList<>();
		ArrayList<Ficha> jugador2 = new ArrayList<>();
                player jugador3=new player("miller");
                
		mesa Mesa = new mesa();
		for(int i = 0; i <= 6 ; i++){
			for(int j = i; j <= 6 ; j++){
				Ficha temporal = new Ficha(i,j);
				fichas.add(temporal);
			}
		}
		
		System.out.println(fichas.size());
		
		// Repartir 7 fichas a cada jugador
		for (int i = 0; i < 7; i++ ){
			int eleccion = randomGenerator.nextInt(fichas.size() -  1);
			Ficha eleccionFicha = fichas.remove(eleccion);
			jugador3.addFicha(eleccionFicha);
			jugador2.add(fichas.remove(randomGenerator.nextInt(fichas.size() -  1)));
		}
                System.out.print(jugador3.mazo.size()+" ' ");
                
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

		jugador3. getMazo().forEach(temp -> System.out.print(temp.show()));
		System.out.println();
		jugador2.forEach(temp -> System.out.print(temp.show()));
		System.out.println();
		fichas.forEach(temp -> System.out.print(temp.show()));
                
                
                 int poner=0;
                do{
                    Scanner menu =new Scanner(System.in);
                    System.out.println("menu de opciones:\n1.tirar la primera ficha\n2.salir");
                    String opcion=menu.next();
                    poner=Integer.parseInt(opcion);
                    switch(poner){
                        case 1:
                            Scanner mostrar=new Scanner(System.in);
                            System.out.println("digite el numero de la ficha de sea mostar"+"/n");
                    }
                } while (poner!=2);

        }

}


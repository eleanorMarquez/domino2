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
public class mesa {
    
    private ArrayList<Ficha> fichasEnMesa;
     
    public mesa(){
        fichasEnMesa = new ArrayList<Ficha>();
    }

   	public int  getFirst(){
    	return fichasEnMesa.get(0).getPinta1();
    	}
    		
    	public int getLast(){
    		return fichasEnMesa.get(fichasEnMesa.size() - 1).getPinta2();
    	}
    	
    	// Validar que admite una ficha de ser necesario la rota
    	/*public boolean ponerFicha(Ficha ficha){
    		if (ficha.getValorDer() == getFirst || )
    	}*/
        
            	// Validar que admite una ficha en un lado de la mesa y de ser necesario la rota
    	public boolean ponerFichaInicio(Ficha ficha){
    		if (ficha.getPinta1()== getFirst()){
    			fichasEnMesa.add(0, ficha);
    			return true;
    		}
    		if (ficha.getPinta2()== getFirst() ){
    			fichasEnMesa.add(0, ficha);
                        ficha.rotarFicha();
    			
    			return true;
    		}
    		return false;
 
    	}
    	public boolean ponerFichaFinal(Ficha ficha){
     		if (ficha.getPinta1()== getLast()){
     			fichasEnMesa.add(ficha);
    			return true;
    		}
    		if(ficha.getPinta2() == getLast()){
    			fichasEnMesa.add(ficha);
                        ficha.rotarFicha();
    			return true;
    		}
    		return false;
    	}
    	
		public void show(){
			System.out.print( "Mesa :");
			
			for (int i = 0; i < fichasEnMesa.size() ; i++ ){
			System.out.print( fichasEnMesa.get(i).show());	
			}
			System.out.println( );	
		}
    
}

package Main;

import l.Coleccion;
import l.Dimension;
import l.Figura;
import l.Superheroe;

public class Index {
	public static void main(String[] args) {
		Superheroe sup1 = new Superheroe("Green Lantern");
        sup1.setNombre("Linterna verde");
        sup1.setDescripcion("Tiene un anillo que puede crear todo lo que imagine");
        
        System.out.println(sup1.getNombre());
        System.out.println(sup1.getDescripcion());
        
        System.out.println(sup1.toString());
        
        Superheroe sup2 = new Superheroe("All Might");
        sup2.setDescripcion("Es el simbolo de la paz (El hombre mas fuerte).");
        sup2.setCapa(true);
        System.out.println(sup2.getNombre());
        System.out.println(sup2.getDescripcion());
        
        System.out.println(sup2.toString());

        Dimension dimPeq = new Dimension();  
        Dimension dimGra = new Dimension(70,20,20); 
        
        dimPeq.setAlto(20);
        dimPeq.setAncho(5);
        dimPeq.setProfundidad(6);  
        
        System.out.println(dimPeq);
        System.out.println(dimGra);
        System.out.println("Volumen de la dimension pequeña: "+dimPeq.getVolumen());
        
        Figura figLin = new Figura("linterna verde-01",300,sup1,dimPeq);
        
        System.out.println(figLin.toString());
        figLin.subirPrecio(10);
        System.out.println(figLin.toString());
        
        Coleccion col = new Coleccion("Super");
        
        col.añadirFigura(figLin);
        
        Figura figAll = new Figura("All Might-02",800,sup2,dimPeq);
        col.añadirFigura(figAll);
        
        Superheroe sup3 = new Superheroe("TechJacket");
        sup3.setDescripcion("Superhéroe con traje de metal capaz de volar");
        Figura figTech = new Figura("TechJacket-03",80,sup3,new Dimension(6,3,4));
        col.añadirFigura(figTech);
        
        System.out.println(col);
        
        System.out.println(col.conCapa());
     
        Figura fMasValiosa = col.masValioso();
        System.out.println("Figura de más valor: "+fMasValiosa);
        
        System.out.println("Valor de la coleccion: "+col.getValorColeccion());
        
        System.out.println("Volumen de la coleccion: "+col.getVolumenColeccion());
    }
    
}
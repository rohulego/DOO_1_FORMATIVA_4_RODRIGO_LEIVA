
package data;

import model.*;

public class GestorServicios {
    
    public void mostrarServicios(){
    
    RutaGastronomica ruta1 = new RutaGastronomica(2,"Cocina Tradicional",5);
    RutaGastronomica ruta2 = new RutaGastronomica(3,"Trilogia: cielo, mar y tierra",5);
    
    PaseoLacustre paseo1 = new PaseoLacustre("Lancha", "Navegación Extrema", 3);
    PaseoLacustre paseo2 = new PaseoLacustre("Barco", "Navegación Relajante", 4);
    
    ExcursionCultural exc1 = new ExcursionCultural ("Barrio Historico","Centro Patrimonial",2);
    ExcursionCultural exc2 = new ExcursionCultural ("Edificio Centenario","Ciudad Tecnologica",3);
    
    System.out.println(ruta1.toString());
    System.out.println(ruta2.toString());
    System.out.println(paseo1.toString());
    System.out.println(paseo2.toString());
    System.out.println(exc1.toString());
    System.out.println(exc2.toString());
    }
}

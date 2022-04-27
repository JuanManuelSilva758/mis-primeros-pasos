/*

Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 */
package guia7ej02extra;

import java.awt.AWTException;
import java.util.ArrayList;

public class Guia7Ej02Extra {

    public static void main(String[] args) throws AWTException {
        ArrayList<CantanteFamoso> cantantes = new ArrayList();
        System.out.println("A continuación ud deberá ingresar 5 cantantes famosos");
        for (int i = 0; i < 5; i++) {
            System.out.println("Cantante "+(i+1));
            cantantes.add(ServicioCantante.crearCantante()); 
        }
        
        ServicioCantante.mostrarCantantes(cantantes);
        ServicioCantante.opciones(cantantes);
        
        
        
    }
    
}

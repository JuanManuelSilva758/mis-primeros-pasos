package guia7ej02extra;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioCantante {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static CantanteFamoso crearCantante() {
        CantanteFamoso c = new CantanteFamoso();
        System.out.println("Ingrese el nombre");
        c.setNombre(leer.next().toUpperCase());
        System.out.println("Ingrese el disco con mas ventas");
        c.setDiscoConMasVentas(leer.next().toUpperCase());
        return c;
    }

    public static void mostrarCantantes(ArrayList<CantanteFamoso> cantantes) {
        System.out.println("\nLa lista de los cantantes ingreasdos es");
        for (CantanteFamoso i : cantantes) {
            System.out.println(" " + i);
        }
    }

    /*
    MENU OPCIONES CON : Agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa
     */
    public static void opciones(ArrayList<CantanteFamoso> cantantes) throws AWTException {
        int opcion;
        do {
            System.out.println("\nOPCIONES");
            System.out.println("\n1 - Agregar un cantante más");
            System.out.println("2 - Mostrar todos los cantantes");
            System.out.println("3 - Eliminar un cantante");
            System.out.println("4 - SALIR");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\nIngrese el nombre del cantante que desea agregar");
                    String nombre = leer.next().toUpperCase();
                    System.out.println("Ingrese el disco con más ventas");
                    String disco = leer.next().toUpperCase();
                    CantanteFamoso c = new CantanteFamoso(nombre, disco);
                    cantantes.add(c);
                    System.out.println("Cantante " + nombre + " agregado a la lista correctamente");
                    break;
                case 2:
                    mostrarCantantes(cantantes);
                    break;
                case 3:
                    System.out.println("\nIngrese el nombre del cantante a eliminar");
                    String n = leer.next().toUpperCase();
                    boolean bandera = false;
                    for (int i = 0; i < cantantes.size(); i++) {
                        if (cantantes.get(i).getNombre().equalsIgnoreCase(n)) {
                            cantantes.remove(i);
                            bandera = true;
                            System.out.println("\n Cantante " + n + " eliminado correctamente");
                        }
                    }
                    if (bandera == false) {
                        System.out.println("No existe un cantante llamado " + n + " en la lista");
                    }
                    break;
                case 4:
                    System.out.println("\nGRACIAS POR USAR EL SISTEMA");
                    break;
            }
            limpiar();   //LIMPIA PANTALLA 
        } while (opcion != 4);

    }

    public static void limpiar() throws AWTException {
        System.out.println("\nPresione Enter para continuar..."); //si uso esto, no usar pressbot.delay
        new java.util.Scanner(System.in).nextLine(); //si uso esto, no usar pressbot.delay

        Robot pressbot = new Robot();
        pressbot.setAutoDelay(1);
        //pressbot.delay(10000); por si lo quiero tener automatico sin tocar tecla, sacar las dos primeras lineas
        pressbot.keyPress(17);//orden para apretar CTRL key
        pressbot.keyPress(76);//orden para apretar L key
        pressbot.keyRelease(17); //orden para soltar CTRL key
        pressbot.keyRelease(76); //orden para soltar  key
    }

}

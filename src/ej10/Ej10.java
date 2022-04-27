
package ej10;

import java.util.Scanner;
import javax.sound.midi.Soundbank;


public class Ej10 {

    
    public static void main(String[] args) {
       Scanner leer =new Scanner(System.in);
        System.out.println("Escribir una frase o palabra");
        String  letras =leer.next();
        if (letras.substring(0,1).equals("A")){
        System.out.println("correcto");
        
       
    }else{
            System.out.println("Incorrecto");
        }
    
}}


/*
 * EJERCICIO 05: Programa Java que:
 * declare una variable A de tipo entero y asígnale un valor.
 * A continuación muestra un mensaje indicando si A es par o impar.
 * Utiliza el operador condicional ( ? : ) dentro del println para resolverlo. 
 */
package cac.java.tdp;
import java.util.Scanner;

/**
 *
 * @author Rhaynel Parra Aguiar <mail@rhynl.io>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void dia(int dia_de_semana){
        
        switch(dia_de_semana){
            case 1:
                    System.out.println("lunes");
                    break;
            case 2:
                    System.out.println("martes");
                    break;
            case 3:
                    System.out.println("Miercoles");
                    break;
            case 4:
                    System.out.println("jueves");
                    break;
            case 5:
                    System.out.println("viernes");
                    break;
            case 6:
                    System.out.println("sabado");
                    break;
            case 7:
                   System.out.println("domingo");
                    break;
        } 
    }
    public static void main(String[] args) {
        
        int A;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("ingrese un numero entero entre 1 a 7");
        A = teclado.nextInt();
        
        if(A < 0 || A > 7)
            System.err.println("el numero ingresado es erroneo");
        dia(A);
        
    }
    
}

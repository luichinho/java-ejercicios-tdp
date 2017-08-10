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
    public static void main(String[] args) {
        
        int A;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("ingrese un numero entero");
        A = teclado.nextInt();
        
       /* if((A%2) == 0)
            System.out.println("el numero es par");
        else
            System.out.println("el numero es impar");     
        */
        System.out.println(A%2 == 0 ? "el numero es par":"el es impar");
        
    }
    
}

/*
 * Ejercicio 30: Programa que lea una variable entera mes y compruebe si el
 * valor corresponde a un mes de 30, 31 o 28 días. Se mostrará además el nombre
 * del mes. Se debe comprobar que el valor introducido esté comprendido entre 1 y 12.
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
    public static void verCantidadDeDias(int mes){
        
        if(mes == 2 )
            System.out.println("el mes tiene 28 dias");
        else if(mes==1 || mes==3 || mes==7 || mes==8 ||mes==10|| mes==12)
            System.out.println("el mes tiene 31 dias");
        else 
            System.out.println("el mes tiene 30 dias");
    } 
    
    public static void mostrarMes(int mes){
         switch(mes){
            case 1:
                    System.out.println("ENERO");
                    break;
            case 2:
                    System.out.println("Febrero");
                    break;
            case 3:
                    System.out.println("Marzo");
                    break;
            case 4:
                    System.out.println("Abril");
                    break;
            case 5:
                    System.out.println("MAYO");
                    break;
            case 6:
                    System.out.println("Junio");
                    break;
            case 7:
                    System.out.println("JULIO");
                    break;
            case 8:
                    System.out.println("Agosto");
                    break;
            case 9:
                    System.out.println("SEPTIEMBRE");
                    break;
            case 10:
                    System.out.println("OCTUBRE");
                    break;
            case 11:
                    System.out.println("Nobiembre");
                    break;
            case 12:
                    System.out.println("DICIEMBRE");
                    break;
         }
        
    }
    public static void main(String[] args) {
        
        int mes;        
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese el numero de un mes valido(1 a 12)");
        mes = teclado.nextInt();
        if(mes < 1 || mes > 12)
            System.err.println("el numero del mes es incorrecto");
        else{
            verCantidadDeDias(mes);
            mostrarMes(mes);            
        }
    }
    
}

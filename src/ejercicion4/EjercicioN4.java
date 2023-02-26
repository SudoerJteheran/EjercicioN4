/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion4;
import java.util.Scanner;

/**
 *
 * @author kkmie
 */
public class EjercicioN4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Declaración de variables
        float edad_madre, edad_juan, edad_alberto, edad_ana;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la edad de Juan:");
        edad_juan = entrada.nextFloat();
        
        //Se hallan las edades con las respectivas operaciones dadas
        edad_alberto = (2*edad_juan)/3;
        edad_ana = (4*edad_juan)/3;
        edad_madre = edad_juan + edad_alberto + edad_ana;
        
        //Se imprimen en consola las edades
        System.out.println("La edad de la madre es: " + edad_madre);
        System.out.println("La edad de Alberto es: " + edad_alberto);
        System.out.println("La edad de Ana es: " + edad_ana + "\n");
    }
    
}

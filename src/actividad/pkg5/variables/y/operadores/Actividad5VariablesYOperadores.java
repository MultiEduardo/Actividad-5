/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg5.variables.y.operadores;

/**
 *
 * @author Bryan
 */
public class Actividad5VariablesYOperadores {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x = 25, y = 7.5;
        //suma, resta, división, módulo
        double suma = x+y, 
               resta = x-y,
               multiplicacion = x*y,
               division = x/y, 
               modulo = x%y;
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Módulo: " + modulo);
        
    }
    
}


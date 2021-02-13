/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author alvar
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
       int numero =(int)Math.floor(Math.random()*100) ;
       int valor=0;
       int intentos=0;
       
        System.out.println(numero);
        System.out.println("Atinale al Numero");
        while(numero!=valor){
            valor = s.nextInt();
            if(valor > numero){
                System.out.println("Estas muy Elevado Intenta un numero mas pequenio");
            }
            
            if(valor<numero){
                System.out.println("Estas muy bajo Intenta un numero mas grande");
            }
            intentos++;
        }
        System.out.println("Felicidades Has ganado!");
        System.out.println("Lo has conseguido en "+intentos + " Intentos");
        
    }
    
}

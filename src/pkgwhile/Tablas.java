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
public class Tablas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ingresa un numero");
       int numero =  s.nextInt();
        for (int i = 0; i < 10; i++) {
            int resultado = numero*(i+1);
            System.out.println(numero+" x "+(i+1)+ " = "+ resultado);
        }
    }
    
}

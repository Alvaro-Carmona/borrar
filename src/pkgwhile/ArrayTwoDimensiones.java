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
public class ArrayTwoDimensiones {
public static void insertar(int[][]array){
    Scanner s =  new Scanner(System.in);
    int numero;
    
    
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j <array[0].length; j++) {
            System.out.println("llene los valores de la fila "+(i+1));
            numero = s.nextInt();
            array[i][j]=numero;
        }
    }

}
public static void llenarTabla(String [][]array){
    Scanner s =  new Scanner(System.in);
    String numero;
    
    
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j <array[0].length; j++) {
            if(array[0][2]!=null){
            System.out.println("Valor para campo "+array[0][j] );
            numero = s.nextLine();
            array[i][j]=numero;
            }else{
            System.out.println("Campos");
            numero = s.nextLine();
            array[i][j]=numero; 
            }
           
           
            
           
            
       
        }
    }

}
//==========================
public static void mostrar(int[][]array){
      for (int i = 0; i < array.length; i++) {
          System.out.print("|");
        for (int j = 0; j <array[i].length; j++) {
           System.out.print(array[i][j]);
           if (j!=array[i].length-1) System.out.print("\t");
        }
        System.out.println("|");
    }
}
//==========================

public static void mostrarTabla(String[][]array){
      for (int i = 0; i < array.length; i++) {
          System.out.print("|");
        for (int j = 0; j <array[i].length; j++) {
           System.out.print(array[i][j]);
           if (j!=array[i].length-1) System.out.print("\t");
        }
        System.out.println("|");
    }
}

    public static void main(String[] args) {
        int array [][] = new int [3][3];//3 filas 4 columnas [][][][]
//        ArrayTwoDimensiones.insertar(array);
//        ArrayTwoDimensiones.mostrar(array);

       String array2[][] = new String [3][3];
        ArrayTwoDimensiones.llenarTabla(array2);
        ArrayTwoDimensiones.mostrarTabla(array2);
}
    
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio5;

/**
 *
 * @author Ruben
 */
public class Laboratorio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             // Ejemplo de uso del método sumarLista
        int[] lista = {1, 2, 3, 4, 5};
        Arreglo.sumarLista(lista);
            char caractere = 'o';
            String cadena = "canario de la paz";
       
        int[][] matriz = {{1,2,3,4,5},{1, 2, 3}, {4, 5}, {6, 7, 8, 9},{1}};
          int b= matriz.length;
         
         
        int mayor = Arreglo.buscarMayor(matriz);
        
      
        System.out.println("El mayor número de la matriz es: " + mayor);
         
        int vocals = Arreglo.cuentaVocales(cadena);
        System.out.println("La cantidad de vocales en la cadena es: " + vocals);
        String cadena2 = "como  la flor se marchito";
     
        int caracter = Arreglo.cuentaCaracter(cadena2, caractere);
        System.out.println("La cantidad de veces que se repite el caracter"+ caracter); 
    }
    
}

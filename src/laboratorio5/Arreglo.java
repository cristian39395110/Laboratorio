/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio5;

import sun.security.util.Length;

/**
 *
 * @author Ruben
 */
public class Arreglo {
    public static void sumarLista(int barra[])
    {int contador=0;
    int suma=0;
    int ultimo=barra.length;
    for (int i=0;i<ultimo;i++)
    {
       suma=suma+barra[i];
       contador++;
    
    }
        System.out.println("la suma del arreglo es: "+suma);
        System.out.println("el promedio es: "+suma/contador);
    }
    public static int buscarMayor(int[][]  bidimensional) {
        int mayor = 0;
        for (int i = 0; i < bidimensional.length; i++) {
            for (int j = 0; j < bidimensional[i].length; j++) {
                if (bidimensional[i][j] > mayor) {
                    mayor = bidimensional[i][j];
                }
            }
        }
        return mayor;
    }

    
    public static int cuentaVocales(String cadena)
    {
       int ultimo=cadena.length();
       int cantidad=0;
        for (int i = 0; i < ultimo; i++) {
            if (cadena.charAt(i)=='a'||cadena.charAt(i)=='e'||cadena.charAt(i)=='i'||cadena.charAt(i)=='0'||cadena.charAt(i)=='u')
            {cantidad++;}
        }
        
        return cantidad;
    
    
    }
     public static int cuentaCaracter(String cadena,char c)
    {
       int ultimo=cadena.length();
       int cantidad=0;
        for (int i = 0; i < ultimo; i++) {
            if (cadena.charAt(i)==c)
            {cantidad++;}
        }
        
        return cantidad;
    
    
    }
}
/*a) Método sumarLista que reciba por parámetro un arreglo unidimensional de
enteros y muestre por pantalla la suma y promedio de los mismos.
b) Método buscarMayor que reciba por parámetro un arreglo bidimensional e
irregular de enteros y retorne el entero más grande que se encuentra en el arreglo.
c) Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad
de vocales que tiene la cadena.
d) Método cuentaCaracter que reciba por parámetro un String y un caracter, luego
retorne la cantidad de veces que se repite en la cadena el carácter recibido.
Luego desde el método main de una clase de nombre PruebaArreglo, invocar los métodos
de la clase Arreglo creada por usted.
*/
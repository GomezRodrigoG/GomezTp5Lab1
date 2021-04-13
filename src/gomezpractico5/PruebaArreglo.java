/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomezpractico5;

import gomezpractico5.entities.Arreglo;

/**
 *
 * @author Rodrigo
 */
public class PruebaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1,10,10};
        int[][] array2 = {{1,4,7,18,29,2,6,2},{9,1,3,6},{5}};
        String word = "Rodrigo Gabriel Gomez";
        int cantVowels;
        int cantRepeat;
        char repeat = 'o';
        
        Arreglo.sumarLista(array);
        System.out.println("");
        
        Arreglo.buscarMayor(array2);
        System.out.println("");
        
        cantVowels = Arreglo.cuentaVocales(word);
        System.out.println("La cantidad de vocales de la palabra: " + word + " es: " + cantVowels + "\n");
       
        cantRepeat = Arreglo.cuentaCaracter(word, repeat);
        System.out.println("La cantidad de veces que el caracter: '" + repeat + "' se repite en la palabra: " + word + " es: " + cantRepeat );
    }
}

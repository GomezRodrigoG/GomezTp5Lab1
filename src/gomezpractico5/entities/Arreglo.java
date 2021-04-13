/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomezpractico5.entities;

/**
 *
 * @author Rodrigo
 */
public class Arreglo {
    // Método sumarLista que reciba por parámetro un arreglo 
    // unidimensional de enteros y muestre por pantalla la suma 
    // y promedio de los mismos.
    public static void sumarLista(int[] array){
        int sum = 0;
        
        for(int number:array){
            sum += number;
        }
        
        System.out.println( "La suma del arreglo es: " + sum );
        System.out.println( "El porcentaje es: " + sum/array.length );
    }
    
    // Método buscarMayor que reciba por parámetro un arreglo bidimensional
    // e irregular de enteros y retorne el entero más grande que se encuentra 
    // en el arreglo
    public static void buscarMayor( int[][] array ){
        int higher = 0;
        for(int[] row:array){
            for(int number:row){
                if( number > higher) higher = number;
            }
        }
        System.out.println( "El numero mas grande es: " + higher );
    }
    
    // Método cuentaVocales, que reciba por parámetro un String y retorne la 
    // cantidad de vocales que tiene la cadena.
    public static int cuentaVocales(String text){
        int toRet = 0;
        
        for(char character:text.toLowerCase().toCharArray()){
            switch(character){
                case 'a':
                    toRet++;
                break;
                    
                case 'e':
                    toRet++;
                break;
                
                case 'i':
                    toRet++;
                break;
                
                case 'o':
                    toRet++;
                break;
                
                case 'u':
                    toRet++;
                break;
            }
        }
        
        return toRet;
    }

    // Método cuentaCaracter que reciba por parámetro un String y un caracter,
    // luego retorne la cantidad de veces que se repite en la cadena el 
    // carácter recibido.
    public static int cuentaCaracter(String text,char character){
        int toRet = 0;
        
        for(char auxChar:text.toCharArray()){
            if(auxChar == character) toRet++;
        }
        
        return toRet;
    }
}

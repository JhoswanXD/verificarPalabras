/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificarpalabras;
import java.util.Scanner;
/**
 *
 * @author jhosw
 */
public class VerificarPalabras {
   
    // Método wrapper
    public static boolean esPalindromo(String palabra) {
        palabra = palabra.replaceAll("[^a-zA-Z]", "").toLowerCase();
    return esPalindromo(palabra, 0, palabra.length() - 1);
    }
    public static boolean esPalindromo(String palabra, int inicio, int fin){
        // Caso base: si los índices se cruzan o son iguales, es palíndromo
        if (inicio >=fin){
            return true;
        }
        if (palabra.charAt(inicio) != palabra.charAt(fin)){
            return false;
        }
        return esPalindromo (palabra, inicio + 1, fin -1);
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String entrada = scanner.nextLine();
        System.out.println("¿Es palíndromo? " + esPalindromo(entrada));
    }
}

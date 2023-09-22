/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cuervo.ui;

/**
 *
 * @author Hector Lucero
 */



import java.util.Scanner;

public class Verificar {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese una frase
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        
        // Eliminar espacios en blanco y convertir la frase a minúsculas para simplificar la comparación
        frase = frase.replaceAll("\\s+", "").toLowerCase();
        
        // Verificar si la frase es un palíndromo
        if (esPalindromo(frase)) {
            System.out.println("Sí es palíndromo.");
        } else {
            System.out.println("No es palíndromo.");
        }
        
        // Cerrar el Scanner
        scanner.close();
    }
    
    // Método para verificar si una cadena es un palíndromo
    public static boolean esPalindromo(String cadena) {
        int longitud = cadena.length();
        
        // Comparar caracteres desde ambos extremos hacia el centro
        for (int i = 0; i < longitud / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(longitud - 1 - i)) {
                return false; // No es un palíndromo
            }
        }
        
        return true; // Es un palíndromo
    }
}


  
   
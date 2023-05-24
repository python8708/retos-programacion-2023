/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosprimosgemelos;

import java.util.ArrayList;
import java.util.List;

public class NumerosPrimosGemelos {
    public static void main(String[] args) {
        int rangoMaximo = 100; // Define el rango máximo aquí

        List<Integer> numerosPrimos = encontrarNumerosPrimos(rangoMaximo);
        List<Integer[]> numerosPrimosGemelos = encontrarNumerosPrimosGemelos(numerosPrimos);

        System.out.println("Pares de números primos gemelos en el rango hasta " + rangoMaximo + ":");
        for (Integer[] par : numerosPrimosGemelos) {
            System.out.println("(" + par[0] + ", " + par[1] + ")");
        }
    }

    // Encuentra todos los números primos en el rango hasta el número máximo
    private static List<Integer> encontrarNumerosPrimos(int maximo) {
        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= maximo; i++) {
            if (esPrimo(i)) {
                primos.add(i);
            }
        }
        return primos;
    }

    // Verifica si un número es primo
    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Encuentra pares de números primos gemelos en la lista de números primos
    private static List<Integer[]> encontrarNumerosPrimosGemelos(List<Integer> primos) {
        List<Integer[]> primosGemelos = new ArrayList<>();
        for (int i = 0; i < primos.size() - 1; i++) {
            int numero1 = primos.get(i);
            int numero2 = primos.get(i + 1);
            if (numero2 - numero1 == 2) {
                Integer[] par = {numero1, numero2};
                primosGemelos.add(par);
            }
        }
        return primosGemelos;
    }
}

    

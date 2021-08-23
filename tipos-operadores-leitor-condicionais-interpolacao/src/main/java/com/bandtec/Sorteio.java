/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bandtec;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Aluno
 */
public class Sorteio {

    public static void main(String[] args) {
        Scanner leitorSorteio = new Scanner(System.in);

        System.out.println("Digite um número de 1 á 100:");
        Integer numeroDigitado = leitorSorteio.nextInt();
        
                    Integer contador = 0;
                    Integer contadorPares = 0;
                    Integer contadorImpares = 0;

        for (int i = 1; i <= 200; i++) {
            Random sorteio = new Random();
            Integer aleatorio = sorteio.nextInt(100);

            if (numeroDigitado == aleatorio && contador == 0) {
                contador++;
                System.out.printf("Posição do número digitado: %d\n", i);
            }
            
            if (aleatorio % 2 == 0) {
                contadorPares++;
            } else if (aleatorio % 2 != 0) {
                contadorImpares++;
            }           
        }
        
        System.out.println("Quantas vezes os números pares foram sorteados? \n" + contadorPares);
        System.out.println("Quantas vezes os números ímpares foram sorteados? \n" + contadorImpares);   
            
    }
}

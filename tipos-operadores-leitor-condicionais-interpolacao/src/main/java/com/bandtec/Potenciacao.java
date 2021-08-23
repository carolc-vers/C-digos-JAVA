/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bandtec;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Potenciacao {
    public static void main(String[] args) {
        Scanner leitorNumerico = new Scanner (System.in);
        
        System.out.println("Digite uma base para a potenciação: ");
        Integer base = leitorNumerico.nextInt();
        
        System.out.println("Agora, digite um expoente: ");
        Integer expoente = leitorNumerico.nextInt();
        
        Integer potenciação = base;

        for(int i = 1; i < expoente; i++){
            potenciação = potenciação * base;
        }  
        
        System.out.println("O valor de " + base + " elevado á " + expoente + " é " + potenciação + ".");
    }
}

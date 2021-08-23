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
public class Tabuada {
    public static void main(String[] args) {
        Scanner leitorNumerico = new Scanner (System.in);
                
        System.out.println("Digite um número para exibir a tabuada:");
        Integer numero = leitorNumerico.nextInt();
        System.out.printf("Tabuada do %d\n", numero);
        
        
        for(int i=0; i <= 10; i++){
            Integer resultado = numero * i;
            System.out.printf("%d * %d = %d \n", numero, i, resultado);
        }
        
    }
}

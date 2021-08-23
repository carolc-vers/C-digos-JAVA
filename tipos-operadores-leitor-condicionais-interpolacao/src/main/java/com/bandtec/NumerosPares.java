/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bandtec;

/**
 *
 * @author Aluno
 */
public class NumerosPares {
    public static void main(String[] args) {
        
        Integer contador = 0;
        
        while(contador <=40){
            contador++;
            
            if(contador %2 == 0){
                System.out.printf("%d\n", contador);}
        }
    }
}

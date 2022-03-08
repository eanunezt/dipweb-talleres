/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interlem.sentenciascontrol;

/**
 *
 * @author usuario
 */
public class Comparacion {
    public static void main(String[] args){        
        int n1 = 15;int n2 = 10; int n3 = 15;        
        if(n1 > n2){
                        
            if(n1 > n3){
                System.out.println("Variable N1 es mayor: " + n1);
            }else{
                if(n1==n3){
                    System.out.println("Variable n1 y N3 son iguales: " + n3);
                 }else{
                System.out.println("Variable N3 es mayor: " + n3);
                 }
            }
                
        }else if(n2 > n3){
            System.out.println("Variable N2 es mayor: " + n2);
        }else {
             if(n2==n3){
                 if( n3==n1){
                    System.out.println("Variable n1, N2 y N3 son iguales: " + n3);
                 }else{
                    System.out.println("Variable N2 y N3 son mayores: " + n3);
                 }
             }else{
            System.out.println("Variable N3 es mayor: " + n3);
             }
        }
    }    
}
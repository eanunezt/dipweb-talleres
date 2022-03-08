/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interlem.ciclosjava;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class TallerCiclos {
    public static void main(String[] args){
        Scanner numeroNotas = new Scanner(System.in);
        double sumaNotas = 0;
        Scanner nota = new Scanner(System.in);
        String definitiva = null;
        double promedio;
        int datoCantidadNotas;
        double datoNota = 0;
        System.out.println("Ingresa cantidad de notas: ");
        datoCantidadNotas = numeroNotas.nextInt();
        
        for(int i=1; i<=datoCantidadNotas; i++){
            System.out.println("Ingrese nota "+ i);
            datoNota = nota.nextDouble();
            sumaNotas = sumaNotas + datoNota;
        }
        promedio = sumaNotas/datoCantidadNotas;

        if(promedio<5.9){
            definitiva= "insuficiente";
        }else if(promedio>=6 & promedio<7.9 ){
            definitiva= "Aceptable";
        }else if(promedio>=8 & promedio<9.5){
            definitiva= "Sobresaliente";
        }else if(promedio>=9.6 & promedio<=10){
            definitiva= "Excelente";
        }       
        System.out.println(definitiva);        
        System.out.println("Promedio: " + promedio);
        numeroNotas.close();
        nota.close();
        }
}
    
    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorting;

import java.util.Random;            //para el random


import java.io.BufferedReader;      //para leer archivo de texto
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import java.io.*;       // para escribir archivo de texto

public class Sorting {

    public static void main(String[] args) {

        Numerosrandom nuevo = new Numerosrandom();
        nuevo.ficherorandom();
        
        String arreglo[] = nuevo.lecturafichero();
        
        Mergesort orden = new Mergesort();
        String arreglo2[] =orden.lista(arreglo);
        
        nuevo.escribirfichero(arreglo2);
        
    }//fin del main
    
}//fin de la clase

    
  
    

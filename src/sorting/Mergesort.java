package sorting;

import java.io.*;
import java.util.*;
import sorting.Numerosrandom;



public class Mergesort {
     
    public String[] lista(String[] list){
        int[] list2 = new int[list.length];
                
        for(int i=0; i<list.length;i++){
            list2[i]=Integer.parseInt(list[i]);
        }
        
        //System.out.println("desordenada: " + Arrays.toString(list2));
        mergeSort(list2);
        System.out.println("ordenada:  " + Arrays.toString(list2));
        
        for(int i=0; i<list.length;i++){
        list[i]=Integer.toString(list2[i]);
        }
        return list;
    }
    
    public void mergeSort(int[] array) {
        if (array.length > 1) {

            int[] izquierda = mitad1(array);
            int[] derecha = mitad2(array);

            mergeSort(izquierda);
            mergeSort(derecha);
            
            merge(array, izquierda, derecha);
        }
    }
    
    public int[] mitad1(int[] array) {
        int largo = array.length / 2;
        int[] izquierda2 = new int[largo];
        for (int i = 0; i < largo; i++) {
            izquierda2[i] = array[i];
        }
        return izquierda2;
    }
    
    public int[] mitad2(int[] array) {
        int largo = array.length / 2;
        int largo2 = array.length - largo;
        int[] derecha2 = new int[largo2];
        for (int i = 0; i < largo2; i++) {
            derecha2[i] = array[i + largo];
        }
        return derecha2;
    }
    
    public void merge(int[] resultado, int[] left, int[] right) {
        int contador1 = 0;
        int contador2 = 0;
        
        for (int i = 0; i < resultado.length; i++) {
            if (contador2 >= right.length || (contador1 < left.length && left[contador1] <= right[contador2])) {
                resultado[i] = left[contador1];
                contador1++;
            } else {
                resultado[i] = right[contador2];
                contador2++;
            }
        }
    }    
}

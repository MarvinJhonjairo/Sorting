/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorting;

public class Quicksort {
    private String arreglo2[] = new String[201];
    
    public Quicksort(){
    
    }
    
    public String[] ordenar(String arreglo[]){
        Quicksort(arreglo, 0, 200 - 1);
        System.out.print("\nArreglo ordenado: ");
        for( int i = 0; i < 200; i++){
        System.out.print(arreglo[i] + " ");
        arreglo2[i] = arreglo[i];
    }
        return arreglo2;
    }

static void Quicksort(String arr[], int p, int r){
if(p < r)
    {
    int q = Particion(arr, p, r);
    Quicksort(arr, p, q - 1);
    Quicksort(arr, q + 1, r);
    }
}

static int Particion(String arr[], int p, int r){
int x = Integer.parseInt(arr[r]);
int i = p - 1, t;
    for(int j = p; j < r; j++){
    if((Integer.parseInt(arr[j])) <= x){
        i++;
        t = Integer.parseInt(arr[i]);
        arr[i] = arr[j];
        arr[j] = Integer.toString(t);  
        }
    }
     t = Integer.parseInt(arr[i + 1]);
     arr[i + 1] = arr[r];
     arr[r] = Integer.toString(t);
     return i + 1;

    }
}

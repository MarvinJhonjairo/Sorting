
package sorting;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

import java.io.*;   

public class Numerosrandom {
        private String arreglo[] = new String[201];
    
        public Numerosrandom (){
        // si el .txt existe se debe agregar : FileWriter fichero = new FileWriter("fichero.txt",true);
        } 
         
        public void ficherorandom(){
        FileWriter fichero = null;
        Random rnd = new Random();
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("fichero.txt");
            pw = new PrintWriter(fichero);
 
            for (int i = 0; i <= 200; i++)
                pw.println(rnd.nextInt(1000));
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Utilizamos el finally para asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }             
          
        }
        
        public String[] lecturafichero(){
                    //String arreglo[] = new String[201];
                   
                        int i = 0;
        	try {
		
			FileReader fr = new FileReader("fichero.txt");
			BufferedReader bf = new BufferedReader(fr);
			String sCadena;
			while ((sCadena = bf.readLine())!=null) {
				//System.out.println("dato "+i+ ": "+ sCadena);
                                
                                 arreglo[i] = sCadena;       //lee y coloca en la cadena
                                 i =i+ 1;
			} 
				
			 
		} catch (FileNotFoundException fnfe){
			fnfe.printStackTrace();
		} catch (IOException ioe){
			ioe.printStackTrace();
		}     
        //for(int x = 0; x < 200; x++){
        //System.out.println(arreglo[x]);
        //}
        
        //for( i = 0; i < 200; i++){
        //    System.out.print(arreglo[i] + " ");
        //}
        return arreglo;
}                                   // termina el fichero



        public void escribirfichero(String arreglo2[]){
            FileWriter fichero = null;
            PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("fichero2.txt");  //Se puede modificar el mismo archivo solo con cambiar el nombre
            pw = new PrintWriter(fichero);
 
            for (int i = 0; i <= 200; i++)
                pw.println(arreglo2[i]);
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Utilizamos el finally para asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }                 
        }
        
   }   


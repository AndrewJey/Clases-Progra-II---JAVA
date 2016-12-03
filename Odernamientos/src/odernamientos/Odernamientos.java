/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odernamientos;

/**
 *
 * @author fmendez-as
 */
public class Odernamientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int test[]= {50, 26, 7, 9, 15, 27};
        Persona testP[] = {new Persona("Abc"), new Persona("Aaa")};
        burbuja(testP);
        quicksort(test, 0, 5);
        imprimirArreglo(test);
    }
    
    static void burbuja(Persona arreglo[])
    {
        int i, j;
        Persona aux;
        for(i = 0; i < arreglo.length-1; i++)
        {
             for(j = 0; j < arreglo.length-i-1; j++)
             {
                if(arreglo[j+1].getNombre().compareTo(arreglo[j].getNombre()) < 0)
                {
                    aux = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j]=aux;
                }
            }
        }
    }
    public static void insercion(int arreglo[])
    {
        int i, j;
        int aux;
        for (i = 1; i < arreglo.length; i++)
        { 
            aux = arreglo[i]; 
            j = i - 1; 
            while ((j >= 0) && (aux < arreglo[j]))
            {                            
                arreglo[j + 1] = arreglo[j];      
                j--;                   
            }
            arreglo[j + 1] = aux;
            //imprimirArreglo(arreglo);
        }
    }
    
    public static void seleccion(int arreglo[]) 
    {
          int i, j, menor, tmp;
          for (i = 0; i < arreglo.length - 1; i++) 
          {
                menor = arreglo[i]; 
                for (j = i + 1; j < arreglo.length; j++)
                {
                    if (arreglo[j] < menor) 
                    {                
                        menor = arreglo[j]; 
                        tmp = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = tmp;
                    }
                }
          }
    }
    
    public static void shell(int arreglo[])
    {
        int salto, aux, i;
        boolean cambios;
        for(salto=arreglo.length/2; salto!=0; salto/=2)
        {
            cambios=true;
            while(cambios)
            {
                //imprimirArreglo(arreglo);
                cambios=false;
                for(i=salto; i < arreglo.length; i++)
                { 
                    if(arreglo[i-salto]>arreglo[i])
                    { 
                        aux=arreglo[i]; 
                        arreglo[i]=arreglo[i-salto];
                        arreglo[i-salto]=aux;
                        cambios=true;
                    }
                }
            }
            
        }
    }
    
    public static void quicksort(int arreglo[], int izq, int der)
    {
        int pivote=arreglo[izq]; // tomamos primer elemento como pivote
        int i=izq; // i realiza la búsqueda de izquierda a derecha
        int j=der; // j realiza la búsqueda de derecha a izquierda
        int aux;

        while(i<j){            // mientras no se crucen las búsquedas
           while(arreglo[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
           while(arreglo[j]>pivote) j--;         // busca elemento menor que pivote
           if (i<j) {                      // si no se han cruzado                      
               aux= arreglo[i];                  // los intercambia
               arreglo[i]=arreglo[j];
               arreglo[j]=aux;
           }
         }
         arreglo[izq]=arreglo[j]; // se coloca el pivote en su lugar de forma que tendremos
         arreglo[j]=pivote; // los menores a su izquierda y los mayores a su derecha
         if(izq<j-1)
            quicksort(arreglo,izq,j-1); // ordenamos subarray izquierdo
         if(j+1 <der)
            quicksort(arreglo,j+1,der); // ordenamos subarray derecho
    }
    
    public static void imprimirArreglo(int arreglo[])
    {
       for(int i = 0; i < arreglo.length; i++)
       {
            System.out.print(" " + arreglo[i]);
       }
       System.out.println("");
    }
    
    
}

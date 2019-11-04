/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebadelunamatias_;

import java.util.Arrays;
import javax.swing.JTextArea;

/**
 *
 * @author Matias
 */
public class Recursividad 
{
    public void Imprimir1(int x,JTextArea JT1)
    {
        
        if(x >0)
        {
            JT1.append(x + "\n");
            Imprimir1(x-1,JT1);
        }
    }
    
    public boolean Par(int numero) 
    {
        if (numero == 0) 
        {
            return true;
        } else 
        {
            
            return Impar(numero-1);
            
        }
    }
    
    public boolean Impar(int numero) 
    {
        if (numero == 0) {
            return false;
        } else 
        {
            
            return Par(numero-1);
        }
    }

      public int ElevarUnNumeroAunaPotencia(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * ElevarUnNumeroAunaPotencia(x, n - 1);
    }
      public int Sumar(int a)
      {
          if (a == 0) {
              return 0;
          }else{
              return a + Sumar(a-1);
          }
      }
      public int Multiplicar(int a, int b){
          if (b==0) {
              return 0;
          }else{
              return a+Multiplicar(a, (b-1));
          }
      }
      
      
      public int[] CargarVector (int[] array,int x)
      {
          for (int i = 0; i < array.length; i++) 
          {
            array[i] = x;
          } 
        return array;
      }
      
       public  int Factoria(int fact)
     {
      
         if(fact>0)
          {
               int valor=fact*Factoria(fact-1);
              return valor;
          }
         else
         {
             return 1;
         }  
     }
  
    public static String ImprimirLista(int[] array, int indice) 
    {
        if (indice == (array.length - 1)) {
            System.out.println(array[indice]);
        } else {
            System.out.println(Arrays.toString(array));
            ImprimirLista(array, indice + 1);
        }
        return Arrays.toString(array);
    }

    
    public String OrdenarMenorMayor(int canti,int[] vec) 
    {
        if (canti > 0) {
            for (int f = 0; f < canti - 1; f++) {
                if (vec[f] > vec[f + 1]) {
                    int aux = vec[f];
                    vec[f] = vec[f + 1];
                    vec[f + 1] = aux;
                }
            }
            OrdenarMenorMayor(canti - 1,vec);
        }
        return Arrays.toString(vec);
    }
    
    public String OrdenarMayorMenor(int canti,int[] vec) {
        if (canti > 0) {
            for (int f = 0; f < canti - 1; f++) {
                if (vec[f] < vec[f + 1]) {
                    int aux = vec[f];
                    vec[f] = vec[f + 1];
                    vec[f + 1] = aux;
                }
            }
            OrdenarMayorMenor(canti - 1,vec);
        }
        return Arrays.toString(vec);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author Leon
 */
public class Arboles {

        //Teoria Arbol Binario
        // mayor por derecha 
        // Menor por izquierda 
    
    public static void main(String[] args) {
        ArbolBinOrdenado arbol = new ArbolBinOrdenado();
        
        arbol.Insertar(10);
        arbol.Insertar(7);
        arbol.Insertar(5);
        arbol.Insertar(20);
        arbol.Insertar(12);
        arbol.Insertar(4);
        arbol.Insertar(1);
        
       arbol.ImprimirPreOrden();
     //arbol.ImprimirEntreOrden();
        
    }
    
}

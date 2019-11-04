package arboles;

import javax.swing.JTextArea;
public class ArbolBinOrdenado 
{

    class Nodo {

        int info;
        Nodo izq, der;
        
    }
    Nodo raiz;
    int Cantidad;
    int altura;

    public ArbolBinOrdenado() { // método constructor
        raiz = null;
    }
    
    public void Insertar(int info) {
    /*Método Insertar
    En este método Insertar. 
    Creamos un nodo y disponemos los punteros izq y der a null, guardamos la
    información que llega al método en el nodo.*/
    
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = info;
        nuevo.izq = null;
        nuevo.der = null;
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo anterior = null, reco;
            reco = raiz;
            while (reco != null) {
                anterior = reco;
                if (info < reco.info) {
                    reco = reco.izq;
                } else {
                    reco = reco.der;
                }
            }
            if (info < anterior.info) {
                anterior.izq = nuevo;
            } else {
                anterior.der = nuevo;
            }
        }
    }
    
    public int Existe(int Info) {
        
        Nodo Reco = raiz;
        while (Reco != null) {
            if (Reco.info == Info) {
                return 1;
            } else {
                if (Info > Reco.info) {
                    Reco = Reco.der;
                } else {
                    Reco = Reco.izq;
                }
            }
        }
        return 0;
    
    }
    
    public void ImprimirPreOrden() {
    /* Recorrido en Pre Orden
        Recorrido Pre-orden: El recorrido inicia en la Raíz 
        (visitando el nodo) y luego se recorre en pre-orden
        cada nodo del sub-árbol izquierdo y luego el subárbol derecho.   */
        
        System.out.println("Impresión Pre Orden: ");
        ImprimirPreOrden(raiz);
    }

    private void ImprimirPreOrden(Nodo Reco) {
        if (Reco != null) {
            
            System.out.println(Reco.info + "");
            
            ImprimirPreOrden(Reco.der);
            ImprimirPreOrden(Reco.izq);
            
        }
    }
    
    public void ImprimirEntreOrden()
    {
        System.out.println("Imprimir Entre Orden");
        ImprimirEntreOrden(raiz);
    }
    
    private void ImprimirEntreOrden(Nodo Reco)
    {
        if (Reco != null)
        {
            ImprimirEntreOrden(Reco.izq);
            System.out.println(Reco.info + " ");
            ImprimirEntreOrden(Reco.der);
        }
    }
    
    public void ImprimirPostOrden() {
    /*    Recorrido Pos-Orden
        Recorrido Pos-Orden: Se recorre el pos-orden cada uno de los 
        sub-árboles y al final se recorre la raíz.
        Ahora aplicaremos estos tres recorridos al árbol para 
        imprimir su información o contenido de los nodos. */
        
        
        System.out.println("Impresión Post Orden: ");
        ImprimirPostOrden(raiz);
    }

    private void ImprimirPostOrden(Nodo Reco) {
        if (Reco != null) {
            ImprimirPostOrden(Reco.izq);
            ImprimirPostOrden(Reco.der);
            System.out.print(Reco.info + " ");
        }
    }
    
    public int CantidadNodos() {
        Cantidad = 0;
        RecorrerCantidad(raiz);
        return Cantidad;
    }

    private void RecorrerCantidad(Nodo Reco) {
        if (Reco != null) {
            Cantidad++;
            RecorrerCantidad(Reco.izq);
            RecorrerCantidad(Reco.der);
        }
    }
    
    
    /*------------------------------------*/
    /*------------------------------------*/
    /*------------------------------------*/
    /*------------------------------------*/
    
    public void ImprimirPreOrden1 (JTextArea JTextArea1)
    {
        JTextArea1.append ("Imprimir PreOrder" + "\n");
        ImprimirPreOrden1(raiz , JTextArea1);
    }
    
    private void ImprimirPreOrden1 (Nodo Reco , JTextArea JTextArea1)
    {
        if (Reco != null) 
        {
            JTextArea1.append (Reco.info + " \n");
            ImprimirPreOrden1 ( Reco.izq , JTextArea1);
            ImprimirPreOrden1 ( Reco.der , JTextArea1);
        }
    }
    
    /*------------------------------------*/
    /*------------------------------------*/
    /*------------------------------------*/
    /*------------------------------------*/
    public void ImprimirEntreOrden1(JTextArea JTextArea1)
    {
        JTextArea1.append ("Imprimir EntreOrden" + "\n");
        ImprimirEntreOrden1(raiz , JTextArea1);
    }
    
    private void ImprimirEntreOrden1(Nodo Reco, JTextArea JTextArea1)
    {
        if (Reco != null)
        {
            ImprimirEntreOrden1(Reco.izq,JTextArea1);
            JTextArea1.append(Reco.info + " ");
            ImprimirEntreOrden1(Reco.der,JTextArea1);
        }
    }
    /*------------------------------------*/
    /*------------------------------------*/
    /*------------------------------------*/
    /*------------------------------------*/
    
    
     public void ImprimirPostOrden1(JTextArea JTextArea1) {
    
        JTextArea1.append ("Imprimir PosOrden" + "\n");
        ImprimirPostOrden1(raiz,JTextArea1);
    }

    private void ImprimirPostOrden1(Nodo Reco, JTextArea JTextArea1) {
        if (Reco != null) {
            ImprimirPostOrden1(Reco.izq,JTextArea1);
            ImprimirPostOrden1(Reco.der,JTextArea1);
            JTextArea1.append(Reco.info + " ");
        }
    }
    
      /*------------------------------------*/
    /*------------------------------------*/
    /*------------------------------------*/
    /*------------------------------------*/
    
    
    private void cantidad(Nodo reco) {
        if (reco!=null) {
            Cantidad++;
            cantidad(reco.izq);
            cantidad(reco.der);
        }
    }
    
    public int cantidad() {
        Cantidad=0;
        cantidad(raiz);
        return Cantidad;
    }
    
    private void cantidadNodosHoja(Nodo reco) {
        if (reco!=null) {
            if (reco.izq==null && reco.der==null)
                Cantidad++;
            cantidadNodosHoja(reco.izq);
            cantidadNodosHoja(reco.der);
        }
    }
    
    public int cantidadNodosHoja() {
        Cantidad=0;
        cantidadNodosHoja(raiz);
        return Cantidad;
    }
    
    public int mayorValorl() {
        if (raiz!=null) {
            Nodo reco=raiz;
            while (reco.der!=null)
                reco=reco.der;
            
            
            return reco.info;
        }
        return 0;
    }
    
    public int menorValorl() {
        if (raiz!=null) {
            Nodo reco=raiz;
            while (reco.izq!=null)
                reco=reco.izq;
            System.out.println("Mayor valor del árbol:"+ reco.info);
            
            return reco.info;
        }
        return 0;
    }
    
     private void retornarAltura (Nodo reco,int nivel)    {
        if (reco != null) {    
            retornarAltura (reco.izq,nivel+1);
            if (nivel>altura)
                altura=nivel;
            retornarAltura (reco.der,nivel+1);
        }
    }

    public  int retornarAltura () {
        altura=0;
        retornarAltura (raiz,1);
        return altura;
    }
    
    public void ImprimirSubArbDer()
    {
        if (raiz != null) 
        {
            System.out.println("Impresion SubArbol Derecho: ");
            ImprimirEntreOrden(raiz.der);
        }else
        {
            System.out.println("No existe SubArbol Derecho");
        }
    }
    
    void RecorrerAltura(Nodo Reco , int Nivel)
    {
        if (Reco != null)
        {
            if (Nivel > altura)
            {
                altura = Nivel;
            }
            RecorrerAltura (Reco.izq , Nivel + 1);
            RecorrerAltura (Reco.der , Nivel + 1);
        }
    }
    
    public int SubArbolMayor()
    {
        if (raiz != null)
        {
            altura = 1;
            RecorrerAltura(raiz.izq,1);
            int izq = altura;
            altura = 1;
            RecorrerAltura(raiz.der,1);
            int der = altura;
            if (izq > der)
            {
                return 1;
            }
            else
            {
                if (izq == der)
                {
                    return 0; // no hay arbol
                }
                else
                {
                    return 2;
                }
            }
        }
        else
        {
            return 0 ; //no hay arbol
        }
    }
    
    
    
    /*private Nodo BorrarInfo(Nodo Reco , int valor)
    {
        if (Existe(valor) == 0)
        {
            return null;
        }
        else
        {
            if (Reco.info == valor)
            {
                if (Reco.der == null && Reco.izq == null)
                {
                    raiz = null;
                    return Reco;
                }
                if (Reco.der == null)
                {
                    raiz = raiz.izq;
                    return Reco;
                }
                if (Reco.izq == null)
                {
                    raiz = raiz.der;
                    return Reco;
                }
                Reco.info = mayorValorl(Reco.der);
                Reco = Ajuste (Reco, Reco.izq,Reco);
                return Reco;
            }
        }
    }*/
    
    
    
    
    
    
    
}

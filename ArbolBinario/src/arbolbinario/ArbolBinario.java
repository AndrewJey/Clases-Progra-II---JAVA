/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author fmendez-as
 */
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol c = new Arbol();
        c.insertaNodo(1);
        c.insertaNodo(5);
        c.inorden(c.Raiz);
        c.tamaño(c.Raiz);
    }
    
}

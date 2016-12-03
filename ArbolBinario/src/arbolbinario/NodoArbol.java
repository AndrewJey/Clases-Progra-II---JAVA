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
public class NodoArbol {
        int dato;
	NodoArbol Hizq, Hder;
	//Constructores
	NodoArbol (int Elem)
        {
            dato = Elem;
            NodoArbol Hizq, Hder = null;
	}
	NodoArbol ()
        {
		NodoArbol Hizq, Hder = null;
	}
        public void insertar(int Elem)
        {
            if(Elem < dato)
            {
                if (Hizq == null)
                    Hizq = new NodoArbol(Elem);
                else
                    Hizq.insertar(Elem);
            }
            else
            {
                if (Elem > dato)
                {
                    if (Hder == null)
                        Hder = new NodoArbol(Elem);
                    else
                        Hder.insertar(Elem);
                }
            }
        }   
}

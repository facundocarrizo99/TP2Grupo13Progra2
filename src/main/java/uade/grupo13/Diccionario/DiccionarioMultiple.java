package uade.grupo13.Diccionario;

import uade.grupo13.Lista.Lista;
import uade.grupo13.Nodo.NodoClaveMultiple;
import uade.grupo13.Conjunto.Conjunto;
import uade.grupo13.Nodo.Nodo;

public class DiccionarioMultiple implements IDiccionarioMultiple {
    private NodoClaveMultiple primero;


    public void agregar(int clave, int valor) {
        NodoClaveMultiple nodo = buscarNodo(clave);
        if (nodo == null) {
            nodo = new NodoClaveMultiple(clave, new Lista());
            nodo.getValores().add(valor);
            nodo.setSiguiente(primero);
            primero = nodo;
        } else {
            nodo.getValores().add(valor);
        }
    }

    @Override
    public NodoClaveMultiple Nodo2NodoClave(int clave) {
        NodoClaveMultiple aux = primero;
        while (aux != null && aux.getClave() != clave) {
            aux = aux.getSiguiente();
        }
        return aux;
    }

    @Override
    public void eliminarNodo(int clave) {
        NodoClaveMultiple nodo = primero;
        NodoClaveMultiple anterior = null;
        while (nodo != null && nodo.getClave() != clave) {
            anterior = nodo;
            nodo = nodo.getSiguiente();
        }
        if (nodo != null) {
            if (anterior == null) {
                primero = nodo.getSiguiente();
            } else {
                anterior.setSiguiente(nodo.getSiguiente());
            }
        }
    }

    @Override
    public void eliminarValor(int clave, int valor) {
        NodoClaveMultiple nodo = buscarNodo(clave);
        while (nodo != null && nodo.getClave() != clave) {
            if (nodo.getValores() != null) {
                nodo.getValores().remove(valor);
            }
            nodo = nodo.getSiguiente();
        }

    }

    @Override
    public void eliminarValorEnNodo(NodoClaveMultiple nodo, int valor) {
        if (nodo.getValores() != null) {
            if (nodo.getValores().getInicio().getInfo() == valor) {
                nodo.getValores().setInicio(nodo.getValores().getInicio().getSig());
            } else {
                Nodo aux = nodo.getValores().getInicio();
                while (aux.getSig() != null) {
                    if (aux.getSig().getInfo() == valor) {
                        aux.setSig(aux.getSig().getSig());
                        break;
                    }
                    aux = aux.getSig();
                }
            }
        }
    }

    @Override
    public Conjunto recuperar(int clave) {
        NodoClaveMultiple nodo = Nodo2NodoClave(clave);
        Conjunto conjunto = new Conjunto();
        conjunto.inicializar();
        if (nodo != null) {
            Nodo aux = nodo.getValores().getInicio();
            while (aux != null) {
                conjunto.agregar(aux.getInfo());
                aux = aux.getSig();
            }
        }
        return conjunto;
    }

    public NodoClaveMultiple buscarNodo(int clave) {
        NodoClaveMultiple nodo = primero;
        while (nodo != null && nodo.getClave() != clave) {
            nodo = nodo.getSiguiente();
        }
        return nodo;
    }


    @Override
    public Conjunto claves() {
        Conjunto conjunto = new Conjunto();
        conjunto.inicializar();
        NodoClaveMultiple nodo = primero;
        while (nodo != null) {
            conjunto.agregar(nodo.getClave());
            nodo = nodo.getSiguiente();
        }
        return conjunto;
    }

}


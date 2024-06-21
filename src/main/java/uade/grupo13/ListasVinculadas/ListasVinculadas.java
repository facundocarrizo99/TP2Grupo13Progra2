package uade.grupo13.ListasVinculadas;

import uade.grupo13.Nodo.Nodo;
import uade.grupo13.Nodo.NodoVinculado;

public class ListasVinculadas implements IListasVinculadas{
    private NodoVinculado node;
    private int size; //cantidad de nodos padre que existen

    public ListasVinculadas() {
        this.node = null;
        this.size = 0;
    }
    
    
    public void addNode(int value) {
        Nodo nodoAgregado = new Nodo(value);
        NodoVinculado nuevo = new NodoVinculado(nodoAgregado, null);

        if (node == null) {
            node = nuevo;
        } else {
            NodoVinculado aux = node;
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(nuevo);
        }
        size++;
    }

    
    public void removeNode(NodoVinculado value) {
        /**
        if (node != null) {
            if (node.getInfo() == value) {
                node = node.getSig();
                size--;
            } else {
                Nodo aux = node;
                while (aux.getSig() != null) {
                    if (aux.getSig().getInfo() == value) {
                        aux.setSig(aux.getSig().getSig());
                        size--;
                        break;
                    }
                    aux.setSig(aux.getSig());
                }
            }
        }
         */
    }

    
    public void removeFirstOfValue(int value) {
        /**
        if (node != null) {
            if (node.getInfo() == value) {
                node = node.getSig();
                size--;
            } else {
                Nodo aux = node;
                while (aux.getSig() != null) {
                    while (aux.getInfo().getSig() != null)
                        if (aux.getInfo().getSig().getInfo() == value) {
                            aux.setSig(aux.getSig().getSig());
                            size--;
                            break;
                        }
                    aux.setSig(aux.getSig());
                }
            }
        }

         */
    }

    
    public void addToNode(int value, int position) {

    }

    
    public void addValueAtPositionAtNode(int value, int position, int node) {

    }

    
    public void print() {

    }

    
    public int size() {
        return 0;
    }

    
    public boolean isEmpty() {
        return false;
    }

    
    public boolean contains(int value) {
        return false;
    }

    
    public int get(int position) {
        return 0;
    }

    
    public int indexOf(int value) {
        return 0;
    }

    
    public void removeAllOf(int value) {

    }
}
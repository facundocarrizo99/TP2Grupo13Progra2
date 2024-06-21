package uade.grupo13.Nodo;

import uade.grupo13.Lista.Lista;

public class NodoClaveMultiple{
    private int clave;
    private Lista valores;
    private NodoClaveMultiple siguiente;

    public NodoClaveMultiple(int clave, Lista valores){
        this.clave = clave;
        this.valores = valores;
        this.siguiente = null;
    }

    public int getClave(){
        return clave;
    }

    public void setClave(int clave){
        this.clave = clave;
    }

    public Lista getValores() {
        return valores;
    }

    public void setValores(Lista valores) {
        this.valores = valores;
    }

    public NodoClaveMultiple getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(NodoClaveMultiple siguiente){
        this.siguiente = siguiente;
    }

}

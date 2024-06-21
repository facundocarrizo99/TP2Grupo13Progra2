package uade.grupo13.Cola;

import uade.grupo13.Nodo.Nodo;

public class Cola implements ICola{

    private Nodo primero;
    private Nodo ultimo;

    public Cola() {
        this.primero = null;
        this.ultimo = null;
    }

    public void acolar(int info) {
        Nodo nuevo = new Nodo(info);
        if (this.esVacia()) {
            this.primero = nuevo;
        } else {
            this.ultimo.setSig(nuevo);
        }
        this.ultimo = nuevo;
    }

    public int desacolar() {
        int info = this.primero.getInfo();
        this.primero = this.primero.getSig();
        if (this.primero == null) {
            this.ultimo = null;
        }
        return info;
    }

    public int primero() {
        return this.primero.getInfo();
    }

    public boolean esVacia() {
        return this.primero == null;
    }

    public void vaciar() {
        this.primero = null;
        this.ultimo = null;
    }

}

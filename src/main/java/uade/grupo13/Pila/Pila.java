package uade.grupo13.Pila;

import uade.grupo13.Nodo.Nodo;

public class Pila implements IPila{
    private Nodo tope;

    public Pila() {
        this.tope = null;
    }

    public void apilar(int info) {
        this.tope = new Nodo(info, this.tope);
    }

    public int desapilar() {
        int info = this.tope.getInfo();
        this.tope = this.tope.getSig();
        return info;
    }

    public int tope() {
        return this.tope.getInfo();
    }

    public boolean esVacia() {
        return this.tope == null;
    }

    public void vaciar() {
        this.tope = null;
    }
}

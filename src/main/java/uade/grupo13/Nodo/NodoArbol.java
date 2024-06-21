package uade.grupo13.Nodo;

import uade.grupo13.Arbol.IArbol;

public class NodoArbol {
    private int info;
    private IArbol hijoIzq;
    private IArbol hijoDer;

    public NodoArbol(int info, IArbol hijoIzq, IArbol hijoDer) {
        this.info = info;
        this.hijoIzq = hijoIzq;
        this.hijoDer = hijoDer;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public IArbol getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(IArbol hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public IArbol getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(IArbol hijoDer) {
        this.hijoDer = hijoDer;
    }
}

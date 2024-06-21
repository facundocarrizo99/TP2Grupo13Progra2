package uade.grupo13.Arbol;

import uade.grupo13.Nodo.NodoArbol;

public class Arbol implements IArbol {
    private NodoArbol raiz;

    public int raiz() {
        return this.raiz.getInfo();
    }

    public IArbol hijoDer(int n) {
        return new Arbol(this.raiz.getHijoDer());
    }

    public IArbol hijoIzq(int n) {
        return new Arbol(this.raiz.getHijoIzq());
    }

    public boolean estaVacio() {
        return this.raiz == null;
    }

    public void inicializar() {
        this.raiz = null;
    }

    public void agregarElem(int n) {
        this.raiz = agregarElemRec(n, this.raiz);
    }

    private NodoArbol agregarElemRec(int n, NodoArbol raiz) {
        if (raiz == null) {
            return new NodoArbol(n, null, null);
        } else if (n < raiz.getInfo()) {
            raiz.setHijoIzq(agregarElemRec(n, raiz.getHijoIzq()));
        } else if (n > raiz.getInfo()) {
            raiz.setHijoDer(agregarElemRec(n, raiz.getHijoDer()));
        }
        return raiz;
    }

    public void eliminarElem(int n) {
        if (raiz != null) {
            65
            if (raiz.getInfo() == n && raiz.getHijoIzq().estaVacio() &&
                    raiz.getHijoDer().estaVacio()) {
                raiz = null;
            } else if (raiz.getInfo() == n && !raiz.getHijoIzq().estaVacio()) {
                raiz.getInfo() = this.mayor(raiz.getHijoIzq());
                raiz.getHijoIzq().eliminarElem(raiz.getInfo());
            } else if (raiz.getInfo() == n && raiz.getHijoIzq().estaVacio()) {
                raiz.getInfo() = this.menor(raiz.getHijoDer());
                raiz.getHijoDer().eliminarElem(raiz.getInfo());
            } else if (raiz.getInfo() < n) {
                raiz.getHijoDer().eliminarElem(n);
            } else {
                raiz.getHijoIzq().eliminarElem(n);
            }
        }
    }

    private int mayor(NodoArbol a) {
        if (a.getHijoDer().estaVacio())
            return a.getInfo();
        else
            return mayor(a.getHijoDer());
    }

    private int menor(NodoArbol a) {
        if (a.getHijoIzq().estaVacio())
            return a.getInfo();
        else
            return menor(a.getHijoIzq());
    }
}
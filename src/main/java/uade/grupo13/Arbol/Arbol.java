package uade.grupo13.Arbol;

import uade.grupo13.Nodo.NodoArbol;

public class Arbol implements IArbol {
    private NodoArbol raiz;

    public int raiz() {
        return this.raiz.getInfo();
    }

    public IArbol hijoDer() {
        return raiz.getHijoDer();
    }

    public IArbol hijoIzq() {
        return raiz.getHijoIzq();
    }

    public boolean estaVacio() {
        return this.raiz == null;
    }

    public void inicializar() {
        this.raiz = null;
    }

    public void agregarElem(int n) {
        if (raiz == null) {
            raiz = new NodoArbol(n, new Arbol(), new Arbol());
        } else if (n < raiz.getInfo()) {
            raiz.getHijoIzq().agregarElem(n);
        } else if (n > raiz.getInfo()) {
            raiz.getHijoDer().agregarElem(n);
        }
    }

    public void eliminarElem(int n) {
        if (raiz != null) {
            if (raiz.getInfo() == n && raiz.getHijoIzq().estaVacio() &&
                    raiz.getHijoDer().estaVacio()) {
                raiz = null;
            } else if (raiz.getInfo() == n && !raiz.getHijoIzq().estaVacio()) {
                raiz.setInfo(this.mayor(raiz.getHijoIzq()));
                raiz.getHijoIzq().eliminarElem(raiz.getInfo());
            } else if (raiz.getInfo() == n && raiz.getHijoIzq().estaVacio()) {
                raiz.setInfo(this.menor(raiz.getHijoDer()));
                raiz.getHijoDer().eliminarElem(raiz.getInfo());
            } else if (raiz.getInfo() < n) {
                raiz.getHijoDer().eliminarElem(n);
            } else {
                raiz.getHijoIzq().eliminarElem(n);
            }
        }
    }

    private int mayor(IArbol a) {
        if (a.hijoDer().estaVacio())
            return a.raiz();
        else
            return mayor(a.hijoDer());
    }

    private int menor(IArbol a) {
        if (a.hijoIzq().estaVacio())
            return a.raiz();
        else
            return menor(a.hijoIzq());
    }
}
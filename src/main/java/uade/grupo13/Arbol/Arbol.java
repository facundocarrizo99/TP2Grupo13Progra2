package uade.grupo13.Arbol;

import uade.grupo13.Lista.Lista;
import uade.grupo13.Nodo.NodoArbol;

import java.util.List;
import java.util.Objects;

public class Arbol implements IArbol {
    private NodoArbol raiz;

    public int raiz() {
        return this.raiz.getInfo();
    }

    public IArbol hijoDer() {
        if (Objects.isNull(raiz.getHijoDer())){
            return null;
        }
        return raiz.getHijoDer();
    }

    public IArbol hijoIzq() {
        if (Objects.isNull(raiz.getHijoIzq())){
            return null;
        }
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
    //          Metodos de Arbol TP part 2      //

    //  Metodo que devuelve una lista de las hojas de un arbol dado //
    public static Lista listaHojas(Arbol arbol){
        if (Objects.isNull(arbol)){
            return new Lista(); // Devolver una lista vacia para un arbol vacio
        }

        Lista lista = new Lista();
        lista = arbol.ListarHojas(lista ,arbol);
        return lista;
    }

    //  Metodo auxiliar para el metodo de listaHojas  //
    private Lista ListarHojas(Lista lista, IArbol arbol){
        IArbol hIzq = arbol.hijoIzq();
        IArbol hDer = arbol.hijoDer();
        if (hIzq.estaVacio() && hDer.estaVacio()){
            lista.add(arbol.raiz());//Si los dos hijos son nulos es una hoja se lista y devulve, es el caso base
        } else if (hIzq.estaVacio()) {
            ListarHojas(lista, arbol.hijoDer());
        } else if (hDer.estaVacio()){
            ListarHojas(lista, arbol.hijoIzq());
        }else {
            ListarHojas(lista, hIzq);
            ListarHojas(lista, hDer);
        }
        return lista;
    }

    //  Metodo para devolver una lista de los numero mayores a un N dado de un arbol dado  //
    public static Lista mayoresA(int n, Arbol arbol){
        if (Objects.isNull(arbol)){
            return new Lista(); // Devolver una lista vacia para un arbol vacio
        }

        Lista lista = new Lista();
        lista = arbol.auxMayoresA(lista ,arbol, n);
        return lista;
    }
    // Metodo auxiliar para implementar la recursividad en el metodo de MayoresA  //
    private Lista auxMayoresA(Lista l, IArbol arbol, int n){
        if (arbol.hijoIzq().estaVacio() && arbol.hijoDer().estaVacio()) {
            if (n < arbol.raiz()) {
                l.add(arbol.raiz());
            }
        }else if (arbol.raiz() > n) {
            l.add(arbol.raiz());
            if (!arbol.hijoIzq().estaVacio()) {
                auxMayoresA(l, arbol.hijoIzq(), n);
            }
            if (!arbol.hijoDer().estaVacio()) {
                auxMayoresA(l, arbol.hijoDer(), n);
            }
        }else if (arbol.raiz() < n){
            if (!arbol.hijoDer().estaVacio()) {
                auxMayoresA(l, arbol.hijoDer(), n);
            }
        }
        return l;
    }
}
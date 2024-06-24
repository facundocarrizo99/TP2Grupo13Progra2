package uade.grupo13.Diccionario;

import uade.grupo13.Lista.Lista;
import uade.grupo13.Nodo.NodoClave;

public class Diccionario implements IDiccionario{
    private NodoClave inicio;
    private int cantidad;

    public Diccionario() {
        this.inicio = null;
        this.cantidad = 0;
    }

    public void agregar(int clave, int valor) {
        NodoClave nuevo = new NodoClave(clave, valor, null);
        if (this.inicio == null) {
            this.inicio = nuevo;
        } else {
            NodoClave aux = this.inicio;
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(nuevo);
        }
        this.cantidad++;
    }

    public void eliminar(int clave) {
        if (this.inicio != null) {
            if (this.inicio.getClave() == clave) {
                this.inicio = this.inicio.getSig();
                this.cantidad--;
            } else {
                NodoClave aux = this.inicio;
                while (aux.getSig() != null) {
                    if (aux.getSig().getClave() == clave) {
                        aux.setSig(aux.getSig().getSig());
                        this.cantidad--;
                        break;
                    }
                    aux = aux.getSig();
                }
            }
        }
    }

    public int buscar(int clave) {
        NodoClave aux = this.inicio;
        while (aux != null) {
            if (aux.getClave() == clave) {
                return aux.getValor();
            }
            aux = aux.getSig();
        }
        return 0;
    }

    public boolean existe(int clave) {
        NodoClave aux = this.inicio;
        while (aux != null) {
            if (aux.getClave() == clave) {
                return true;
            }
            aux = aux.getSig();
        }
        return false;
    }

    public int cantidad() {
        return this.cantidad;
    }

    public void vaciar() {
        this.inicio = null;
        this.cantidad = 0;
    }

    public String listar() {
        String lista = "";
        NodoClave aux = this.inicio;
        while (aux != null) {
            lista += aux.getClave() + " - " + aux.getValor() + "\n";
            aux = aux.getSig();
        }
        return lista;
    }

    //          Metodo Ejercicio Diccionarios           //

    //  Devuelve en una lista las claves que sean pares de un diccionario dado  //
    public static Lista clavesPares (Diccionario dic) {
        if (dic.inicio == null){// Si envian un diccionario vacio sale del metodo
            return new Lista();
        }
        //  Inicializa lista y puntero  //
        Lista lista = new Lista();
        NodoClave aux = dic.inicio;

        //  Recorrer y listar las claves pares  //
         while (aux != null) {
             if (aux.getClave() % 2 == 0){
                 lista.add(aux.getClave());
             }
             aux = aux.getSig();
         }
        return lista; // se devuelve la lista, puede estar inicializada y vacia //
    }

    //  Devuelve una Lista con las valores mayores a un "n" dado de un diccionario  //
    public static Lista valoresMayoresA(int n, Diccionario dic){
        if (dic.inicio == null){// Si envian un diccionario vacio sale del metodo
            return new Lista();
        }
        //  Inicializa lista y puntero  //
        Lista lista = new Lista();
        NodoClave aux = dic.inicio;

        //  Recorrer y listar valores mayores a n  //
        while (aux != null){
            if (aux.getValor() > n) {
                lista.add(aux.getValor());
            }
            aux = aux.getSig();
        }
        return lista;  // se devuelve la lista, puede estar inicializada y vacia //
    }
}

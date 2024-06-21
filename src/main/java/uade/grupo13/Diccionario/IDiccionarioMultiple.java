package uade.grupo13.Diccionario;

import uade.grupo13.Conjunto.Conjunto;
import uade.grupo13.Nodo.NodoClaveMultiple;

import java.util.Set;

public interface IDiccionarioMultiple {
    void agregar(int clave, int valor);
    NodoClaveMultiple Nodo2NodoClave(int clave);
    void eliminarNodo(int clave);
    void eliminarValor(int clave, int valor);
    void eliminarValorEnNodo(NodoClaveMultiple nodo, int valor);
    Conjunto recuperar(int clave);
    Conjunto claves();
    NodoClaveMultiple buscarNodo(int clave);

}

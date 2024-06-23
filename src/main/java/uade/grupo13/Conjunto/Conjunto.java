package uade.grupo13.Conjunto;

import uade.grupo13.Nodo.Nodo;

public class Conjunto implements IConjunto {
    private Nodo primero;

    public void inicializar() {
        this.primero = null;
    }

    public Conjunto() {
        this.primero = null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo aux = primero;
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(nuevo);
        }
    }

    public void eliminar(int valor) {
        if (pertenece(valor)) {
            if (primero.getInfo() == valor) {
                primero = primero.getSig();
            } else {
                Nodo aux = primero;
                while (aux.getSig().getInfo() != valor) {
                    aux = aux.getSig();
                }
                aux.setSig(aux.getSig().getSig());
            }
        }
    }

    public boolean pertenece(int valor) {
        Nodo aux = primero;
        while (aux != null) {
            if (aux.getInfo() == valor) {
                return true;
            }
            aux = aux.getSig();
        }
        return false;
    }

    public int cardinal() {
        int contador = 0;
        Nodo aux = primero;
        while (aux != null) {
            contador++;
            aux = aux.getSig();
        }
        return contador;
    }

    public boolean esVacio() {
        return primero == null;
    }


}

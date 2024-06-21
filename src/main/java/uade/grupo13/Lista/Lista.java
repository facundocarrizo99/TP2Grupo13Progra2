package uade.grupo13.Lista;

import uade.grupo13.Nodo.Nodo;

public class Lista implements ILista{
    private Nodo inicio;
    private int size;

    public Lista() {
        this.inicio = null;
        this.size = 0;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
    public void add(int value) {
        Nodo nuevo = new Nodo(value);

        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(nuevo);
        }
        size++;
    }

    public void remove(int value) {
        if (inicio != null) {
            if (inicio.getInfo() == value) {
                inicio = inicio.getSig();
                size--;
            } else {
                Nodo aux = inicio;
                while (aux.getSig() != null) {
                    if (aux.getSig().getInfo() == value) {
                        aux.setSig(aux.getSig().getSig());
                        size--;
                        break;
                    }
                    aux.setSig(aux.getSig());
                }
            }
        }
    }

    public void insert(int value, int position) {
        if (position >= 0 && position <= size) {
            Nodo nuevo = new Nodo(value);
            if (position == 0) {
                nuevo.setSig(inicio);
                inicio = nuevo;
            } else {
                Nodo aux = inicio;
                for (int i = 0; i < position - 1; i++) {
                    aux = aux.getSig();
                }
                nuevo.setSig(aux.getSig());
                aux.setSig(nuevo);
            }
            size++;
        }
    }

    public int get(int position) {
        if (position >= 0 && position < size) {
            Nodo aux = inicio;
            for (int i = 0; i < position; i++) {
                aux = aux.getSig();
            }
            return aux.getInfo();
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

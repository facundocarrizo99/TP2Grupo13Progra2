package uade.grupo13.Cola;

import uade.grupo13.Nodo.NodoPrioridad;

public class ColaPrioridad implements IColaPrioridad {
    private NodoPrioridad frente;
    private NodoPrioridad fin;

    public ColaPrioridad() {
        frente = null;
        fin = null;
    }

    public void acolarPrioridad(int info, int prioridad) {
        NodoPrioridad nuevo = new NodoPrioridad(info, prioridad, null);
        if (esVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            if (frente.getPrioridad() < prioridad) {
                nuevo.setSig(frente);
                frente = nuevo;
            } else {
                NodoPrioridad aux = frente;
                while (aux.getSig() != null && aux.getSig().getPrioridad() >= prioridad) {
                    aux = aux.getSig();
                }
                nuevo.setSig(aux.getSig());
                aux.setSig(nuevo);
                if (nuevo.getSig() == null) {
                    fin = nuevo;
                }
            }
        }
    }

    public int desacolar() {
        int info = frente.getInfo();
        frente = frente.getSig();
        if (frente == null) {
            fin = null;
        }
        return info;
    }

    public int primero() {
        return frente.getInfo();
    }

    public boolean esVacia() {
        return frente == null;
    }

    public void vaciar() {
        frente = null;
        fin = null;
    }
}

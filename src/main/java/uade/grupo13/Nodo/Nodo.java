package uade.grupo13.Nodo;

public class Nodo {
    private int info;
    private Nodo sig;

    public Nodo(int info) {
        this.info = info;
        this.sig = null;
    }

    public Nodo(int info, Nodo sig) {
        this.info = info;
        this.sig = sig;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}

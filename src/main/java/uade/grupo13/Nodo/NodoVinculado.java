package uade.grupo13.Nodo;

public class NodoVinculado {
    private Nodo info;
    private NodoVinculado sig;

    public NodoVinculado(Nodo info, NodoVinculado sig) {
        this.info = info;
        this.sig = sig;
    }

    public Nodo getInfo() {
        return info;
    }

    public void setInfo(Nodo info) {
        this.info = info;
    }

    public NodoVinculado getSig() {
        return sig;
    }

    public void setSig(NodoVinculado sig) {
        this.sig = sig;
    }
}

package uade.grupo13.Nodo;

public class NodoClave {
    private int clave;
    private int valor;
    private NodoClave sig;

    public NodoClave(int clave, int valor, NodoClave sig) {
        this.clave = clave;
        this.valor = valor;
        this.sig = sig;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public NodoClave getSig() {
        return sig;
    }

    public void setSig(NodoClave sig) {
        this.sig = sig;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
package uade.grupo13.Nodo;

public class NodoPrioridad {
    private int info;
    private int prioridad;
    private NodoPrioridad sig;


    public NodoPrioridad(int info, int prioridad, NodoPrioridad sig) {
        this.info = info;
        this.prioridad = prioridad;
        this.sig = sig;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public NodoPrioridad getSig() {
        return sig;
    }

    public void setSig(NodoPrioridad sig) {
        this.sig = sig;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
}

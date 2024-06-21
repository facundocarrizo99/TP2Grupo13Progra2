package uade.grupo13.Cola;

public interface IColaPrioridad {
    void acolarPrioridad(int info, int prioridad);
    int desacolar();
    int primero();
    boolean esVacia();
    void vaciar();
}

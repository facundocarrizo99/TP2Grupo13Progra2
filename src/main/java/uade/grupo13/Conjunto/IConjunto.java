package uade.grupo13.Conjunto;

public interface IConjunto {
    void agregar(int valor);
    void eliminar(int valor);
    boolean pertenece(int valor);
    int cardinal();
    boolean esVacio();

}

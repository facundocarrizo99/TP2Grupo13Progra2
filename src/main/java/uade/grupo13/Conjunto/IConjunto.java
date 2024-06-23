package uade.grupo13.Conjunto;
import uade.grupo13.Nodo.Nodo;
public interface IConjunto {
    void agregar(int valor);
    void eliminar(int valor);
    boolean pertenece(int valor);
    int cardinal();
    boolean esVacio();


}

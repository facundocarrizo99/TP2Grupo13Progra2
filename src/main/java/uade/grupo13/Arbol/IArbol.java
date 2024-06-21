package uade.grupo13.Arbol;

public interface IArbol {
    int raiz();
    IArbol hijoDer(int n);
    IArbol hijoIzq(int n);
    boolean estaVacio();
    void inicializar();
    void agregarElem(int n);
    void eliminarElem(int n);
}

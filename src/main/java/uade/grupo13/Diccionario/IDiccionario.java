package uade.grupo13.Diccionario;

public interface IDiccionario {
    void agregar(int clave, int valor);
    void eliminar(int clave);
    int buscar(int clave);
    boolean existe(int clave);
    int cantidad();
    void vaciar();
    String listar();
}

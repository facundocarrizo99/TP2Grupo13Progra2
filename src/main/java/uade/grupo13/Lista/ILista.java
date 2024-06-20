package uade.grupo13.Lista;

public interface ILista {
    void add(int value);
    void remove(int value);
    void insert(int value, int position);
    int get(int position);
    int size();
    boolean isEmpty();
}

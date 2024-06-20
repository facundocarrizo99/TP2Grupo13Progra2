package uade.grupo13.ListasVinculadas;

public interface IListasVinculadas {
    void add(int value);
    void remove(int value);
    void insert(int value, int position);
    void print();
    int size();
    boolean isEmpty();
    boolean contains(int value);
    int get(int position);
    int indexOf(int value);
    void removeAllOf(int value);

}

package Generics;

public class GenericList<T> {

    private T[] array;
    private int count;

    public GenericList(int size) {
        this.array = (T[])new Object[size];
    }

    public void add(T element) {
        array[count++] = element;
    }

    public T get(int index) {
        return array[index];
    }

}

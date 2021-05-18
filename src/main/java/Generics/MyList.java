package Generics;

public class MyList {

    int[] array;
    private int count;

    public MyList(int size){
        this.array = new int[size];

    }

    public void add(int item) {
        array[count++] = item;
    }

    public int get(int index) {
        return array[index];
    }

}

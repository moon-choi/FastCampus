package fc.java.course2.model2;
//배열처럼 동작하는 클래스
public class ObjectArr<T> {
    private T[] arr;
    private int size;

    public ObjectArr(int size) {
        arr = (T[]) new Object[size];
    }

    public void set(int index, T value){
        arr[index] = value;
        size++;
    }

    public T get(int index) {
        return arr[index];
    }

    public int size(){
        return size;
    }
}

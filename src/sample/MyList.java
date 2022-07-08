package sample;


public class MyList <T> implements Cloneable {
    String text;
    Object[] arr = new Object[1];

    public void add(T t) {
        Object[] newArr = new Object[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = t;
        arr = newArr;
    }

    public T getByIndex(int index) {
        return (T) arr[index];
    }
}

package ceng.eskisehir.edu.tr.list;

public class OneWayNode<T> {

    private OneWayNode<T> next;

    private T data;

    public OneWayNode(T data) {
        this.data = data;
        this.next = null;
    }

    public OneWayNode<T> getNext() {
        return next;
    }

    public void setNext(OneWayNode<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

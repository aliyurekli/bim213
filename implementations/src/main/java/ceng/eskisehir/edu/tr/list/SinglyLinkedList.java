package ceng.eskisehir.edu.tr.list;

public class SinglyLinkedList<T> {

    private OneWayNode<T> head;

    private OneWayNode<T> tail;

    private int numberOfNodes;

    public SinglyLinkedList() {
        head = tail = null;
        numberOfNodes = 0;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void add(T value) {
        OneWayNode<T> temp = new OneWayNode<>(value);

        if (head == null) {
            head = temp;
            tail = temp;
        }
        else {
            tail.setNext(temp);
            tail = temp;
        }

        numberOfNodes ++;
    }

    public void add(int position, T value) {
        if (position < 0 || numberOfNodes < position) throw new IndexOutOfBoundsException();

        OneWayNode<T> temp = new OneWayNode<>(value);

        if (position == 0) {
            if (isEmpty()) {
                head = temp;
                tail = temp;
            }
            else {
                temp.setNext(head);
                head = temp;
            }
        }
        else if (position == numberOfNodes) {
            tail.setNext(temp);
            tail = temp;
        }
        else {
            OneWayNode<T> current = head, previous = null;

            int i = 0;
            while (i < position) {
                previous = current;
                current = current.getNext();

                i ++;
            }

            previous.setNext(temp);
            temp.setNext(current);
        }

        numberOfNodes += 1;
    }

    public int indexOf(T value) {
        int i = 0;
        OneWayNode<T> temp = head;

        while (temp != null) {
            if (temp.getData().equals(value)) return i;

            i ++;
            temp = temp.getNext();
        }

        return -1;
    }

    public T first() {
        return isEmpty() ? null : head.getData();
    }

    public T last() {
        return isEmpty() ? null : tail.getData();
    }

    public T get(int position) {
        if (position < 0 || numberOfNodes <= position) throw new IndexOutOfBoundsException();

        int i = 0;
        OneWayNode<T> temp = head;

        while (temp != null) {
            if (position == i) return temp.getData();

            i ++;
            temp = temp.getNext();
        }

        return null;
    }

    public int size() {
        return numberOfNodes;
    }
}


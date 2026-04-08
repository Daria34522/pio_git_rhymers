package edu.kis.vh.nursery.list;

/**
 * Klasa obsługująca listę dwukierunkową
 * Przechowuje ostatni element oraz wartość pod zmienną i
 */
public class IntLinkedList {

    private Node last;
    private int i;

    /**
     * Metoda przyjmuje wartość
     * Jeżeli lista była pusta wstawia wartość pod last za poocą konstruktora klasy Node
     * W przeciwnym razie tworzy następny element i jako ostatni ustawia nowo utwrzony
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    /**
     * Metoda sprawdzająca czy lista jest pusta
     * Zwraca true jeżeli tak jest w przeciwnym przypadku zwraca false
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Metoda zwracajaca czy metoda jest pełna
     * Zawsze zwraca że nie jest pełna
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Metoda zwracająca ostatni element listy
     * Gdy lista jest pusta zwracany jest kod błędu -1
     */
    public int top() {
        if (isEmpty())
            return -1;
        return last.value;
    }

    /**
     * Metoda zwracająca ostatni element i usuwająca ją z listy
     * Jeżeli lista jest pusta zwracany jest kod błędu -1
     */
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}

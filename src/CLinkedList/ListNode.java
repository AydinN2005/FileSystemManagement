package CLinkedList;

public class ListNode<T> {
    //    list fields
    private T data;
    private ListNode<T> next;

    //    constructure
    public ListNode(T data) {
        this.data = data;
    }

    // getters and setters
    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    public ListNode<T> getNext() {
        return this.next;
    }
}

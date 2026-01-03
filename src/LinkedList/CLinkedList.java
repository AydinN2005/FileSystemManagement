package LinkedList;

import CExceptions.EmptyException;
import helper.Constants;

public class CLinkedList<T> {
    //    list field
    private ListNode<T> head;

    //    actions
    public void Add(Constants.ListConstants actionType, T data) throws IllegalArgumentException {
        ListNode<T> newNode = new ListNode<>(data);
        if (head == null) {
            head = newNode;
        } else {
            switch (actionType) {
                case ADD_FIRST -> {
                    newNode.setNext(head);
                    head.setPrev(newNode);
                    head = newNode;
                    break;
                }
                case ADD_LAST -> {
                    var curr = head;
                    while (curr.getNext() != null) {
                        curr = curr.getNext();
                    }
                    curr.setNext(newNode);
                    newNode.setPrev(curr);
                }
                default -> {
                    throw new IllegalArgumentException("Insert right action type .");
                }
            }
        }
    }

    public void AddToNth(T data, int Nth) throws IllegalArgumentException {
        if (head == null) {
            throw new IllegalArgumentException("List is empty you cannot insert number of elements .");
        }
        ListNode<T> newNode = new ListNode<>(data);
        var curr = head;
        for (int i = 0; i < Nth; i++) {
            curr = curr.getNext();
        }
        var temp = curr.getNext();
        newNode.setNext(temp);
        temp.setPrev(newNode);
        newNode.setPrev(curr);
        curr.setNext(newNode);
    }

    public <dataType> void DeleteWithData(dataType data) throws EmptyException {
        if (head == null)
            throw new EmptyException("List is empty .");
        
    }

    public void Delete(Constants.ListConstants actionType) throws EmptyException {
        if (head == null) {
            throw new EmptyException("List is empty .");
        } else {
            switch (actionType) {
                case DELETE_FIRST -> {
                    head = head.getNext();
                    break;
                }
                case DELETE_LAST -> {
                    var curr = head;
                    while (curr.getNext().getNext() != null)
                        curr = curr.getNext();
                    curr.setNext(null);
                    break;
                }
                default -> {
                    throw new IllegalArgumentException("Insert right action type .");
                }
            }
        }
    }
}

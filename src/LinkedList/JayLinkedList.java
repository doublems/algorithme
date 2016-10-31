package LinkedList;

import java.util.*;

/**
 * Created by jerry on 2016-10-31.
 * 너무 많다. 책에서 주장하는 핵심 리스트 종주와 CRUD 를 기준으로 구현을 하겠다.
 */
public class JayLinkedList<T> implements List, JaysInterface {
    private Node <T>firstNode;

    public Node<T> getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node<T> firstNode) {
        this.firstNode = firstNode;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        T data = (T) o;
        Node tempNode = new Node(data);
        tempNode.setNextNode(this.firstNode);
        this.firstNode = tempNode;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    public boolean remove() {
        this.firstNode = this.firstNode.getNextNode();
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        this.firstNode = null;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    //노드구현
    private class Node<T>{
        private Node nextNode;
        private T Data;

        public Node() {
        }

        public Node(T data) {
            Data = data;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public T getData() {
            return Data;
        }

        public void setData(T data) {
            Data = data;
        }
    }
}

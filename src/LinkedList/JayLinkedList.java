package LinkedList;

import java.util.*;

/**
 * Created by jerry on 2016-10-31.
 * 너무 많다. 책에서 주장하는 핵심 리스트 종주와 CRUD 를 기준으로 구현을 하겠다.
 */
public class JayLinkedList<T> implements List, JaysInterface {
    private Node <T>firstNode;
    private int size = 0;

    public Node<T> getFirstNode() {
        return firstNode;
    }

    public JayLinkedList() {
        System.out.println("링크드리스트 생성됨");
    }

    public void setFirstNode(Node<T> firstNode) {
        this.firstNode = firstNode;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if(size != 0){
        return false;}
        else return true;
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
        System.out.println("add 실행됨, 개체:"+o+"입니다.");
        T data = (T) o;
        Node tempNode = new Node(data);
        tempNode.setNextNode(this.firstNode);
        this.firstNode = tempNode;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Boolean returnValue = false;
        T data = (T) o;
        Node tempNodeBefore = null;
        Node tempNodeNow = firstNode;
        while (tempNodeNow.getNextNode()!=null){
            //지우는 항목
            if(tempNodeNow.getData().equals(data)){
                //A(이전) - B(현재) - C(다음) tempNodeBefore에 연결되어 있는 A의 다음 링크를 C로 연결한다.
                Node temp = tempNodeNow.getNextNode();
                tempNodeBefore.setNextNode(temp);
                returnValue = true;
                break;}
            tempNodeBefore = tempNodeNow;
            tempNodeNow = tempNodeNow.getNextNode();
        }
        return returnValue;
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
        System.out.println("Get 실행됨, 인덱스:"+index+"입니다.");
        int tempIndex = 0;
        Node tempNode = firstNode;
        while(tempIndex != index){
            tempNode = tempNode.nextNode;
            tempIndex++;
        }
        return tempNode.Data;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {
        T data = (T) element;
        Node tempNode = new Node(element);

        if(this.getFirstNode()!=null){
            tempNode.setNextNode(this.getFirstNode());
        }
        firstNode = tempNode;
        size++;
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
            System.out.println("Node 만들어짐");
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

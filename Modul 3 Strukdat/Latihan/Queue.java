package Latihan;
//Latihan 2
import java.util.NoSuchElementException;

public class Queue {
    private class Node {
        String data;
        Node next;
        
        Node(String data) {
            this.data = data;
        }
    }
    
    private Node head;
    private Node tail;
    
    public void add(String data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }
    
    public String element() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.data;
    }
    
    public boolean offer(String data) {
        add(data);
        return true;
    }
    
    public String peek() {
        if (head == null) {
            return null;
        }
        return head.data;
    }
    
    public String poll() {
        String data = peek();
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }
    
    public String remove() {
        String data = element();
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add("Java");
        q.add("DotNet");
        q.offer("PHP");
        q.offer("HTML");
        System.out.println("remove: " + q.remove());
        System.out.println("element: " + q.element());
        System.out.println("poll: " + q.poll());
        System.out.println("peek: " + q.peek());
    }
}
package Latihan;
//Latihan 1
public class Stack {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public Stack (int a) {
        maxSize = 5;
        stackArray = new String [maxSize];
        top = -1;
    }

    public void push (String j) {
		stackArray[++top] = j;
	}
	
	public String pop() {
		return stackArray[top--];
	}
	
	public String peek () {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize-1);
	}
	
	public int search(Object o){
        if (isEmpty()) {
            System.out.println("Stack empty");
            return -1;
        }
        for (int i = 0; i <= top; i++) {
            if (stackArray[i].equals(o)) {
                return top - i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Stack st = new Stack(10);
        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");

        System.out.println("Next : " + st.peek());
        st.push("Raya");
        System.out.println(st.pop());
        st.push("!");

        System.out.println("Index Aku : " + st.search("Aku"));

        while (!st.isEmpty()) {
            st.pop();

            if (st.isEmpty()) {
                System.out.println("True");
            }
        }
    }
}
package review.object.stack;

public class Stack {
Node top;

    Stack() {
        top = null;
    }

    void push(int n) {
       Node temp = new Node();
       temp.data = n;
       temp.link = top;
       top = temp;
    }

    void pop() {
        if (top != null) {
            Node temp = top;
            top = top.link;
            temp = null;
        } else {
            System.out.println("Top is empty, nothing to pop");
        }
    }

    void display() {
        Node temp = top;
        while (temp!= null) {
            System.out.println("Node :"+ temp+" , Data: "+temp.data);
            temp = temp.link;
        }
    }

    public static void main(String[] args) {
        Stack main = new Stack();
        main.push(1);
        main.push(4);
        main.push(5);
        main.pop();
        main.pop();
        main.pop();
        main.pop();

        main.display();
    }

}

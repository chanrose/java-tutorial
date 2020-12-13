package review.Queue;

public class Queue {
    Node front;
    Node back;

    Queue() {
        front = null;
        back = null;
    }

    void push(int n) {
     System.out.println("New Push of "+n);
     Node temp = new Node();
     temp.data = n;
     temp.link = null;

     if (front == null) { // Front and back is null
         front = temp;
         back = front;
     } else {
        back.link = temp;
        back = temp;
     }
     System.out.println("Front Node is: "+front+", Front.link: "+front.link+" Front.data is: "+front.data);
     System.out.println("Back Node is: "+back+" Back.link: "+back.link+", Back.data is: "+back.data);
    }

    void pop() {
        if (front != null) {
            Node temp = front;
            front = front.link;
            temp = null;
        } else {
            System.out.println("Nothing to pop, push some queue!");
        }
    }

    void display() {
        Node temp = front;
        System.out.println("Temp Node is "+temp+" Front Node is: "+front);
        if (temp == null) System.out.println("Nothing to display, push some queue!");
        while (temp!=null) {
            System.out.println("Front Node: "+temp+" Data: "+temp.data);
            temp = temp.link;
        }

    }

    public static void main(String[] args) {
        Queue main = new Queue();
        main.push(2);
        main.push(9);
        main.display();
        main.push(0);
        main.push(1);
        main.display();
    }
}

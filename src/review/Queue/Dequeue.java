package review.Queue;

public class Dequeue {
Node front;
Node rear;

    Dequeue() {
        front = null;
        rear = null;
    }

    void pushR(int n) {
        Node temp = new Node();
        temp.data = n;

        if (front == null) {
            front = temp;
            rear = front;
        } else {
            rear.link = temp;
            rear = temp;
        }
    }

    void pushF(int n) {
        Node temp = new Node();
        temp.data = n;

        if (front == null) pushR(n);
        else {
            temp.link = front;
            front = temp;
        }

    }

    void popF() {
        Node temp = new Node();
        temp = front;

        if (front!=null) {
            front = front.link;
            temp = null;
        } else {
            System.out.println("Nothing to display, push some more");
        }
    }

    void popR() {
        Node temp = front;
        Node traced = rear;
        System.out.println("Rear is: "+rear);
        while (traced!=null) {
            if (temp.link == rear) {
                rear = temp;
                rear.link = null;
                traced = null;

            } else {
                temp = temp.link;
            }

        }
    }

    void display() {
        Node temp = new Node();
        temp = front;
        if (temp == null) {
            System.out.println("Nothing to display, push some more");
        }
        while (temp != null) {
            System.out.println("Data: "+temp.data);
            temp = temp.link;
        }
    }

    public static void main(String[] args) {
        Dequeue obj = new Dequeue();
        obj.pushR(2);
        obj.pushR(1);
        obj.pushR(7);
        obj.pushF(9);
        obj.popR();
        obj.display();
    }
}

/*
package review.DoubleLinkedList;


public class DoubleLinkedList {
    Node front;
    Node rear;
    Node temp;
    int insertPosition;

    DoubleLinkedList() {
        front = null;
        rear = null;
        insertPosition = 1;
    }

    void insertion(char position, int data) {
        temp = new Node();
        temp.data = data;
        if (front == null) {
            insertF();
            rear = front;
        } else {

            switch (position) {
                case 'F' : insertF(); break;
                case 'R' : insertR(); break;
                case 'P' : {insertAt(insertPosition); break;

                }
            }
        }
    }

    void insertF() {
        front.lLink = temp;
        temp.rLink = front;
        front = temp;
    }

    void insertR() {
        rear.rLink = temp;
        temp.lLink = rear;
        rear = temp;
        rear.rLink = null;
    }

    void insertAt(int position) {
        rePosition();
        Node traced = front;
        boolean changed = false;
        if (position == 1) insertF();
        else {
            while (changed == false && front!=null && rear.position > position) {
                if (traced.rLink.position == position) {

                    changed = true;
                } else traced = traced.rLink;
            }
        }
        rePosition();
    }

    void display() {
        System.out.println("Listing LinkedList: ");
        rePosition();
        temp = front;
        while (temp!=null) {
            System.out.println("Position: "+temp.position+", Data: "+temp.data);
            temp = temp.rLink;
        }
    }

    void rePosition() {
        temp = front;
        int position = 1;
        while (temp!=null) {
            temp.position = position++;
            temp = temp.rLink;
        }
    }

    void deletion(char position) {
        temp = new Node();
        if (front == null) System.out.println("Nothing to delete because it is empty");
        else {
            switch (position) {
                case 'F': deleteF(); break;
                case 'R': deleteR(); break;
            }
        }
    }

    void deleteF() {
        temp = front.rLink;
        temp.lLink = null;
        front = null;
        front = temp;

    }

    void deleteR() {
        Node traced = front;
        boolean deleted = false;
        if (rear == front) {
            deleteF();
        } else {
            while (deleted == false && front!=null) {
                if (traced.rLink == rear)  {
                    traced.rLink = null;
                    rear = traced;
                    deleted = true;
                } else {
                    traced = traced.link;
                }
            }
        }
    }

    void deleteP(int position) {
        review.LinkedList.Node traced = front;
        boolean deleted = false;

        if (position==1) {
            deleteF();
        } else if (position>rear.position) {
            System.out.println("Cannot be deleted nonexistence object");
        } else if (position == rear.position) {
            deleteR();
        }
        while (deleted == false  && front!=null && rear.position > position) {
            if (traced.link.position == position) {
                traced.link = traced.link.link;
                deleted = true;
            } else {
                traced = traced.link;
            }
        }
    }

    void deleteV(int value) {
        review.LinkedList.Node traced = front;
        boolean deleted = false;
        if (front.data == value) {
            deleteF();
        } else if (rear.data == value) {
            deleteR();
        } else {

            while (deleted == false && traced != null) {
                if (traced.link.data == value) {
                    temp = traced.link;
                    traced.link = traced.link.link;
                    temp = null;
                    deleted = true;
                } else {
                    traced = traced.link;
                }
            }
        }
    }

    void deletion(char type, int value) {
        temp = new Node();
        switch (type) {
            case 'P': deleteP(value);
            case 'V': deleteV(value);
        }
    }


    public static void main(String[] args) {

    }
}
*/

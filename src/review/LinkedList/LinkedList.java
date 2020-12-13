package review.LinkedList;

public class LinkedList {
    Node front;
    Node rear;
    Node temp;
    int insertPosition;

    LinkedList() {
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
        temp.link = front;
        front = temp;
    }

    void insertR() {
        rear.link = temp;
        rear = rear.link;
        rear.link = null;
    }

    void insertAt(int position) {
        rePosition();
        Node traced = front;
        boolean changed = false;
        if (position == 1) insertF();
        else {
            while (changed == false && front!=null && rear.position > position) {
                if (traced.link.position == position) {
                    temp.link = traced.link;
                    traced.link = temp;
                    changed = true;
                } else traced = traced.link;
            }
        }
        rePosition();
    }

    void display() {
        System.out.println("Listing LinkedList: ");
        rePosition();
        Node temp = front;
        while (temp!=null) {
            System.out.println("Position: "+temp.position+", Data: "+temp.data);
            temp = temp.link;
        }
    }

    void rePosition() {
        Node temp = front;
        int position = 1;
        while (temp!=null) {
            temp.position = position++;
            temp = temp.link;
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
        temp = front.link;
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
                if (traced.link == rear)  {
                    traced.link = null;
                    rear = traced;
                    deleted = true;
                } else {
                    traced = traced.link;
                }
            }
        }
    }

    void deleteP(int position) {
        Node traced = front;
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
        Node traced = front;
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
        LinkedList obj = new LinkedList();

        obj.insertion('F', 1);
        obj.insertion('F', 4);
        obj.insertion('F', 9);
        obj.insertion('R', 5);
        obj.display();
        obj.insertPosition = 10;
        obj.insertion('P', 7);
        obj.display();
        obj.deletion('V', 4);


        obj.display();
    }

}

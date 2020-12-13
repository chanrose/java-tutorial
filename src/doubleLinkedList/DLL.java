package doubleLinkedList;


public class DLL {
Node temp;
Node front;
Node rear;
int i;

    DLL() {
        front = null;
        rear = null;
        i = 0;
    }

    void insert(int n) {
        temp = new Node();
        // System.out.println("Object : "+temp+" with data: "+n);

        temp.data = n;
        temp.rLink = null;
        temp.rLink = null;

        if (front == null && rear == null) {
            front = temp;
            rear = temp;
        } else {
            rear.rLink = temp;
            temp.lLink = rear;
            rear = temp;
            rear.rLink = null;
        }
       /* System.out.println("First Loop "+i+", Front's data: = "+front.data+", lLink: "+front.lLink+", rLink: "+front.rLink);
        System.out.println("First Loop "+i+", Rear's data: = "+rear.data+", lLink: "+rear.lLink+", rLink: "+rear.rLink);
        i++;*/

    }

    void delete() {
        if (front != null) {

            System.out.println("Deleting an Object of "+front.data);
            // This method uses for deleting the front object only.
            temp = new Node();
            temp = front;
            front = front.rLink;
            temp = null;
        } else {
            System.out.println("There is no element left to delete.");
        }

    }

    void delete(int n) {
        // This method uses to delete any object with specified object's data
        boolean foundEle = false;
        Node trav = new Node();
        temp = new Node();
        temp = front;
        trav = front;

        while (trav!=null && foundEle == false) {
            if (trav.data == n) {
                System.out.println("Traverse reached target");
                if (trav.lLink == null && trav.rLink !=null) {
                    System.out.println("Null on L-Link, and Sth at R-Link");
                    // When the there is nothing on the left but something at the right
                    temp = front;
                    front = front.rLink;
                    temp = null;
                } else if (trav.lLink != null && trav.rLink == null) {
                    System.out.println("Null on R-Link, and Sth at L-Link");
                    // When there is nothing on the right but something at the left
                    temp = rear;
                    rear = temp.lLink;
                    rear.rLink = null;
                    temp = null;
                } else {
                    temp = trav;
                    trav.lLink.rLink = trav.rLink;
                    trav.rLink.lLink = trav.lLink;
                    temp = null;
                }
                foundEle = true;
            } else {
                trav = trav.rLink;
            }
        }
    }

    void display() {
        // This method displays all the objects
        temp = new Node();
        temp = front;
        if (temp != null) {
            System.out.println("\nDisplaying Double linked List: ");
            while (temp!=null) {
                System.out.println("Obj data: "+temp.data);
                temp = temp.rLink;
            }
        } else {
            System.out.println("There is no elements to display!");
        }

    }

    public static void main(String[] args) {
        DLL obj = new DLL();
        obj.insert(5);
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.display();

        // Delete Front Object
        obj.delete();
        obj.display();

        // Insert an new Object;
        obj.insert(5);
        obj.display();

        // Delete an specific object from object's data
        obj.delete(5);
        obj.delete(2);
        obj.display();
    }

}

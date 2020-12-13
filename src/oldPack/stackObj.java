package oldPack;

public class stackObj {
    static int length;
    int data;
    static int link;

    stackObj() {
        link++;
    }
    static void setLength(int objLen) {
        length = objLen;
    }
    void push(int num) {

        if (link<=length) {
            data = num;
            System.out.println("Link: "+link+" data: "+data);

        } else {
            System.out.println("You have reached the maximum of "+length);
        }
    }

    void pop() {

    }

    void display() {
        System.out.println("Data "+data+" from index of "+link);
    }

    public static void main(String[] args) {
        // Set the limit len of obj
        int limit = 5;
        setLength(limit);
        System.out.println("Length: "+length);

        // Create an array of Obj
        System.out.println("Set the created obj of "+length);
        stackObj obj[] = new stackObj[limit];
        obj[0] = new stackObj();
        obj[1] = new stackObj();
        obj[0].push(2);







    }
}

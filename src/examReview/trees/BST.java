package examReview.trees;

public class BST {

    public void inorder(Node node) {
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    public void preorder(Node node) {
        if (node == null) {
            return;
        }

        inorder(node.right);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public Node insert(Node node, int value) {
        if (node == null) {
            return createNewNode(value);
        }
        if (value < node.data) {
            node.left = insert(node.left, value);
        } else if (value > node.data) {
            node.right = insert(node.right, value);

        }

        return node;
    }

    public Node createNewNode(int value) {
        Node root = new Node();
        root.data = value;
        root.left = null;
        root.right = null;
        return root;
    }

    public static void main(String[] args) {
        BST obj = new BST();
        Node root = null;
        root = obj.insert(root, 8);
        root = obj.insert(root, 3);
        root =  obj.insert(root, 6);
        root = obj.insert(root, 10);
        root = obj.insert(root, 4);
        root = obj.insert(root, 7);
        root = obj.insert(root, 1);
        root = obj.insert(root, 14);
        root = obj.insert(root, 13);
        System.out.println("Printing Inorder: ");
        obj.inorder(root);

        System.out.println("");
        System.out.println("Printing Preorder: ");
        obj.preorder(root);
    }
}

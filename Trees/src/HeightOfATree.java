public class HeightOfATree {

    public static int height(Node root) {
        int height = 0;

        if (root == null) return -1;
        else {
            int lHeight = height(root.left);
            int rHeight = height(root.right);

            if (lHeight > rHeight) return lHeight + 1;
            else return rHeight + 1;
        }
    }
}

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

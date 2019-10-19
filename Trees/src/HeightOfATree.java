import Model.*;

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

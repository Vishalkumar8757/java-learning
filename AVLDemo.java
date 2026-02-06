class AVLDemo {

    class Node {

        int data;
        Node left;
        Node right;
        int height;

        public Node(int data) {
            this.data = data;
            height = 1;
        }

    }
  Node root=null;

    int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            return root.height;
        }
    }

    //get Max
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    Node rightRotate(Node y) { //Right Rotate subtree rooted with y
        Node x = y.left;
        Node T2 = x.right;

        //perform Rotation
        x.right = y;
        y.left = T2;
        //update height
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    Node LefttRotate(Node x) { //Left Rotate subtree rooted with x
        Node y = x.right;
        Node T2 = y.left;

        //perform Rotation
        y.left = x;
        x.right = T2;
        //update height
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);

    }

    Node insert(Node node, int key) {
        if (node == null) {
            System.out.println("First Node Inserted");
            return new Node(key);
        }
       
        if (key < node.data) {
            System.out.println("Left");
            node.left = insert(node.left, key);

        } else if (key > node.data) {
               System.out.println("Left");
            node.right = insert(node.right, key);
        } else {
            return node;
        }

        //update height
        node.height = 1 + max(height(node.left), height(node.right));
        //Get Balance Factor
        int balance = getBalance(node);
        // Balance the tree
        //LL case
        if (balance > 1 && key < node.left.data) {
            return rightRotate(node);
        }

        //RR case
        if (balance < -1 && key > node.right.data) {
            return LefttRotate(node);
        }
        //LR case
        if (balance > 1 && key > node.left.data) {
            node.left = LefttRotate(node.left);
            return rightRotate(node);
        }
        //RL Case
        if (balance < -1 && key < node.right.data) {
            node.right = rightRotate(node.right);
            return LefttRotate(node);
        }
        return node;
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print("====>" + root.data);
        inOrder(root.right);
    }

    public static void main(String[] args) {

      AVLDemo tree=new AVLDemo();
      int keys[]={10,20,30,40,50,25};
      for(int k:keys){
          tree.root=tree.insert(tree.root, k);
      }
     
        System.out.print("Print Data After Inserting in AVL Tree ");
       tree.inOrder(tree.root);
    }
}
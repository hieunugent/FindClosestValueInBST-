package mypackage;

public class BST{
  class Node{
    int value;
    Node right;
    Node left;
    Node(int value){
      this.value = value;
      left = right = null;
    }
  }
  Node root;

  public BST(){
    root = null;
  }

    public void insert(int value){
    root = insertRec(root, value);
  }

  Node insertRec(Node root, int value){
     if(root == null){
       root = new Node(value);
       return root;
     }
     if (value < root.value){
       root.left = insertRec(root.left, value);
     }
     else if (value > root.value){
       root.right = insertRec(root.right, value);
     }
     return root;
  }
  public void inorder()  {
       inorderRec(root);
    }

  void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.value);
            inorderRec(root.right);
        }
    }
}

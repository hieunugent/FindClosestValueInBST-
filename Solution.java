import mypackage.BST;

class Solution{
  public static int findClosestValueInBST(BST tree, int target){
    return findClosestValueInBST(tree, target, Double.MAX_VALUE);
  }
  public static int findClosestValueInBST(BST tree, int target, double closest){
    BST current = tree;
    while(current != null){
      if(Math.abs(closest - target) > Math.abs(target - current.value)){
        closest = current.value;
      }
      if (target > current.value){
        current = current.right;
      }
      else if(target < current.value){
        current = current.left;
      }
      else{
        break;
      }
    }
    return (int) closest;
  }
  static class BST{
    public int value;
    public BST left;
    public BST right;

    public BST(int value){
      this.value = value;
    }
  }


}

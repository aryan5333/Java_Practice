package binarytree;
import java.util.*;


public class BinaryTree {
    private int[] tree;

    public BinaryTree(int [] intValues){
        this.tree = intValues;
        // print array contents after initialization
        System.out.println(Arrays.toString(this.tree));
    }
    private int left(int i){
        return 2*i+1;
    }
    private int right(int i){
        return 2*i+2;
    }
    private int parent(int i){
        return (i-1)/2;
    }
    private void preOrderTraversal(int nodeNo){
        if(nodeNo <this.tree.length){
        System.out.println(this.tree[nodeNo]);
        preOrderTraversal(this.left(nodeNo));
        preOrderTraversal(this.right(nodeNo));
        }
    }
    public void preOrderTraversal(){
        preOrderTraversal(0);

    }

}
class Application{
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(new int[]{10,20,30,40,50,60,70,80});
        tree.preOrderTraversal();
    }
    System.out.println(Book);
}


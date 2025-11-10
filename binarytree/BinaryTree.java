package binarytree;
import java.util.*;


public class BinaryTree {
    private int[] arr = new int[]{10,20,30,40,50,60};

    public BinaryTree(int n){
        this.arr = new int[n];
        // print array contents after initialization
        System.out.println(Arrays.toString(this.arr));
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

}


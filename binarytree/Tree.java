package binarytree;

public class Tree {
    public static void main(String[] args) {
        class BinaryTree{

            static class node{
                public int data;
                public node left;
                public node right;

                public node(int data){
                    this.data=data;
                    this.left=null;
                    this.right=null;
                }
            }
            public node root;

            public BinaryTree(){
                root=new node(10);
                root.left=new node(20);
                root.right=new node(30);
                root.left.left=new node(40);
                root.left.right=new node(50);
                root.right.left=new node(60);
                root.right.right=new node(70);
            }
        }
        
    }
    
}

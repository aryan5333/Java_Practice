package binarysearchtree;

public class BST2 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data > val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public static boolean Search(Node root,int key) {
        if(root==null){
            return false;
        }
        if(root.data>key){
            return Search(root.left,key);
        }
        else if(root.data==key){
            return true;
        }
        else{
            return Search(root.right,key);
        }
    }
    public static  Node delete(Node root,int val){
        if(root.data>val){
            root.left=delete(root.left,val);
        }
        else if(root.data<val){
            root.right=delete(root.right,val);
        }
        else{
            //case 1
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            //case 3
            Node IS=InorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }
    public static Node InorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    

public static void main(String[]args){
    int val[]={8,5,3,1,4,6,10,11,14};
    Node root=null;
    for(int i=0;i<val.length;i++){
        root=insert(root,val[i]);
    }
    inorder(root);
    System.out.println();

    /*if(Search(root,1)){
        System.out.println("found");
    }
    else{
        System.out.println("not found");
    }*/
    delete(root,10);
    inorder(root);
 }
}

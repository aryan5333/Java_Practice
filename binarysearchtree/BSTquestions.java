package binarysearchtree;
import java.util.*;

public class BSTquestions {
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
        else if(root.data>val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }

    public static boolean Search(Node root,int val){
        if(root==null){
            return false;

        }
        if(root.data>val){
            return Search(root.left,val);
        }
        else if(root.data==val){
            return true;
        }
        else{
            return Search(root.right,val);
        }

    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public static Node delete(Node root,int key){
        if(root==null){
            return null;
        }
        if(root.data>key){
            root.left=delete(root.left,key);
        }
        else if(root.data<key){
            root.right=delete(root.right,key);
        }
        else{
            //case1
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case3
            Node IS=InorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
            return root;
        }
        return root;
    }

    public static Node InorderSuccessor(Node root){
        if(root==null){
            return null;
        }
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    /*public static void PrintInRange(Node root,int X,int Y){
        if(root==null){
            return;
        }
        if(root.data>=X && root.data<=Y){
            PrintInRange(root.left,X,Y);
            System.out.println(root.data+" ");
            PrintInRange(root.right,X,Y);
        }
        else if(root.data>=X){
            PrintInRange(root.left,X,Y);
        }
        else{
            PrintInRange(root.right,X,Y);
        }
    }*/
     public static void printPath(ArrayList<Integer>path){
    for(int i=0;i<path.size();i++){
        System.out.println(path.get(i)+" ");
    }
    System.out.println();
   }
   public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
    if(root==null){
        return;
    }
    path.add(root.data);
    if(root.left==null && root.right==null){
        printPath(path);
    }
    else{
        printRoot2Leaf(root.left,path);
        printRoot2Leaf(root.right,path);
    }
    path.remove(path.size()-1);

   }
   
    
    public static void main(String[] args) {
        int values[]={10,2,15,8,6,13,20,5};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        System.out.println(Search(root,20));
        System.out.println(Search(root,8));
        System.out.println(Search(root,25));

        /*delete(root,15);
        inorder(root);*/
        //PrintInRange(root,8,15);
        printRoot2Leaf(root,new ArrayList<>());
    }
}


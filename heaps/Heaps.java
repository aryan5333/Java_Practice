package heaps;
import java.util.*;

public class Heaps {
    public List<Integer>tree;

    public Heaps(){
        this.tree=new ArrayList<>();
    }
    public void insertion(int data){
        System.out.println("Inserting"+data);
        this.tree.add(data);
        this.balance(this.tree.size()-1);
        for(int i=0;i<this.tree.size();i++){
            System.out.println(this.tree.get(i)+" ");
        }
        System.out.println();
    }
    public void balance(int index){
        int parentIndex=(index-1)/2;
        while(index>0 && index<this.tree.size() && this.tree.get(index)<this.tree.get(parentIndex)){
            swapNodes(index,parentIndex);
            index=parentIndex;
            parentIndex=(index-1)/2;
        }

    }
    private void swapNodes(int i,int j){
        System.out.println("Swapping"+this.tree.get(i)+"and"+this.tree.get(i));
        int temp=this.tree.get(i);
        this.tree.set(i,this.tree.get(j));
        this.tree.set(j,temp);
    }
    public static void main(String[] args) {
        Heaps minHeaps=new Heaps();
        minHeaps.insertion(10);
        minHeaps.insertion(7);
        minHeaps.insertion(11);
        minHeaps.insertion(6);
    }
    
}

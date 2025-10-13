package recurse;

public class Recursion {
    void printNums(int n){
        if(n==1){
            System.out.print("1 /n");
            return;
        }
        System.out.print( n+" ");
        printNums(n-1);
    }
    public static void main(String[]args){
        Recursion r=new Recursion();
        r.printNums(100);
        return;
    }
    
}

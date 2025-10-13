package recurse;

public class Recursion2 {
    int Factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*Factorial(n-1);
        }

    }
    public static void main(String[] args) {
        Recursion2 r = new Recursion2();
        System.out.println(r.Factorial(8));
        return;
    }
    
}

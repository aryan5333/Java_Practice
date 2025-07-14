import java.lang.*;

class MyArray<T>
{
    private T[] A = (T[]) new Object[10];
    private int length = 0;

    public void Append(T v)
    {
        A[length++] = v;
    }
    public void Display()
    {
        for(int i = 0; i < length; i++)
        {
            System.out.println(A[i]);
        }
    }
}

    public class genericsExample
    {

       
        
        public static void main(String[] args) {
            MyArray<Integer> ma = new MyArray<>();
            ma.Append(10);
            ma.Append(20);
            ma.Append(30);
            ma.append(30);

            ma.Display();
        }
    }





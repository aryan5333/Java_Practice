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
 public class genericMethod
  {
  static<E> void show(E[]list)
        {
            for(E x:list)
            {
                System.out.println(x);
            }
        }
        public static void main(String[] args) {
            show(new String[]{"go","bye","hello"});
            show(new Integer[]{10,20,30});

        }
    }
    






    //public class genericMethod(this is the wildcard in generic method)
    /*{

      static void fun(MyArray<? super number>Obj)
      {
        Obj.Display();
      }
      public static void main(String[] args) {
        MyArray<String>ma=new MyArray<>();
        ma.Append("ji");
        ma.Append("hello");

        MyArray<Integer>ma2=new MyArray<>();
        ma2.Append(10);
        ma2.Append(20);

        fun(ma);
        fun(ma2);

          
      }
           
        }*/



    





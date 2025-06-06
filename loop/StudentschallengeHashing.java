import java.io.*;
import java.lang.*;
import java.util.*;

class Accounts implements Serializable
{
    String name;
    Double Accountno;
    Double balance;

    Accounts(){}

    Accounts(String name,double acc,double b)
    {
        Accountno=acc;
        name=name;
        balance=b;
    }
    public String toString()
    {
        return "Account No:"+Accountno+"\nname:"+name+"\nBalance:"+balance+"\n";
    }

}

public class StudentschallengeHashing
{
    public static void main(String[] args) throws Exception
        {
            Scanner sc=new Scanner(System.in);
            Accounts acc=null;
            HashMap<Integer,Accounts> hm=new HashMap<>();

            try{
                FileInputStream fis=new FileInputStream("Accounts.txt");
                ObjectInputStream ois=new ObjectInputStream(fis);

                int count=ois.readInt();
                for(int i=0;i<count;i++)
                {
                    acc=(Accounts)ois.readObject();
                    System.out.println(acc);
                    hm.put(acc.Accountno.intValue(), acc);

                }
                fis.close();
                ois.close();
            }catch(Exception e)
            {

            }

             FileOutputStream fos=new FileOutputStream("Accounts.txt");
             ObjectOutputStream oos=new ObjectOutputStream(fos);

             System.out.println("Menu");
             int choice = 0;
             String accno, name;
             double balance;

             do
             {
                System.out.println("1.create Account");
                System.out.println("2.Delete Account");
                System.out.println("3.view Account");
                System.out.println("4.view all Account");
                System.out.println("5.Save Account");
                System.out.println("6.Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch(choice)
                {
                    case 1:
                        System.out.println("Enter the Details Accno, Name, balance");
                        accno = sc.nextLine();
                        name = sc.nextLine();
                        balance = sc.nextDouble();
                        sc.nextLine(); // consume newline
                        acc = new Accounts(name, Double.parseDouble(accno), balance);
                        hm.put(Integer.parseInt(accno), acc);
                        System.out.println("Account created for " + name);
                        break;

                    case 2:
                        System.out.println("Enter Accno");
                        accno = sc.nextLine();
                        hm.remove(Integer.parseInt(accno));
                        System.out.println("Account deleted.");
                        break;

                    case 3:
                        System.out.println("Enter Accno");
                        accno = sc.nextLine();
                        Accounts found = hm.get(Integer.parseInt(accno));
                        if (found != null) {
                            System.out.println(found);
                        } else {
                            System.out.println("Account not found.");
                        }
                        break;

                    case 4:
                        for (Accounts a : hm.values()) {
                            System.out.println(a);
                        }
                        break;

                    case 5:
                        oos.writeInt(hm.size());
                        for (Accounts a : hm.values()) {
                            oos.writeObject(a);
                        }
                        oos.flush();
                        System.out.println("Accounts saved.");
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
             } while (choice != 6);

             
            
        }
       


    }

    

    

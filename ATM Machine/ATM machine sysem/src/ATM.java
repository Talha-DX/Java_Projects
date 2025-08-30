import java.util.*;

class Creat_Acc 

{

    String name;
    int CNIC;
    double Amount;
    int Pass;
    boolean f;

    Creat_Acc(double Amount) 
    {
        this.Amount = Amount;
    }

    Scanner sp = new Scanner(System.in);

    void Acc() 
    {

        if (!f) 
        {

            System.out.println("Your Name:");
            this.name = sp.nextLine();
            System.out.println("Your CNIC:");
            this.CNIC = sp.nextInt();
            System.out.println("Set Password:");
            this.Pass = sp.nextInt();
            f = true;

        } else 
        {
            System.out.print("Your Already Have Account");

        }
    }

    void Withdrawal() {
        if (!f) {
            System.out.println("You don't have an Account");
        } else {
            System.out.print("Enter How much amount you want to Withdrawal.");
            double With = sp.nextDouble();
            Amount -= With;
            System.out.print("After Adding cash ---> " + Amount);
        }
    }

    void Deposit() {
        if (!f) {
            System.out.println("You don't have an Account");
        } else {
            System.out.println("Enter How much amount you want to Deposit.");
            double dep = sp.nextInt();
            Amount += dep;
            System.out.print("After Deposit cash ---> " + Amount);
        }
    }

    void exit() {
        System.out.println("Machine closing....");
    }
   
}

public class ATM 
{
    public static void main(String[] args) {

        int i;
        Scanner sq = new Scanner(System.in);
        System.out.println("Enter the deposit amount:");
        double in_am = sq.nextDouble();
        Creat_Acc c1 = new Creat_Acc(in_am);

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("...Welcome to ATM Machine...");
            System.out.println("1: Create an Account");
            System.out.println("2: Withdrawal Cash");
            System.out.println("3: Deposit Cash");
            System.out.println("4: Exit");

            System.out.print("Enter Your Choice:");
            i = sc.nextInt();

            switch (i) {
                case 1:
                    c1.Acc();
                    break;
                case 2:
                    c1.Withdrawal();
                    break;
                case 3:
                    c1.Deposit();
                    break;
                case 4:
                    c1.exit();
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }

        } while (i != 4);
        System.out.println("Thanks for chosing us.");
        sq.close();
        sc.close();
    }
}

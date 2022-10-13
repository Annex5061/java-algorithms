import java.util.*;

class RockPaperScissors
{
    public static void print(int cc)
    {
        if(cc==1)
        {
            System.out.println("Computer choice is Rock");
        }
        else if(cc==2)
        {
            System.out.println("Computer choice is Scissors");
        }
        else if(cc==3)
        {
            System.out.println("Computer choice is Paper");
        }
    }
    
    public static boolean check(int uc1)
    {
        boolean flag;
        if(uc1 == 1 || uc1==2 || uc1==3)
        {
            flag=true;
        }
        else
        {
            flag=false;
        }
        return flag;
    }
    public static void main(String[] args)
    {
        System.out.println("Choose :\n1 for Rock\n2 for Scissors\n3 for Paper");
        Random rm = new Random();
        Scanner sc = new Scanner(System.in);
        int uc = sc.nextInt();
        boolean flag1 = check(uc);

        if(!flag1)
        {
            System.out.println("Enter Right Choice");
        }
        else
        {
            int cc = rm.nextInt(1,4);
            print(cc);

            if(cc==uc)
            {
                System.out.println("It's a draw");
            }
            else if((cc==2 && uc==1) || (cc==3 && uc==2) || (uc==3 && cc==1))
            {
                System.out.println("You won");
            }
            else
            {
                System.out.println("Computer won");
            }
        }
    }
}
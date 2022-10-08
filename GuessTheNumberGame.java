import java.util.*;

class GuessTheNumberGame
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();

        int cc = rm.nextInt(1,100);
        int uc,count=0;
        System.out.println("Guess the number : ");

        for(;;)
        {
            uc = sc.nextInt();
            count++;
            
            if(uc==cc)
            {
                System.out.println("You guessed the number in "+count+" turns.");
                break;
            }
            else if(uc<cc)
            {
                System.out.println("This number is less than computer's.\nTry again :");
            }
            else if(uc>cc)
            {
                System.out.println("This number is greater than computer's.\nTry again :");
            }
        }
    }
}
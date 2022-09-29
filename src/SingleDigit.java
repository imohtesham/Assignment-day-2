import java.util.Scanner;

public class SingleDigit {
    public static void main(String[] args) {

        int Number;
        System.out.println("Please Enter a single digit number");
        Scanner sd = new Scanner(System.in);

        Number = sd.nextInt();
        if (Number==0)
        {
            System.out.println("Zero");
        }
        else if (Number==1)
        {
            System.out.println("One");
        }
        else if (Number==2)
        {
            System.out.println("Two");
        }
        else if (Number==3)
        {
            System.out.println("Three");
        }
        else if (Number==4)
        {
            System.out.println("Four");
        }
        else if (Number==5)
        {
            System.out.println("Five");
        }
        else if (Number==6)
        {
            System.out.println("Six");
        }
        else if (Number==7)
        {
            System.out.println("Seven");
        }
        else if (Number==8)
        {
            System.out.println("Eight");
        }
        else if (Number==9)
        {
            System.out.println("Nine");
        }
        else
        {
            System.out.println("Invalid please enter number with a single digit");
        }

    }
}

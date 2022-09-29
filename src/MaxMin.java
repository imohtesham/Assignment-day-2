import java.util.Scanner;

public class MaxMin {
        public static void main(String[] args)
        {
            int a, b, c, minimum, max;
//object of the Scanner class
            Scanner sc = new Scanner(System.in);
//reading input from the user
            System.out.println("Enter the first number:");
            a = sc.nextInt();
            System.out.println("Enter the second number:");
            b = sc.nextInt();
            System.out.println("Enter the third number:");
            c = sc.nextInt();
            max = a+b*c ;
            minimum = a%b+c;
            System.out.println("Max number is: "+ max);
            System.out.println("Minimum number is: "+ minimum);
        }

}

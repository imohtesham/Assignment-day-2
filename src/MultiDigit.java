import java.util.Scanner;

public class MultiDigit {
    public static void main(String[] args) {
        int Number;
        System.out.println("Please Enter a single digit number");
        Scanner sd = new Scanner(System.in);

        Number = sd.nextInt();
        if(Number <= 9){
            System.out.println("Number value is in unit");
        }
        else if (Number <= 99){
            System.out.println("Number value is in ten");
        }
        else if(Number <= 999){
            System.out.println("Number value is in hundred");
        }
        else {
            System.out.println("Number value is over reached then value of unit ten hundred");
        }

    }
}

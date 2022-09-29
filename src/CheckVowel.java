import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {

        char ch;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter alphabet to check whether is a Vowel : ");
        ch=sc.nextLine().charAt(0);

        switch (ch){
            //check lower case vowel letters
            case 'a':
                System.out.println(ch+" is a vowel");
                break;

            case 'e':
                System.out.println(ch+" is a vowel");
                break;

            case 'i':
                System.out.println(ch+" is a vowel");
                break;

            case 'o':
                System.out.println(ch+" is a vowel");
                break;

            case 'u':
                System.out.println(ch+" is a vowel");
                break;
            default:
                System.out.println(ch+" is a consonant");
                break;

        }
    }
}

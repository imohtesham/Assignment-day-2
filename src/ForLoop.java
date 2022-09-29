public class ForLoop {
    public static void main(String[] args) {
            int N = 5;
            System.out.print("First " + N + " Numbers = ");

            // initialize the value of the variable i
            // with 1 and increment each time with 1
            for (int i = 1; i <= N; i++) {

                // print the value of the variable as
                // long as the code executes
                System.out.print(i + " ");
            }
            System.out.println("Sum of first " + N
                    + " Natural Number = " + (N*(N+1))/2);

    }
}

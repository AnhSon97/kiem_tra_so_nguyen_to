import java.util.Scanner;

public class check_prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int number = in.nextInt();
        if (number < 2){
            System.out.println("is not prime");
        } else {
            if (number == 2){
                System.out.println("is prime");
            } else {
                int i = 2;
                boolean check = true;
                while ( i <= Math.sqrt(number)){
                    if (number % i == 0){
                        check = false;
                        break;
                    }
                    i++;
                }
                if (check){
                    System.out.println("is prime");
                } else {
                    System.out.println("is not prime");
                }

            }
        }

    }
}

import java.util.Scanner;

class SmallestCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        boolean isSmallest = (number1 < number2 && number1 < number3);

        System.out.println("Is the first number the smallest? " + isSmallest);

        input.close();
    }
}

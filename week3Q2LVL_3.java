import java.util.Scanner;

class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year >= 1582 && 
           ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("The year " + year + " is a Leap Year");
        } 
        else if (year >= 1582) {
            System.out.println("The year " + year + " is not a Leap Year");
        } 
        else {
            System.out.println("Year should be >= 1582");
        }

        input.close();
    }
}

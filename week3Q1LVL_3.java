import java.util.Scanner;

class LeapYearIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year < 1582) {
            System.out.println("Year should be >= 1582");
        } 
        else {
            if (year % 400 == 0) {
                System.out.println("The year " + year + " is a Leap Year");
            } 
            else if (year % 100 == 0) {
                System.out.println("The year " + year + " is not a Leap Year");
            } 
            else if (year % 4 == 0) {
                System.out.println("The year " + year + " is a Leap Year");
            } 
            else {
                System.out.println("The year " + year + " is not a Leap Year");
            }
        }

        input.close();
    }
}

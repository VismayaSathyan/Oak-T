import java.util.Scanner;

public class DayOfTheWeekChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int day = sc.nextInt();
        printDay(day);
        System.out.println("This is if");
        System.out.print("Enter a Number: ");
        int days = sc.nextInt();
        printDay1(days);
    }
    static void printDay(int day){
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day"); break;

        }
    }
    static void printDay1(int days) {
        if (days == 1) {
            System.out.println("Monday");
        }
        else if (days == 2) {
            System.out.println("Tuesday");
        }

        else if (days == 3) {
            System.out.println("WEDNESDAY");
        }
        else if (days == 4) {
            System.out.println("Thursday");
        }
        else if (days == 5) {
            System.out.println("Friday");
        }
        else if (days == 6) {
            System.out.println("Saturday");
        }

        else if (days == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Day!");
        }
    }
}

import java.util.Scanner;

public class BasicCorePrograms {
    static Scanner scnr = new Scanner(System.in);

    static final float headOrTailCondition = 0.51f;

    public static void main(String[] args) {
        System.out.println("Welcome to Basic Core Programs!");

        BasicCorePrograms bcpObj = new BasicCorePrograms();
        //bcpObj.isHead();
        bcpObj.checkLeapYear();
    }

    public void isHead () {
        System.out.println("Enter number of times to Flip the coin : ");
        int userInput = scnr.nextInt();
        int head = 0;
        int tail = 0;
        int i = 0;

        while (userInput > i) {
            float randomNumber = (float)Math.random();

            if (randomNumber > headOrTailCondition) {
                head++;
            } else
                tail++;
            i++;
        }
        System.out.println("Head percentages count : " + getPercentage(head, userInput));
        System.out.println("Tail percentages count : " + getPercentage(tail, userInput));
    }

    public int getPercentage (double count, double total) {
        return (int) ((count / total) * 100);
    }

    public void checkLeapYear () {
        System.out.println("Enter Year to check Leap or not : ");
        int year = scnr.nextInt();
        int temp = year;
        int count = 0;

        while (temp != 0) {
            temp = temp /10;
            count++;
        }
        if (count == 4) {
            System.out.println("Year : " + year);
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println("Entered year i.e : " + year + " is a Leap year" );
            } else
                System.out.println("Entered year i.e : " + year + " is Not a Leap year" );
        } else
            System.out.println("Please enter a 4 digit number!");
    }
}
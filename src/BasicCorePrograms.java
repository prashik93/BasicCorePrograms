import java.util.Scanner;

public class BasicCorePrograms {
    static Scanner scnr = new Scanner(System.in);

    static final float headOrTailCondition = 0.51f;
    static final int FLIP_COIN = 1;
    static final int CHECK_LEAP_YEAR = 2;
    static final int POWER_OF_TWO = 3;

    public static void main(String[] args) {
        System.out.println("Welcome to Basic Core Programs!");
        System.out.println("1. Find Heads or Tails/n2. Check Leap Year/3. Power of Two");
        System.out.println("Enter which function you want to call : " );

        BasicCorePrograms bcpObj = new BasicCorePrograms();
        int userChoice = scnr.nextInt();
        switch (userChoice) {
            case FLIP_COIN ->
                bcpObj.isHead();
            case CHECK_LEAP_YEAR ->
                bcpObj.checkLeapYear();
            case POWER_OF_TWO ->
                bcpObj.powerOFTwo();
        }
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

    public void powerOFTwo() {
        System.out.println("Enter number for power of 2 : ");
        int userInput = scnr.nextInt();
        int powerOf = 2;
        for (int i = 1; i < userInput; i++) {
            if (i < 31) {
                int table = (int) Math.pow(powerOf, i);
                System.out.println("Power of Two is : " + table);
            }
        }
    }
}
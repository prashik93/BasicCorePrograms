import java.util.Scanner;

public class BasicCorePrograms {
    static Scanner scnr = new Scanner(System.in);

    static final float headOrTailCondition = 0.51f;
    static final int FLIP_COIN = 1;
    static final int CHECK_LEAP_YEAR = 2;
    static final int POWER_OF_TWO = 3;
    static final int HARMONIC_NUMBER = 4;
    static final int PRIME_FACTORS = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to Basic Core Programs!");
        System.out.println("""
                1. Find Heads or Tails
                2. Check Leap Year
                3. Power of Two
                4. Find Nth Harmonic Number
                5. Find Prime Factors""");
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
            case HARMONIC_NUMBER ->
                bcpObj.findHarmonicValue();
            case PRIME_FACTORS ->
                bcpObj.findPrimeFactors();
            default ->
                    System.out.println("Wrong Choice");
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

    public void findHarmonicValue () {
        System.out.println("Enter number which you want to find Nth Harmonic number : ");
        int userInput = scnr.nextInt();

        if (userInput > 0) {
            double harmonicNumber = 0;
            for (double i = 1; i <= userInput; i++) {
                harmonicNumber = harmonicNumber + (1 / i);
            }
            System.out.println(userInput + "th" + " Harmonic Value is : " + harmonicNumber);
        } else {
            System.out.println("Please enter positive numbers only.");
        }
    }

    public void findPrimeFactors () {
        System.out.println("Enter number to get its Prime Factors : " );
        int userInput = scnr.nextInt();
        System.out.print("Prime factors of " + userInput + " are : " );

        for (int i = 2; i*i <= userInput; i++) {
            while (userInput % i == 0) {
                System.out.print(i + " ");
                userInput = userInput / i;
            }
            System.out.println(userInput);
        }
    }
}
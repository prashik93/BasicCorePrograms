import java.util.Scanner;

public class BasicCorePrograms {
    static Scanner scnr = new Scanner(System.in);

    static final float headOrTailCondition = 0.51f;

    public static void main(String[] args) {
        System.out.println("Welcome to Basic Core Programs!");

        BasicCorePrograms bcpObj = new BasicCorePrograms();
        bcpObj.isHead();
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
}
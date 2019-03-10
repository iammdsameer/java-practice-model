package TimBuchalka;

import java.util.Scanner;

public class ReadUserInputChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = 0;
        int sum = 0;
        while(userInput != 10) {
            userInput++;
            System.out.print("Enter #" + userInput+": ");
            boolean checkInt = sc.hasNextInt();
            if (!checkInt) {
                System.out.println("! Please enter integers only");
                break;
            }
            int inputValue = sc.nextInt();
            sum += inputValue;
        }
        System.out.println("The Sum of All Numbers is " +sum + ".");
        sc.close();
    }
}

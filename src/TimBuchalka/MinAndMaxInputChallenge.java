package TimBuchalka;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = 0;
        int min = 2147483647;
        int max = -2147483648;
        while (true) {
            userInput++;
            System.out.print("Enter #" + userInput + ": ");
            boolean checkInt = sc.hasNextInt();
            if(!checkInt) {
                System.out.println("Min: "+min + " and Max: " +max);
                break;
            }
            int latestNumber = sc.nextInt();
            if(min > latestNumber) {
                min = latestNumber;
            }

            if(max < latestNumber) {
                max = latestNumber;
            }
        }
        sc.close();
    }
}

